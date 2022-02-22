package com.example.kiddiestories;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.kiddiestories.classes.Users;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class  profile extends AppCompatActivity {
    StorageReference storageReference;
    private static final int PICK_IMAGE_REQUEST = 1;
    Uri uri;
    FirebaseAuth mAuth;
    FirebaseUser users;
    DatabaseReference dbUpload;
    String _email, gEmail, fname, lname;
    String userID;
    TextView txtDisplay;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    DatabaseReference databaseReference;
    ProgressDialog progressDialog;
    Button tvName, tvEmail;
    String pic;
ImageView ivProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tvEmail = findViewById(R.id.tvEmail);
        ivProfile=findViewById(R.id.ivProfile);
        tvName = findViewById(R.id.tvName);
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        databaseReference = FirebaseDatabase.getInstance().getReference("users");
        progressDialog = new ProgressDialog(this);
        storageReference = FirebaseStorage.getInstance().getReference("uploads");
        getUser();
    }

    public void upload(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    private void uploadFile() {
        if (uri != null) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Uploading");
            progressDialog.setCancelable(false);
            progressDialog.show();

            String fileName = System.currentTimeMillis() + "." + getFileExtension(uri);

            //reduce image quality before saving start
            Bitmap bmp = null;
            try {
                bmp = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            bmp.compress(Bitmap.CompressFormat.JPEG, 25, bytes);
            byte[] fileInBytes = bytes.toByteArray();
            //reduce image quality before saving end

            StorageReference fileReference = storageReference.child(fileName);

            fileReference.putBytes(fileInBytes).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                    fileReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri fileUri) {

                            HashMap<String, Object> hashMap = new HashMap<>();
                            hashMap.put("photo", fileUri.toString());
                            dbUpload = FirebaseDatabase.getInstance().getReference("users").child(_email);
                            dbUpload.updateChildren(hashMap);
                            progressDialog.dismiss();

                            Toast.makeText(getApplicationContext(), "Upload successful!", Toast.LENGTH_SHORT).show();
                            getUser();
                            uri = null;
                        }
                    });
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    progressDialog.dismiss();
                    Toast.makeText(getApplicationContext(), e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                    double progress = (100.0 * snapshot.getBytesTransferred() / snapshot.getTotalByteCount());
                    progressDialog.setMessage("Progress: " + (int) progress + "%");

                }
            });
        } else {
            Toast.makeText(getApplicationContext(), "No file selected", Toast.LENGTH_SHORT).show();
        }
    }

    private String getFileExtension(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null) {
            uri = data.getData();
            uploadFile();
//            Glide.with(this).load(uri).into(ivPhoto);

        }
    }

    public void getUser() {

        Query checkUser = databaseReference.orderByChild("email");

        String email = firebaseUser.getEmail();

        checkUser.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                _email = email.replace(".com", "");
                gEmail = snapshot.child(_email).child("email").getValue(String.class);
                fname = snapshot.child(_email).child("fname").getValue(String.class);
                lname = snapshot.child(_email).child("lname").getValue(String.class);
                pic = snapshot.child(_email).child("photo").getValue(String.class);

                if (pic==null){

                }else {
                    Glide.with(getApplicationContext()).load(pic).into(ivProfile);
                }
                tvName.setText(fname + " " + lname);
                tvEmail.setText(gEmail);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                progressDialog.dismiss();
            }
        });
    }

    public void back(View view) {
        finish();
    }
}