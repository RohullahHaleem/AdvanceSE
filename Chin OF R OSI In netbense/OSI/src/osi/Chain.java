
package osi;

/**
 *
 * @author RohullahHaleem
 */
public interface Chain {
    public void setNextChain(Chain nextChain);
    public void process(Data request);
}
