package it.azzalinferrati.ast.node.statement;

import java.util.ArrayList;

import it.azzalinferrati.ast.node.Node;
import it.azzalinferrati.ast.node.ReturnNode;
import it.azzalinferrati.semanticanalysis.Environment;
import it.azzalinferrati.semanticanalysis.SemanticError;

public class RetStatNode extends StatementNode {

    final private ReturnNode ret;

    public RetStatNode(final ReturnNode ret) {
        this.ret = ret;
    }

    @Override
    public String toPrint(String indent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Node typeCheck() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String codeGeneration() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        // TODO Auto-generated method stub
        return null;
    }
    
}