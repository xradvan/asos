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
public class Calculator {
    private DataIfc data;
    private OperationIfc operation;

    public Calculator(DataIfc data, OperationIfc operation) {
        this.data = data;
        this.operation = operation;
    }
    
    public int compute() {
        int result = operation.doOperation(data.getFirst(), data.getSecond());
        System.out.println(result);
        return result;
    }
}
