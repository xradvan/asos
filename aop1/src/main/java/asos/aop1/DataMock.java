/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.aop1;

/**
 *
 * @author vsa
 */
public class DataMock implements DataIfc {

    @Override
    public int getFirst() {
        return 2;
    }

    @Override
    public int getSecond() {
        return 10;
    }
    
}
