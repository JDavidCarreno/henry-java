package dao;

import model.TarjetaCreditoDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TarjetaCreditoDaoImpl implements TarjetaCreditoDao {
    private static final String  url = "jdbc:h2:~/test";
    private static final String username = "sa";
    private static final String password = "";
    @Override
    public List<TarjetaCreditoDTO> getAll() {
       List<TarjetaCreditoDTO> tarjetas = new ArrayList<>();
       try {
           Connection connection = DriverManager.getConnection(url, username, password);
           Statement statement = connection.createStatement();


           ResultSet resultSet = statement.executeQuery("SELECT numero, titular FROM tarjetascredito;");

           while (resultSet.next()) {
               TarjetaCreditoDTO tarjetaCreditoDTO = new TarjetaCreditoDTO();
               tarjetaCreditoDTO.setNumero(resultSet.getString("numero"));
               tarjetaCreditoDTO.setTitular(resultSet.getString("titular"));
               tarjetas.add(tarjetaCreditoDTO);
           }

       } catch (SQLException e){
            e.printStackTrace();
       }

       return tarjetas;
    }
}
