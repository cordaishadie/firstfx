package edu.guilford;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

// IndividiualPane is a class that extends one of the Pane classes
public class IndividualPane extends GridPane {
    // could have GridPane, TilePane, FlowPane, StackPane, BorderPane, AnchorPane, etc.
    // there organise the components we want to display in different ways

    // three String attributes
    // private String name;
    // private String email;
    // private String phone;

    // Individual attribute
    private Individual individual;

    // add a textfield for the name
    // add a textfield for the email
    // add a textfield for the phone
    private TextField nameField;
    private TextField emailField;
    private TextField phoneField;

    // add a submit button attribute
    private Button submitButton;

    // three label attributes for the name, email, and phone
    private Label nameLabel;
    private Label emailLabel;
    private Label phoneLabel;

    // constructor
    public IndividualPane(Individual individual) {
        // set the individual attribute
        this.individual = individual;

        // instantiate the submit button
        submitButton = new Button("Submit");

        // instantiate the textfields
        nameField = new TextField();
        emailField = new TextField();
        phoneField = new TextField();

        // instantiate the labels
        nameLabel = new Label("Name: " + individual.getName());
        emailLabel = new Label("Email: " + individual.getEmail());
        phoneLabel = new Label("Phone: " + individual.getPhone());

        // add the labels to the pane
        this.add(nameLabel, 0, 0);
        this.add(emailLabel, 0, 1);
        this.add(phoneLabel, 0, 2);

        // add the textfields to the pane
        this.add(nameField, 1, 0);
        this.add(emailField, 1, 1);
        this.add(phoneField, 1, 2);

        // add the submit button to the pane
        this.add(submitButton, 1, 3);

        // give the pane a border
        this.setStyle("-fx-border-color: black");
        // and a background color
        this.setStyle("-fx-background-color: lightgreen");

        // add a listener for the button that updates the labels
        submitButton.setOnAction(e -> {
            // set the name attribute of the individual
            individual.setName(nameField.getText());
            // set the email attribute of the individual
            individual.setEmail(emailField.getText());
            // set the phone attribute of the individual
            individual.setPhone(phoneField.getText());

            // update the labels
            nameLabel.setText("Name: " + individual.getName());
            emailLabel.setText("Email: " + individual.getEmail());
            phoneLabel.setText("Phone: " + individual.getPhone());
        });
    }
}
