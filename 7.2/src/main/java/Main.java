import dao.CurrencyDao;
import datasource.DBConnection;
import view.ConverterView;

public class Main {
    public static void main(String[] args) {
        ConverterView.launch(ConverterView.class);
        DBConnection.terminate();
    }
}
