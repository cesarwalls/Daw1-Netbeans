/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesar.ejemplo;

/**
 *
 * @author cesar
 */
public class Tablero {

    protected Pieza[][] tablero;

    public Tablero(Pieza[][] tablero) {
        this.tablero = tablero;
    }
    
     public Tablero() {
        tablero = new Pieza[8][8];
        tablero[0][0] = new Torre(1);
        tablero[0][7] = new Torre(1);
        tablero[7][7] = new Torre(0);
        tablero[7][0] = new Torre(0);
        tablero[0][1] = new Caballo(1);
        tablero[0][6] = new Caballo(1);
        tablero[7][1] = new Caballo(0);
        tablero[7][6] = new Caballo(0);
        tablero[0][2] = new Alfil(1);
        tablero[0][5] = new Alfil(1);
        tablero[7][2] = new Alfil(0);
        tablero[7][5] = new Alfil(0);
        tablero[0][3] = new Rey(1);
        tablero[7][3] = new Rey(0);
        tablero[0][4] = new Dama(1);
        tablero[7][4] = new Dama(0);
        
         for (int i = 0; i < tablero.length; i++) {
             for (int j = 0; j < tablero.length; j++) {
                 if (i == 1){
                 tablero[i][j] = new Peon(1);
             } 
                 else if (i == 6) {
                     tablero[i][j] = new Peon(0);
                 }
             }
         }
        
    }
    public void pintarTablero(){
        System.out.println(" A  B  C  D  E  F  G  H");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i+1));
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j]!= null)
                    System.out.print(tablero[i][j].nombre+ " ");
                else
                    System.out.print("  ");
                
            }
            System.out.println("");
        }
    
    
    }
    public void ponPieza (Posicion pos, Pieza pieza){
        ponPieza(pos.fila, pos.columna, pieza);
    }
    public void ponPieza (int fila,int columna, Pieza pieza){
        tablero[fila][columna]= pieza;
    }
    public void quitaPieza (Posicion pos){
        quitaPieza(pos.fila, pos.columna);
    }
    public void quitaPieza (int fila,int columna){
        tablero[fila][columna]= null;
    }
    
    public Pieza devuelvePieza(Posicion pos){
        return devuelvePieza(pos.fila, pos.columna);
    }
    public Pieza devuelvePieza(int fila, int columna){
        return tablero[fila][columna];
    }
    public boolean hayPieza(Posicion pos){
        return hayPieza(pos.fila, pos.columna);
    }
    public boolean hayPieza(int fila, int columna){
        return tablero[fila][columna]!=null;
    }
    
    
    public void mover(Movimiento mov){
        tablero[mov.posFinal.fila][mov.posFinal.columna]= tablero[mov.posInicial.fila][mov.posInicial.columna];
        tablero[mov.posInicial.fila][mov.posInicial.columna]= null;
    }
    
    public void mover2(Movimiento mov){//independizar código de almacenamiento
        ponPieza(mov.posFinal, devuelvePieza(mov.posInicial));
        quitaPieza(mov.posInicial);
    }
    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + '}';
    }
    

}
