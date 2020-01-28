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
public class OperationMul implements OperationIfc {

    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
    
}
