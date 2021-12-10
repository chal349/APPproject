package controller;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Reports implements Initializable {

    @FXML
    private Button appointmentsButton;

    @FXML
    private Button customersButton;

    @FXML
    private Button reportsButton;

    @FXML
    private Tab allAppointmentsTab;

    @FXML
    private TableView<?> allTableView;

    @FXML
    private TableColumn<?, ?> allType_col;

    @FXML
    private TableColumn<?, ?> allMonth_col;

    @FXML
    private TableColumn<?, ?> allNumber_col;

    @FXML
    private Tab contactScheduleTab;

    @FXML
    private TableView<?> contactTableView;

    @FXML
    private TableColumn<?, ?> contactContact_col;

    @FXML
    private TableColumn<?, ?> contactAppID_col;

    @FXML
    private TableColumn<?, ?> contactTitle_col;

    @FXML
    private TableColumn<?, ?> contactType_col;

    @FXML
    private TableColumn<?, ?> contactDescription_col;

    @FXML
    private TableColumn<?, ?> contactDate_col;

    @FXML
    private TableColumn<?, ?> contactStart_col;

    @FXML
    private TableColumn<?, ?> contactEnd_col;

    @FXML
    private TableColumn<?, ?> contactCustID_col;

    @FXML
    private Tab userScheduleTab;

    @FXML
    private TableView<?> UserTableView;

    @FXML
    private TableColumn<?, ?> userUserID_col;

    @FXML
    private TableColumn<?, ?> userAppID_col;

    @FXML
    private TableColumn<?, ?> userCustomerID_col;

    @FXML
    private TableColumn<?, ?> userTitle_col;

    @FXML
    private TableColumn<?, ?> userDescription_col;

    @FXML
    private TableColumn<?, ?> userDate_col;

    @FXML
    private TableColumn<?, ?> userStart_col;

    @FXML
    private TableColumn<?, ?> userEnd_col;

    @FXML
    private Button logoutButton;

    @FXML
    private Label headerText;

    @FXML
    void onActionAppointmentsScreen(ActionEvent event) {

    }

    @FXML
    void onActionCustomersScreen(ActionEvent event) {

    }

    @FXML
    void onActionLogout(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
