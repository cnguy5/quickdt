package quickdt;

import quickdt.Attributes;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: janie
 * Date: 6/26/13
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PredictiveModel extends Serializable {
    double getProbability(Attributes attributes, Serializable classification);

    public void dump(PrintStream printStream);

    Serializable getClassificationByMaxProb(Attributes attributes);
}
