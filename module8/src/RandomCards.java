/*
*Joel Avery 
*Module 8 
*CSD-405
04/22/23
*/

/*
This Java program displays four random card images from a zip file containing images of cards.
The program uses JavaFX for the GUI and loads the card images from the zip file into an ArrayList.
It then shuffles the ArrayList and takes the first four elements to display the random cards in a GridPane.
*/

import javafx.application.Application; //Base Class for JavaFx
import javafx.geometry.Insets; //Specifies the margins around a control
import javafx.scene.Scene; //represents the scene graph of a JavaFx application
import javafx.scene.image.Image; //represents an image in JavaFx
import javafx.scene.image.ImageView; //displays images in Java Fx
import javafx.scene.layout.GridPane; //arranges its children in a grid
import javafx.stage.Stage; //represents the primary Stage

import java.io.File; //represents a file or a directory
import java.io.IOException; //checked exception that can occur for I/O actions
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javafx.geometry.Pos;

public class RandomCards extends Application {

    //Declare a list of card images
    private ArrayList<Image> cardImages = new ArrayList<>();

    //Main method to launch the application
    public static void main(String[] args) {
        Application.launch(args); 
    }

    //Start method to initialize the application window
    @Override
    public void start(Stage primaryStage){

        //load images from the zip file
        loadImagesFromZipFile("src/AssignmentCards.zip");

        //shuffle the card images and take four random cards
        List<Image> randomCards = getFourRandomCards();

        //Create a grid pane to display the cards
        GridPane gridPane = new GridPane(); 
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10)); 
        gridPane.setAlignment(Pos.CENTER);

        //Create image views for the random cards and then add them to the grid
        displayCards(gridPane, randomCards); 

        //Create a scene with the grid pane and display it in the stage
        Scene scene = new Scene(gridPane); 
        primaryStage.setScene(scene);
        primaryStage.setTitle("Card Game");
        primaryStage.show(); 
    }

    //Method to load card images from a zip file
    public void loadImagesFromZipFile(String zipFilePath) {
        try {
            //Open the zip file
            ZipFile zipFile = new ZipFile(zipFilePath); 

            //Loop through each entry in the zip file
            zipFile.stream().forEach(entry -> {
                try {
                    //If the entry is not a directory and ends with ".png"
                    if (!entry.isDirectory() && entry.getName().endsWith(".png")) {

                        //Load Image from zip entry and add it to cardImages List
                        Image image = new Image(zipFile.getInputStream(entry));
                        cardImages.add(image); 
                    }
                } catch(IOException e) {
                    e.printStackTrace(); 
                }
            });

            //Close the zip file
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to shuffle the card images and return a list of four random cards
    public List<Image> getFourRandomCards() {
        //Shuffle the card images
        Collections.shuffle(cardImages);

        //Take the first four cards
        return cardImages.subList(0, 4); 
    }

    //Method to display the four random cards in a grid
    public void displayCards(GridPane gridPane, List<Image> cards) {
        //Create ImageView objects for each card
        ImageView card1 = new ImageView(cards.get(0)); 
        ImageView card2 = new ImageView(cards.get(1)); 
        ImageView card3 = new ImageView(cards.get(2)); 
        ImageView card4 = new ImageView(cards.get(3));

        //Add the ImageView objects to the grid pane
        gridPane.add(card1, 0,0); 
        gridPane.add(card2, 1,0); 
        gridPane.add(card3, 2,0); 
        gridPane.add(card4, 3,0); 
    }
}
