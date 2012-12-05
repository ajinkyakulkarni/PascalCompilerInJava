/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AWhileStatementNoShortIf extends PStatementNoShortIf
{
    private PWhileStatementNoShortIf _whileStatementNoShortIf_;

    public AWhileStatementNoShortIf()
    {
        // Constructor
    }

    public AWhileStatementNoShortIf(
        @SuppressWarnings("hiding") PWhileStatementNoShortIf _whileStatementNoShortIf_)
    {
        // Constructor
        setWhileStatementNoShortIf(_whileStatementNoShortIf_);

    }

    @Override
    public Object clone()
    {
        return new AWhileStatementNoShortIf(
            cloneNode(this._whileStatementNoShortIf_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileStatementNoShortIf(this);
    }

    public PWhileStatementNoShortIf getWhileStatementNoShortIf()
    {
        return this._whileStatementNoShortIf_;
    }

    public void setWhileStatementNoShortIf(PWhileStatementNoShortIf node)
    {
        if(this._whileStatementNoShortIf_ != null)
        {
            this._whileStatementNoShortIf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._whileStatementNoShortIf_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._whileStatementNoShortIf_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._whileStatementNoShortIf_ == child)
        {
            this._whileStatementNoShortIf_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._whileStatementNoShortIf_ == oldChild)
        {
            setWhileStatementNoShortIf((PWhileStatementNoShortIf) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
