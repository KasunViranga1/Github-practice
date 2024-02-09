module com.example.githubpractice {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens com.example.githubpractice to javafx.fxml;
    exports com.example.githubpractice;
}