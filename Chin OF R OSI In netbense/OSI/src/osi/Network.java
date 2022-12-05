/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osi;

/**
 *
 * @author RohullahHaleem
 */
public class Network implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Network header is added
            // Called packet
            request.addData("+NetworkHeader");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
