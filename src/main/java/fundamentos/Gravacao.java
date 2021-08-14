package fundamentos;

import com.opencsv.CSVWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {
    public static void main(String[] args) throws IOException {
        String[] cabecalho = {"nome", "idade", "telefone"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Beatriz", "29", "11 99999-9999"});
        linhas.add(new String[]{"Joana Darque", "100", "14 12345-6789"});
        linhas.add(new String[]{"Napoleao Bonapart", "90", "15 98765-4321"});
        linhas.add(new String[]{"Lincon", "70", "21 11111-1111"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv"));
        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);

        escritorCSV.flush();
        escritorCSV.close();
    }
}
