module Pizza {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	
	opens pizza to javafx.graphics, javafx.fxml;
}