/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetblayfem.vista;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author niorb
 */
public class TablaPosiciones extends AbstractTableModel {
    // Define las columnas de la tabla
    private final String[] columnNames = {"Equipo", "PJ", "GOL", "+/-", "PTS"};
    
    // Los datos de la tabla, donde cada fila representa un equipo y sus estadísticas
    private final Object[][] data = {
            {"América", 16, "43:8", 35, 40},
            {"Santa Fe", 16, "33:12", 21, 35}
    };

    /**
     * Obtiene el número de filas en la tabla.
     *
     * @return El número de filas en la tabla.
     */
    @Override
    public int getRowCount() {
        return data.length;
    }

    /**
     * Obtiene el número de columnas en la tabla.
     *
     * @return El número de columnas en la tabla.
     */
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    /**
     * Obtiene el valor en la celda especificada por la fila y la columna.
     *
     * @param rowIndex    El índice de la fila.
     * @param columnIndex El índice de la columna.
     * @return El valor en la celda especificada.
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
}
