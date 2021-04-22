package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

public class Controller {
    public TextField textFriendName;
    public TextField textAge;
    public TextField textCity;
    public ListView<Friend> listFriends = new ListView<>();
    public Label labelName;
    public Label labelAge;
    public Label labelCity;

    public void createFriend(ActionEvent actionEvent) {
        String name = textFriendName.getText();
        int age = Integer.parseInt(textAge.getText());
        String city = textCity.getText();
        Friend product = new Friend(name, age, city);
        listFriends.getItems().add(product);
        textFriendName.clear();
        textAge.clear();
        textCity.clear();
    }

    public void displayFriends(MouseEvent mouseEvent) {
        Friend product = listFriends.getSelectionModel().getSelectedItem();
        if(product == null){
            return;
        }
        labelName.setText("Name: " +product.getName());
        String age = Integer.toString(product.getAge());
        labelAge.setText("Age: " +age +" years old");
        String quantity = product.getCity();
        labelCity.setText("Lives in "+quantity);
    }

    public void deleteProduct(ActionEvent actionEvent) {
        Friend product = listFriends.getSelectionModel().getSelectedItem();
        if(product == null){
            return;
        }
        listFriends.getItems().remove(product);
        labelName.setText("Name");
        labelAge.setText("Age");
        labelCity.setText("Location");
    }

    public void saveFriends(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = listFriends.getItems();
        for(Friend p : myList){
            p.writeToFile();
        }
        listFriends.getItems().clear();
    }

    public void loadFriends(ActionEvent actionEvent) throws IOException {
        listFriends.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.CreateAllFriends("friends.txt");
        for(Friend p: friends) {
            listFriends.getItems().add(p);
        }
    }
}
