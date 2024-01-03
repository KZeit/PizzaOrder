package pizza;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class PizzaOrderAppController implements Initializable
{
	    @FXML
	    private Label lblSize;	    
	    @FXML
	    private ChoiceBox<String> cbSize;
	    private final String[] sizeItems = {"Small", "Medium", "Large"};
	    private final ObservableList<String> sizeList = FXCollections.observableArrayList(sizeItems);

	    @FXML
	    private Label lblQuantity;
	    @FXML
	    private TextField tfQuantity;

	    @FXML
	    private Label lblType;
	    @FXML
	    private RadioButton rdbtMeat;
	    @FXML
	    private RadioButton rdbtHawaiian;
	    @FXML
	    private RadioButton rdbtVegetarian;
	    
	    @FXML
	    private Button btnOrder;
	    @FXML
	    private Button btnReset;

	    @FXML
	    private TextArea taSalesSummary;
	    @FXML
	    private TextArea taSummary;
	    
	 	@FXML
	    private Button btnCalculateSales;
	    
	    @Override
	    public void initialize(URL url, ResourceBundle rb) 
	    {
	        // TODO
	        cbSize.setItems(sizeList);
	    }    

	    @FXML
	    private void btnOrder_Clicked(ActionEvent event) 
	    {
	        Pizza pizza = new Pizza();
	        
	        if (rdbtMeat.isSelected())
	        {
	            pizza.setType(1);
	            pizza.setSize(cbSize.getSelectionModel().getSelectedIndex());
	            pizza.setPrice(13.99);
	            pizza.setQuantity(Integer.parseInt(tfQuantity.getText()));
	            taSummary.appendText("Type: " + rdbtMeat.getText() + "\nPrice: $" + pizza.getPrice() + "\nQuantity: " + pizza.getQuantity() + "\nSize: " + pizza.getSize()  + "\n------------" + "\nTotal: $" + pizza.getTotal());	            
	        } 
	        else if (rdbtHawaiian.isSelected())
	        {
	            pizza.setType(2);
	            pizza.setSize(cbSize.getSelectionModel().getSelectedIndex());
	            pizza.setPrice(21.50);
	            pizza.setQuantity(Integer.parseInt(tfQuantity.getText()));
	            taSummary.appendText("Type: " + rdbtHawaiian.getText() + "\nPrice: $" + pizza.getPrice() + "\nQuantity: " + pizza.getQuantity() + "\nSize: " + pizza.getSize()  + "\n------------" + "\nTotal: $" + pizza.getTotal());	 

	        } 
	        else if (rdbtVegetarian.isSelected())
	        {
	            pizza.setType(3);
	            pizza.setSize(cbSize.getSelectionModel().getSelectedIndex());
	            pizza.setPrice(16.95);
	            pizza.setQuantity(Integer.parseInt(tfQuantity.getText()));
	            taSummary.appendText("Type: " + rdbtVegetarian.getText() + "\nPrice: $" + pizza.getPrice() + "\nQuantity: " + pizza.getQuantity() + "\nSize: " + pizza.getSize()  + "\n------------" + "\nTotal: $" + pizza.getTotal());	 

	        } 
	        else {
	            taSummary.appendText("---Please select a Pizza!---\n");
	        }
	    }

	    @FXML
	    private void btnReset_Clicked(ActionEvent event) 
	    {
	    	rdbtMeat.setSelected(false);
	        rdbtHawaiian.setSelected(false);
	        rdbtVegetarian.setSelected(false);
	        tfQuantity.setText(null);
	        cbSize.setValue(null);
	        taSummary.setText(null);
	    }
}