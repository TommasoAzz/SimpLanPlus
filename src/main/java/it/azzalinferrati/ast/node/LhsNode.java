package it.azzalinferrati.ast.node;

import it.azzalinferrati.semanticanalysis.Environment;
import it.azzalinferrati.semanticanalysis.SemanticError;

import java.util.ArrayList;

public class LhsNode implements Node{
    final private String id;
    final private LhsNode lhs;

    public LhsNode(String id, LhsNode lhs) {
        this.id = id;
        this.lhs = lhs;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toPrint(String indent) {
        return null;
    }

    @Override
    public Node typeCheck() {
        return null;
    }

    @Override
    public String codeGeneration() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        return null;
    }
}
