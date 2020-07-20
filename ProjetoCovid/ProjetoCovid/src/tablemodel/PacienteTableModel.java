
package tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Paciente;

/**
 *
 * @author vinicius
 */
public class PacienteTableModel extends AbstractTableModel{
    ArrayList<Paciente> linhas;
   
    private String[] colunas = new String[]{"Código", "Nome", "E-mail", "Telefone"};
    //Cria vazio 
    public PacienteTableModel(){
        linhas = new ArrayList<>();
    }
    //Cria preenchido
    public PacienteTableModel(ArrayList<Paciente> pacientes){
        linhas = new ArrayList<>(pacientes);
    }
   
    //pega
    public Paciente getPaciente(int linha){
        return linhas.get(linha);
    }
    /**
     * Adiciona um paciente no model
     * @param paciente 
     */
    public void addPaciente(Paciente paciente){
        linhas.add(paciente);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    public void removePaciente(int linha){
        linhas.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    
    @Override
    public String getColumnName(int coluna){
     return colunas[coluna];
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente p = linhas.get(rowIndex);
         switch(columnIndex){
             case 0:
                 return p.getCodigo();
             case 1: 
                 return p.getNome();
             case 2:
                 return p.getEmail();
             case 3:
                 return p.getTelefone();
             default:
                 return ""; 
         }
    }
    
}
