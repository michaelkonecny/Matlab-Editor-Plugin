package at.justin.matlab.meta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andreas Justin on 2016-09-12.
 */
public class MetaMethod extends Meta {
    protected String Access = "";
    protected String definingClass = "";
    protected boolean isStatic = false;
    protected boolean isAbstract = false;
    protected boolean isSealed = false;
    protected List<String> inputNames = new ArrayList<>(5);
    protected List<String> outputNames = new ArrayList<>(1);


    public MetaMethod() {
    }

    public void setAccess(String access) {
        Access = access;
    }

    public void setDefiningClass(String definingClass) {
        this.definingClass = definingClass;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public void setSealed(boolean sealed) {
        isSealed = sealed;
    }

    public void setInputNames(List<String> inputNames) {
        this.inputNames = inputNames;
    }

    public void setOutputNames(List<String> outputNames) {
        this.outputNames = outputNames;
    }

    public void addInputName(String string) {
        inputNames.add(string);
    }

    public void addOutputName(String string) {
        outputNames.add(string);
    }

    public String getAccess() {
        return Access;
    }

    public String getDefiningClass() {
        return definingClass;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public boolean isSealed() {
        return isSealed;
    }

    public List<String> getInputNames() {
        return inputNames;
    }

    public List<String> getOutputNames() {
        return outputNames;
    }
}
