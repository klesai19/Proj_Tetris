module com.example.proj_tetris {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proj_tetris to javafx.fxml;
    exports com.example.proj_tetris;
}