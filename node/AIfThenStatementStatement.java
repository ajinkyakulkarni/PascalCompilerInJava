/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AIfThenStatementStatement extends PStatement
{
    private PIfThenStatement _ifThenStatement_;

    public AIfThenStatementStatement()
    {
        // Constructor
    }

    public AIfThenStatementStatement(
        @SuppressWarnings("hiding") PIfThenStatement _ifThenStatement_)
    {
        // Constructor
        setIfThenStatement(_ifThenStatement_);

    }

    @Override
    public Object clone()
    {
        return new AIfThenStatementStatement(
            cloneNode(this._ifThenStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfThenStatementStatement(this);
    }

    public PIfThenStatement getIfThenStatement()
    {
        return this._ifThenStatement_;
    }

    public void setIfThenStatement(PIfThenStatement node)
    {
        if(this._ifThenStatement_ != null)
        {
            this._ifThenStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifThenStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ifThenStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ifThenStatement_ == child)
        {
            this._ifThenStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ifThenStatement_ == oldChild)
        {
            setIfThenStatement((PIfThenStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
