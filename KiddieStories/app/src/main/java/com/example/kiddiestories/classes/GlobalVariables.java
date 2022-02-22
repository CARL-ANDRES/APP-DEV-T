package com.example.kiddiestories.classes;

import android.app.Application;

import com.example.kiddiestories.R;

import java.util.ArrayList;

public class GlobalVariables extends Application {

    public static ArrayList<Quiz> quizArrayList = new ArrayList<>();


    public ArrayList<Quiz> getQuiz1() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0, "What is the name of the King?", "Paul", "Shaun", "Paul");
        Quiz q2 = new Quiz(0, "Who is the youngest of their three siblings?", "Rose", "Isabelle", "Isabelle");
        Quiz q3 = new Quiz(0, "What is the name of the doll?", "Rose", "Jane", "Rose");
        Quiz q4 = new Quiz(0, "What is the name of the prince?", "Geoffrey", "Marcus", "Geoffrey");
        Quiz q5 = new Quiz(0, "Where does the three siblings live?", "Meadowhill", "Glora", "Glora");
        Quiz q6 = new Quiz(0, "Direction: Select if it is \"TRUE\" or \"FALSE\".        Isabelle was the Youngest?", "TRUE", "FALSE", "TRUE");
        Quiz q7 = new Quiz(0, "MEADOWHILL was the name of the kingdom of Prince Geoffrey?", "TRUE", "FALSE", "TRUE");
        Quiz q8 = new Quiz(0, "Hanna and Alex was the siblings of Isabelle?", "TRUE", "FALSE", "FALSE");
        Quiz q9 = new Quiz(0, "Jeffrey was the Prince of Kingdom Meadowhill?", "TRUE", "FALSE", "FALSE");
        Quiz q10 = new Quiz(0, "Paul was the King of the Kingdom of Glora?", "TRUE", "FALSE", "TRUE");
        Quiz q11 = new Quiz(0, "Was the Doll named Jane?", "TRUE", "FALSE", "TRUE");
        Quiz q12 = new Quiz(0, "Price Geoffrey start talking to rose?", "TRUE", "FALSE", "TRUE");
        Quiz q13 = new Quiz(0, "Juliette retorts she's not beautiful she's ugly Juliette tells to Prince Geoffrey?", "TRUE", "FALSE", "TRUE");
        Quiz q14 = new Quiz(0, "Rose and Juliette angry to isabelle?", "TRUE", "FALSE", "TRUE");
        Quiz q15 = new Quiz(0, "When Prince Geoffrey look at Isabelle he tell her she's very Beautiful?", "TRUE", "FALSE", "TRUE");

        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz2() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0, "What is inside the basket?", "Flowers", "Mushrooms", "Mushrooms");
        Quiz q2 = new Quiz(0, "When they heard the distinct of a __", "Train", "Truck", "Train");
        Quiz q3 = new Quiz(0, "What is her elder sister screaming/shouting?", "Come back", "Stay", "Come back");
        Quiz q4 = new Quiz(0, "The elder sister clasped her face with her trembling __?", "Feet", "Hand", "Hand");
        Quiz q5 = new Quiz(0, "What's the engine driver do?", "Sad", "Panick", "Panick");
        Quiz q6 = new Quiz(0, "Direction: Given below are some words from the Story.Select each word if it is \"NOUN\" or \"VERB\".        SCREAMING ", "NOUN", "VERB", "VERB");
        Quiz q7 = new Quiz(0, "SHOCK", "NOUN", "VERB", "VERB");
        Quiz q8 = new Quiz(0, "CRYING", "NOUN", "VERB", "VERB");
        Quiz q9 = new Quiz(0, "GIRL", "NOUN", "VERB", "NOUN");
        Quiz q10 = new Quiz(0, "WHISTLE", "NOUN", "VERB", "VERB");
        Quiz q11 = new Quiz(0, "TRACK", "NOUN", "VERB", "NOUN");
        Quiz q12 = new Quiz(0, "STREAMING", "NOUN", "VERB", "VERB");
        Quiz q13 = new Quiz(0, "HAPPINESS", "NOUN", "VERB", "NOUN");
        Quiz q14 = new Quiz(0, "PROMISE", "NOUN", "VERB", "NOUN");
        Quiz q15 = new Quiz(0, "CROSSED", "NOUN", "VERB", "NOUN");


        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz3() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0, "Once upon an time, there lived a beautiful princess called __?", "Snow White", "Cinderella", "Snow White");
        Quiz q2 = new Quiz(0, "As snow white explores the rest of the cottage, what did she find ?", "Tiny Beds", "Animals", "Tiny Beds");
        Quiz q3 = new Quiz(0, "When snow white wake up how many dwarfs did she saw ?", "7", "8", "7");
        Quiz q4 = new Quiz(0, "What did an old hag lady offer to snow white ?", "Apple", "Banana", "Apple");
        Quiz q5 = new Quiz(0, "Snow white and __ return to the kingdom and live happily ever after.", "King", "Prince", "Prince");
        Quiz q6 = new Quiz(0, "How many times did the queen try to kill her?", "1", "3", "3");
        Quiz q7 = new Quiz(0, "What kind of apple did the old hag tell Snow White the apple she picked was called?", "Loving apple", "Wishing apple", "Wishing apple");
        Quiz q8 = new Quiz(0, "When the seven dwarfs are seen for the first time, they are hard at work in the mine. What stones are they mining?", "Diamond & rubies", "Pearl & rubies", "Diamond & rubies");
        Quiz q9 = new Quiz(0, "Who is the good character?", "Cinderella", "Snow White", "Snow White");
        Quiz q10 = new Quiz(0, "Who is the bad character?", "The Evil Queen", "Snow White", "The Evil Queen");
        Quiz q11 = new Quiz(0, "Who eats the poison apple?", "Snow White", "Three Little Kittens", "Snow White");
        Quiz q12 = new Quiz(0, "Who saves Snow White?", "The Evil Queen", "The Prince", "The Prince");
        Quiz q13 = new Quiz(0, "How many bites of apple did snow white got?", "3", "2", "3");
        Quiz q14 = new Quiz(0, "Who gave her the apple?", "The Witch", "The Dwarf", "The Witch");
        Quiz q15 = new Quiz(0, "Which of these names of the dwarfs is incorrect?", "Stumpy", "Dopey", "Stumpy");

        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz4() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0, "What did ant searching for?", "Water", "Food", "Water");
        Quiz q2 = new Quiz(0, "To reach the Spring, she had to climb up a __", "Grass", "Wood", "Grass");
        Quiz q3 = new Quiz(0, "he __ quickly plucked a leaf and dropped it into the water near the struggling ant.", "Butterfly", "Dove", "Dove");
        Quiz q4 = new Quiz(0, "The __ dropped his net.", "Man", "Hunter", "Hunter");
        Quiz q5 = new Quiz(0, "The dove was quick to fly away to __.", "Safety", "Freely", "Safety");
        Quiz q6 = new Quiz(0, "The hot day made the Ant?", "Thirsty", "Sleepy", "Thirsty");
        Quiz q7 = new Quiz(0, "Are the ant and the dove friend?", "Yes, they are", "No, they aren't", "Yes, they are");
        Quiz q8 = new Quiz(0, "Who saved the ant?", "The Ant", "The Dove", "The Dove");
        Quiz q9 = new Quiz(0, "Why did the dove save the ant?", "He's kind-hearted", "He was there", "He's kind-hearted");
        Quiz q10 = new Quiz(0, "Did the ant thank the dove?", "Yes, it did", "No, it didn't", "Yes, it did");
        Quiz q11 = new Quiz(0, "What would happen to ant if it was not helped?", "The ant floated in the water", "The ant drowned in the water", "The ant drowned in the water");
        Quiz q12 = new Quiz(0, "A bird catcher was?", "Watching the Ant", "Hunting for Doves", "Hunting for Doves");
        Quiz q13 = new Quiz(0, "Where did they meet?", "Lake", "Ocean", "Lake");
        Quiz q14 = new Quiz(0, "When ant drinks water, he slip and fell down to the?", "River", "House", "River");
        Quiz q15 = new Quiz(0, "What does the dove drop to save the ant?", "A Paper", "A Leaf", "A Leaf");

        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz5() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0, "Who was the hungry that caught in the tree trunk.", "Fox", "Tiger", "Fox");
        Quiz q2 = new Quiz(0, "What is inside the hole?", "Package", "Plastic", "Package");
        Quiz q3 = new Quiz(0, "What is inside the Package?", "Burger", "Bread, Meat and Fruit", "Bread, Meat and Fruit");
        Quiz q4 = new Quiz(0, "The __ happily began to eat.", "Fox", "Woodcutter", "Fox");
        Quiz q5 = new Quiz(0, "The fox was very __ and __ ?", "Happy, Mad", "Sad, Upset", "Sad, Upset");
        Quiz q6 = new Quiz(0, "Direction: Given below are some words from the Story.Select each word if it is \"ADJECTIVE\" or \"ADVERB\".                                HUNGRY ", "ADJECTIVE", "ADVERB", "ADJECTIVE");
        Quiz q7 = new Quiz(0, "CAREFULLY", "ADJECTIVE", "ADVERB", "ADVERB");
        Quiz q8 = new Quiz(0, "BIG", "ADJECTIVE", "ADVERB", "ADJECTIVE");
        Quiz q9 = new Quiz(0, "LARGE", "ADJECTIVE", "ADVERB", "ADJECTIVE");
        Quiz q10 = new Quiz(0, "JUICY", "ADJECTIVE", "ADVERB", "ADJECTIVE");
        Quiz q11 = new Quiz(0, "HAPPILY", "ADJECTIVE", "ADVERB", "ADVERB");
        Quiz q12 = new Quiz(0, "UPSET", "ADJECTIVE", "ADVERB", "ADJECTIVE");
        Quiz q13 = new Quiz(0, "GLOOMILY", "ADJECTIVE", "ADVERB", "ADVERB");
        Quiz q14 = new Quiz(0, "TRUNK", "ADJECTIVE", "ADVERB", "ADJECTIVE");
        Quiz q15 = new Quiz(0, "FINISHED", "ADJECTIVE", "ADVERB", "ADJECTIVE");


        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz6() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0, "Who was the Faithful", "Dog", "Niel", "Dog");
        Quiz q2 = new Quiz(0, "Niel love to __ and he was so fond of forest.", "Travel", "Biking", "Travel");
        Quiz q3 = new Quiz(0, "What was Neil's son offered to the dog", "Biscuit", "Water", "Biscuit");
        Quiz q4 = new Quiz(0, "How many Hours that all the elders returned to the cottage?", "3", "5", "3");
        Quiz q5 = new Quiz(0, "The _ was located at the entrance of the dense forest.", "House", "Cottage", "House");
        Quiz q6 = new Quiz(0, "The Birthday of the ___ was celebrate grandly in the woods within beautiful nature.", "Boy", "Girl", "Boy");
        Quiz q7 = new Quiz(0, "The dog did not leave the boy even for a minute and they both become close ___.", "Pals", "Friend", "Pals");
        Quiz q8 = new Quiz(0, "The ___ did not leave the boy.", "Dog", "Cat", "Dog");
        Quiz q9 = new Quiz(0, "___ hit the dog with his gun and it was wounded badly.", "Niel", "Everyone", "Niel");
        Quiz q10 = new Quiz(0, "The next day, Neil, his ___ and others decided to go for hunting in the forest and arranged a babysitter to take care of the little for half day.", "Wife", "Son", "Wife");
        Quiz q11 = new Quiz(0, "The cottage was ___ and nobody was there.", "Close", "Open", "Open");
        Quiz q12 = new Quiz(0, "The ___ screamed in pain.", "Dog", "Cat", "Dog");
        Quiz q13 = new Quiz(0, "Neil's wife was shocked to see the ___ in the dog's mouth and she shouted.", "Spider", "Blood Stains", "Blood Stains");
        Quiz q14 = new Quiz(0, "They felt so ___ and offered first aid to the wounded dog.", "Bad", "Sad", "Bad");
        Quiz q15 = new Quiz(0, "Haste makes waste! Decisions made in hurry won't be ___.", "Helpful", "Kind", "Helpful");


        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz7() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0, "The monkey enjoyed his life as", "He ate only fruits", "He ate fruits of his choice", "He ate only fruits");
        Quiz q2 = new Quiz(0, "Where did the monkey lived in?", "On the bank of the river", "Inside the river", "On the bank of the river");
        Quiz q3 = new Quiz(0, "What did the monkey give to the crocodile for his wife?", "Some stones", "Some fruits", "Some fruits");
        Quiz q4 = new Quiz(0, "Who was appeared one day on the riverside?", "Tiger", "Crocodile", "Crocodile");
        Quiz q5 = new Quiz(0, "When did the crocodile tell the truth to monkey?", "At the end of the river", "In the middle of river", "In the middle of river");
        Quiz q6 = new Quiz(0, "What did the crocodile’s wife ask him to bring?", "To bring fruits for her", "To bring monkey’s heart", "To bring monkey’s heart");
        Quiz q7 = new Quiz(0, "The monkey was fortunate to find", "A monkey companion", "A companion in the crocodile’s wife", "A monkey companion");
        Quiz q8 = new Quiz(0, "How did the monkey go to the crocodile’s home?", "Rode on crocodile’s back", "Travelled in a boat", "Rode on crocodile’s back");
        Quiz q9 = new Quiz(0, "The crocodile’s wife was angry as the crocodile.", "Was drowning", "Was enjoying a bath in the river", "Was drowning");
        Quiz q10 = new Quiz(0, "Why was the monkey lonely?", "He did not like to talk with others", "There was no one lived around him", "There was no one lived around him");
        Quiz q11 = new Quiz(0, "When did the crocodile tell the truth to monkey?", "At the beginning", "In the middle of river", "In the middle of river");
        Quiz q12 = new Quiz(0, "The crocodile was unwilling to invite home.", "The birds and animals", "The villagers nearby", "The birds and animals");
        Quiz q13 = new Quiz(0, "The crocodile was foolish as?", "He carried the monkey to the river bank", "He told the monkey his secret", "He told the monkey his secret");
        Quiz q14 = new Quiz(0, "The monkey was?", "Foolish", "Sensible", "Sensible");
        Quiz q15 = new Quiz(0, "How was the monkey’s life on the tree?", "Happy and comfortable", "Happy but lonely", "Happy but lonely");

        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz8() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0,
                "Which character in the story played all day?",
                "Ant",
                "Grasshopper",
                "Grasshopper");
        Quiz q2 = new Quiz(0,
                "Who did the Grasshopper make fun of for working all day?",
                "Ant",
                "Other Grasshoppers",
                "Ant");
        Quiz q3 = new Quiz(0,
                "the Ant give the Grasshopper some food?",
                "Yes",
                "No",
                "Yes");
        Quiz q4 = new Quiz(0,
                "The next summer did the Grasshopper start storing food?",
                "Yes",
                "No",
                "Yes");
        Quiz q5 = new Quiz(0,
                "Why was the Ant storing food for?",
                "Summer",
                "Winter",
                "Winter");
        Quiz q6 = new Quiz(0, "What is the problem of the grasshopper in the story?", "He is lazy", "He is hungry", "He is hungry");
        Quiz q7 = new Quiz(0, "What is the main idea of the story?", "to work and save", "to be lazy and have fun", "to work and save");
        Quiz q8 = new Quiz(0, "What is the moral of the story?", "Don’t eat too much in summer ", "Think ahead and prepare for days of need", "Think ahead and prepare for days of need");
        Quiz q9 = new Quiz(0, "Which of the following is an important lesson we can learn from The Ant and The Grasshopper?", "The Grasshopper’s life is more fun and relaxed", "There’s a time for responsibility and a time to be carefree", "There’s a time for responsibility and a time to be carefree");
        Quiz q10 = new Quiz(0, "In The Ant and the Grasshopper, what event is coming that the Ant and his friends are gathering food for?", "Winter", "Summer", "Winter");
        Quiz q11 = new Quiz(0, "Based on the information in the clip, what is the best time to store food?", "Winter", "Summer", "Summer");
        Quiz q12 = new Quiz(0, "Who is diligent in the story?", "The Ant", "Grasshopper", "The Ant");
        Quiz q13 = new Quiz(0, "Who is lazy in the story?", "The Grasshopper", "Ant", "The Grasshopper");
        Quiz q14 = new Quiz(0, "What is the Grasshopper’s hobby?", "Playing guitar", "Singing", "Singing");
        Quiz q15 = new Quiz(0, "The Grasshopper lives in the?", "Wood", "Jungle", "Jungle");

        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz9() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0,
                "Two _ had been out mushroom picking.",
                "Sisters",
                "Brothers",
                "Sisters");
        Quiz q2 = new Quiz(0,
                "The little sister was about to cross it, when they heard the distinct horn of a _ ?",
                "Train",
                "Car",
                "Train");
        Quiz q3 = new Quiz(0,
                "What was inside the baskets?",
                "Food",
                "Mushrooms",
                "Mushrooms");
        Quiz q4 = new Quiz(0,
                "Who was got frightened and ran back ?",
                "Older sister",
                "Little sister",
                "Older sister");
        Quiz q5 = new Quiz(0,
                "What was the older sister screamed to her little sister ?",
                "\"Come back here, run back fast\"",
                "none",
                "\"Come back here, run back fast\"");
        Quiz q6 = new Quiz(0, "The Little ___ and Mushrooms.", "Girl", "Boy", "Girl");
        Quiz q7 = new Quiz(0, "Were on their home with heavy baskets full of ___.", "Mushrooms", "Apple", "Mushrooms");
        Quiz q8 = new Quiz(0, "It seemed that the little girl could not ___ her sister.", "See", "Hear", "Hear");
        Quiz q9 = new Quiz(0, "She was still concentrating on ___ over the track with her little feet, and hgolding on the basket.", "Stepping", "Jumping", "Stepping");
        Quiz q10 = new Quiz(0, "Then ___ tripped and fell on the track, scattering her mushrooms around.", "He", "She", "She");
        Quiz q11 = new Quiz(0, "The engine driver panicked on seeing the girl and blew his whistle with all his might, but she appeared not to hear the ___.", "Whistle", "Beep", "Whistle");
        Quiz q12 = new Quiz(0, "The ___ too panicked at the thought of the sight they would have to witness.", "Passengers", "Driver", "Passengers");
        Quiz q13 = new Quiz(0, "The big sister ran towards ___, tears streaming down her face.", "Him", "Her", "Her");
        Quiz q14 = new Quiz(0, "They hugged and kissed eaach other, crying out of ___, tears of joy flowing down their little cheeks.", "Happiness", "Sadness", "Happiness");
        Quiz q15 = new Quiz(0, "They were indeed ___ souls who had become wiser than their years, in the span of a few minutes.", "Two", "One", "Two");


        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz10() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0,
                "The mouse found several pieces of animal _ on the floor.",
                "Meat",
                "Poop",
                "Meat");
        Quiz q2 = new Quiz(0,
                "Who was fell asleep inside the den ?",
                "Mouse",
                "Lion",
                "Mouse");
        Quiz q3 = new Quiz(0,
                "What was the side of lion's gigantic character revealed",
                "Soft and Humble",
                "Helpful",
                "Soft and Humble");
        Quiz q4 = new Quiz(0,
                "As soon as the mouse came closer to the lion’s body, he felt the __ of the lion’s fur.",
                "Warmth",
                "Cold",
                "Warmth");
        Quiz q5 = new Quiz(0,
                "The lion __ the mouse get down and prevented the mouse from hurting himself.",
                "Leaved",
                "Helped",
                "Leaved");
        Quiz q6 = new Quiz(0, "The ___ of a Lion and a Mouse.", "Friendship", "Affection", "Friendship");
        Quiz q7 = new Quiz(0, "Later, it decided to eat the other pieces at night, so it stayed back in the den. Due to over ___, the mouse fell asleep inside the den.", "Eating", "Drinking", "Eating");
        Quiz q8 = new Quiz(0, "The ___ ate the entire piece of lamb it had brought and left the bones lying on the floor.", "Cat", "Lion", "Lion");
        Quiz q9 = new Quiz(0, "In ___ corner, the lion looked at the petty little mouse.", "One", "Other", "One");
        Quiz q10 = new Quiz(0, "That much food will be more than sufficient for the mouse and this will also keep his den stink-free and ___.", "Neat", "Tidy", "Tidy");
        Quiz q11 = new Quiz(0, "He could not resist the ___ smell of the meat and was extremely sorry for his action.", "Bad", "Good", "Good");
        Quiz q12 = new Quiz(0, "The lion told the mouse that he could ___ in the den only if he allowed the lion to sleep properly.", "Rest", "Stay", "Stay");
        Quiz q13 = new Quiz(0, "The lion saw that the mouse was fast asleep on his ___.", "Leg", "Neck", "Leg");
        Quiz q14 = new Quiz(0, "Seeing the lion’s nose so close up, the little creature was extremely terrified and tried to ___ off.", "Run", "Jump", "Jump");
        Quiz q15 = new Quiz(0, "This was the onset of a beautiful bond of friendship between the ___ mouse and the mighty lion.", "Little", "Tiny", "Tiny");

        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz11() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(R.drawable.apple,
                "What is in the picture?",
                "Apple",
                "Strawberry",
                "Apple");
        Quiz q2 = new Quiz(R.drawable.sun,
                "What is in the picture?",
                "Moon",
                "Sun",
                "Sun");
        Quiz q3 = new Quiz(R.drawable.igloo,
                "What is in the picture?",
                "House",
                "Igloo",
                "Igloo");
        Quiz q4 = new Quiz(R.drawable.train,
                "What is in the picture?",
                "Train",
                "Bus",
                "Train");
        Quiz q5 = new Quiz(R.drawable.yak,
                "What is in the picture?",
                "Cow",
                "Yak",
                "Yak");
        Quiz q6 = new Quiz(R.drawable.ball,
                "What is in the picture?",
                "Circle",
                "Ball",
                "Ball");
        Quiz q7 = new Quiz(R.drawable.zebra,
                "What is in the picture?",
                "Giraffe",
                "Zebra",
                "Zebra");
        Quiz q8 = new Quiz(R.drawable.whale,
                "What is in the picture?",
                "Whale",
                "Dolphine",
                "Whale");
        Quiz q9 = new Quiz(R.drawable.xylophone,
                "What is in the picture?",
                "Xylophone",
                "Lyre",
                "Xylophone");
        Quiz q10 = new Quiz(R.drawable.rabbit,
                "What is in the picture?",
                "Rat",
                "Rabbit",
                "Rabbit");
        Quiz q11 = new Quiz(R.drawable.pig,
                "What is in the picture?",
                "Pig",
                "Duck",
                "Pig");
        Quiz q12 = new Quiz(R.drawable.violin,
                "What is in the picture?",
                "Guitar",
                "Violin",
                "Violin");
        Quiz q13 = new Quiz(R.drawable.owl,
                "What is in the picture?",
                "Owl",
                "Bird",
                "Owl");
        Quiz q14 = new Quiz(R.drawable.queen,
                "What is in the picture?",
                "Queen",
                "Princess",
                "Queen");
        Quiz q15 = new Quiz(R.drawable.nest,
                "What is in the picture?",
                "Nest Box",
                "Nest",
                "Nest");
        Quiz q16 = new Quiz(R.drawable.mouse,
                "What is in the picture?",
                "Rat",
                "Mouse",
                "Mouse");
        Quiz q17 = new Quiz(R.drawable.lion,
                "What is in the picture?",
                "Lion",
                "Tiger",
                "Lion");
        Quiz q18 = new Quiz(R.drawable.joker,
                "What is in the picture?",
                "Joker",
                "Joke",
                "Joker");
        Quiz q19 = new Quiz(R.drawable.kangaroo,
                "What is in the picture?",
                "Rabbit",
                "Kangaroo",
                "Kangaroo");
        Quiz q20 = new Quiz(R.drawable.fox,
                "What is in the picture?",
                "Fox",
                "Mouse",
                "Fox");
        Quiz q21 = new Quiz(R.drawable.umbrella,
                "What is in the picture?",
                "Protection",
                "Umbrella",
                "Umbrella");
        Quiz q22 = new Quiz(R.drawable.hat,
                "What is in the picture?",
                "Hat",
                "Cup",
                "Hat");
        Quiz q23 = new Quiz(R.drawable.elephant,
                "What is in the picture?",
                "Horse",
                "Elephant",
                "Elephant");
        Quiz q24 = new Quiz(R.drawable.dog,
                "What is in the picture?",
                "Dog",
                "Cat",
                "Dog");
        Quiz q25 = new Quiz(R.drawable.car,
                "What is in the picture?",
                "Car",
                "Taxi",
                "Car");
        Quiz q26 = new Quiz(R.drawable.goat,
                "What is in the picture?",
                "Sheep",
                "Goat",
                "Goat");

        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);
        quizArrayList.add(q16);
        quizArrayList.add(q17);
        quizArrayList.add(q18);
        quizArrayList.add(q19);
        quizArrayList.add(q20);
        quizArrayList.add(q21);
        quizArrayList.add(q22);
        quizArrayList.add(q23);
        quizArrayList.add(q24);
        quizArrayList.add(q25);
        quizArrayList.add(q26);

        return quizArrayList;
    }

    public ArrayList<Quiz> getQuiz12() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0,
                "Match the uppercase letter\nC",
                "C",
                "B",
                "C");
        Quiz q2 = new Quiz(0,
                "Match the uppercase letter\nZ",
                "V",
                "Z",
                "Z");
        Quiz q3 = new Quiz(0,
                "Match the uppercase letter\nD",
                "G",
                "D",
                "D");
        Quiz q4 = new Quiz(0,
                "Match the uppercase letter\nA",
                "S",
                "A",
                "A");
        Quiz q5 = new Quiz(0,
                "Match the uppercase letter\nP",
                "P",
                "L",
                "P");
        Quiz q6 = new Quiz(0,
                "Match the uppercase letter\nB",
                "B",
                "D",
                "B");
        Quiz q7 = new Quiz(0,
                "Match the uppercase letter\nG",
                "E",
                "G",
                "G");
        Quiz q8 = new Quiz(0,
                "Match the uppercase letter\nF",
                "F",
                "Q",
                "F");
        Quiz q9 = new Quiz(0,
                "Match the uppercase letter\nE",
                "E",
                "L",
                "E");
        Quiz q10 = new Quiz(0,
                "Match the uppercase letter\nY",
                "P",
                "Y",
                "Y");
        Quiz q11 = new Quiz(0,
                "Match the uppercase letter\nK",
                "K",
                "C",
                "K");
        Quiz q12 = new Quiz(0,
                "Match the uppercase letter\nV",
                "U",
                "V",
                "V");
        Quiz q13 = new Quiz(0,
                "Match the uppercase letter\nQ",
                "O",
                "Q",
                "Q");
        Quiz q14 = new Quiz(0,
                "Match the uppercase letter\nM",
                "N",
                "M",
                "M");
        Quiz q15 = new Quiz(0,
                "Match the uppercase letter\nS",
                "S",
                "C",
                "S");
        Quiz q16 = new Quiz(0,
                "Match the uppercase letter\nX",
                "X",
                "Y",
                "X");
        Quiz q17 = new Quiz(0,
                "Match the uppercase letter\nU",
                "U",
                "V",
                "U");
        Quiz q18 = new Quiz(0,
                "Match the uppercase letter\nO",
                "O",
                "Q",
                "O");
        Quiz q19 = new Quiz(0,
                "Match the uppercase letter\nT",
                "T",
                "J",
                "T");
        Quiz q20 = new Quiz(0,
                "Match the uppercase letter\nR",
                "P",
                "R",
                "R");
        Quiz q21 = new Quiz(0,
                "Match the uppercase letter\nJ",
                "J",
                "L",
                "J");
        Quiz q22 = new Quiz(0,
                "Match the uppercase letter\nL",
                "J",
                "L",
                "L");
        Quiz q23 = new Quiz(0,
                "Match the uppercase letter\nI",
                "I",
                "l",
                "I");
        Quiz q24 = new Quiz(0,
                "Match the uppercase letter\nH",
                "H",
                "N",
                "H");
        Quiz q25 = new Quiz(0,
                "Match the uppercase letter\nW",
                "W",
                "V",
                "W");
        Quiz q26 = new Quiz(0,
                "Match the uppercase letter\nN",
                "N",
                "M",
                "N");


        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);
        quizArrayList.add(q16);
        quizArrayList.add(q17);
        quizArrayList.add(q18);
        quizArrayList.add(q19);
        quizArrayList.add(q20);
        quizArrayList.add(q21);
        quizArrayList.add(q22);
        quizArrayList.add(q23);
        quizArrayList.add(q24);
        quizArrayList.add(q25);
        quizArrayList.add(q26);


        return quizArrayList;

    }

    public ArrayList<Quiz> getQuiz13() {
        quizArrayList.clear();

        Quiz q1 = new Quiz(0,
                "Match the lowercase letter\nb",
                "C",
                "B",
                "B");
        Quiz q2 = new Quiz(0,
                "Match the lowercase letter\nv",
                "V",
                "Z",
                "V");
        Quiz q3 = new Quiz(0,
                "Match the lowercase letter\ng",
                "G",
                "D",
                "G");
        Quiz q4 = new Quiz(0,
                "Match the lowercase letter\na",
                "S",
                "A",
                "A");
        Quiz q5 = new Quiz(0,
                "Match the lowercase letter\np",
                "P",
                "L",
                "P");
        Quiz q6 = new Quiz(0,
                "Match the lowercase letter\nc",
                "C",
                "D",
                "C");
        Quiz q7 = new Quiz(0,
                "Match the lowercase letter\nd",
                "E",
                "D",
                "D");
        Quiz q8 = new Quiz(0,
                "Match the lowercase letter\nf",
                "F",
                "Q",
                "F");
        Quiz q9 = new Quiz(0,
                "Match the lowercase letter\ne",
                "E",
                "L",
                "E");
        Quiz q10 = new Quiz(0,
                "Match the lowercase letter\ny",
                "P",
                "Y",
                "Y");
        Quiz q11 = new Quiz(0,
                "Match the lowercase letter\nk",
                "K",
                "C",
                "K");
        Quiz q12 = new Quiz(0,
                "Match the lowercase letter\nz",
                "U",
                "Z",
                "Z");
        Quiz q13 = new Quiz(0,
                "Match the lowercase letter\nq",
                "O",
                "Q",
                "Q");
        Quiz q14 = new Quiz(0,
                "Match the lowercase letter\nm",
                "N",
                "M",
                "M");
        Quiz q15 = new Quiz(0,
                "Match the lowercase letter\ns",
                "S",
                "C",
                "S");
        Quiz q16 = new Quiz(0,
                "Match the lowercase letter\nx",
                "X",
                "Y",
                "X");
        Quiz q17 = new Quiz(0,
                "Match the lowercase letter\nu",
                "U",
                "V",
                "U");
        Quiz q18 = new Quiz(0,
                "Match the lowercase letter\no",
                "O",
                "Q",
                "O");
        Quiz q19 = new Quiz(0,
                "Match the lowercase letter\nt",
                "T",
                "J",
                "T");
        Quiz q20 = new Quiz(0,
                "Match the lowercase letter\nr",
                "P",
                "R",
                "R");
        Quiz q21 = new Quiz(0,
                "Match the lowercase letter\nj",
                "J",
                "L",
                "J");
        Quiz q22 = new Quiz(0,
                "Match the lowercase letter\nl",
                "J",
                "L",
                "L");
        Quiz q23 = new Quiz(0,
                "Match the lowercase letter\ni",
                "I",
                "l",
                "I");
        Quiz q24 = new Quiz(0,
                "Match the lowercase letter\nh",
                "H",
                "N",
                "H");
        Quiz q25 = new Quiz(0,
                "Match the lowercase letter\nw",
                "W",
                "V",
                "W");
        Quiz q26 = new Quiz(0,
                "Match the lowercase letter\nn",
                "N",
                "M",
                "N");


        
        quizArrayList.add(q1);
        quizArrayList.add(q2);
        quizArrayList.add(q3);
        quizArrayList.add(q4);
        quizArrayList.add(q5);
        quizArrayList.add(q6);
        quizArrayList.add(q7);
        quizArrayList.add(q8);
        quizArrayList.add(q9);
        quizArrayList.add(q10);
        quizArrayList.add(q11);
        quizArrayList.add(q12);
        quizArrayList.add(q13);
        quizArrayList.add(q14);
        quizArrayList.add(q15);
        quizArrayList.add(q16);
        quizArrayList.add(q17);
        quizArrayList.add(q18);
        quizArrayList.add(q19);
        quizArrayList.add(q20);
        quizArrayList.add(q21);
        quizArrayList.add(q22);
        quizArrayList.add(q23);
        quizArrayList.add(q24);
        quizArrayList.add(q25);
        quizArrayList.add(q26);

        return quizArrayList;
    }

}
