//----------------------------------------------------------------------------
// LLNode.java            by Dale/Joyce/Weems                  Chapter 2
//
// Implements String nodes for a Linked List.
//----------------------------------------------------------------------------

package datastructuresproject;

import java.io.Serializable;

public class LLNode implements Serializable
{
  private String info;
  private LLNode link;
  
  public LLNode(String info)
  {
    this.info = info;
    link = null;
  }
 
  public void setInfo(String info)
  // Sets info string of this LLNode.
  {
    this.info = info;
  }

  public String getInfo()
  // Returns info string of this LLNode.
  {
    return info;
  }
 
  public void setLink(LLNode link)
  // Sets link of this LLNode.
  {
    this.link = link;
  }

  public LLNode getLink()
  // Returns link of this LLNode.
  {
    return link;
  }
}
 
 