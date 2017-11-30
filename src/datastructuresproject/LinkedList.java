//----------------------------------------------------------------------
// LinkedList.java       by Dale/Joyce/Weems              Chapter 2
//
// Implements StringLogInterface using a linked list 
// of LLNode to hold the log strings.
//----------------------------------------------------------------------

package datastructuresproject;

import java.io.Serializable;


public class LinkedList implements Serializable
{
    
	protected LLNode log; // reference to first node of linked
								// list that holds the StringLog strings
	protected String name; // name of this StringLog

	public LinkedList(String name)
	// Instantiates and returns a reference to an empty StringLog object
	// with name "name".
	{
		log = null;
		this.name = name;
	}

	public void insert(String element)
	// Precondition: This StringLog is not full.
	//
	// Places element into this StringLog.
	{
		LLNode newNode = new LLNode(element);
		newNode.setLink(log);
		log = newNode;
	}

	// inserts into the last position of linked list
	public void insertLast(String element) {
		LLNode temp = log;
		if (log == null) {
			insert(element);
		}
		while (temp.getLink() != null) {
			temp = temp.getLink();
		}
		temp.setLink(new LLNode(element));

	}

	// checks to see if the contents of linked lists are equivalent
	public boolean equals(LinkedList compLog) {
		return this.toStringContents().equals(compLog.toStringContents());
	}

	public boolean isFull()
	// Returns true if this StringLog is full, false otherwise.
	{
		return false;
	}

	public int size()
	// Returns the number of Strings in this StringLog.
	{
		int count = 0;
		LLNode node;
		node = log;
		while (node != null) {
			count++;
			node = node.getLink();
		}
		return count;
	}

	public boolean contains(String element)
	// Returns true if element is in this StringLog,
	// otherwise returns false.
	// Ignores case difference when doing string comparison.
	{
		LLNode node;
		node = log;

		while (node != null) {
			if (element.equalsIgnoreCase(node.getInfo())) // if they match
				return true;
			else
				node = node.getLink();
		}

		return false;
	}

	public void clear()
	// Makes this StringLog empty.
	{
		log = null;
	}

	public String getName()
	// Returns the name of this StringLog.
	{
		return name;
	}

	public String toString()
	// Returns a nicely formatted string representing this StringLog.
	{
		String logString = "Log: " + name + "\n\n";
		LLNode node;
		node = log;
		int count = 0;

		while (node != null) {
			count++;
			logString = logString + count + ". " + node.getInfo() + "\n";
			node = node.getLink();
		}

		return logString;
	}

	public String toStringContents()
	// Returns a nicely formatted string representing this StringLog.
	{
		String logString = "";
		LLNode node;
		node = log;
		int count = 0;
		if (node == null)
			return "empty";
		while (node != null) {
			count++;
			logString = logString + count + ". " + node.getInfo() + "\n";
			node = node.getLink();
		}

		return logString;

	}

	public void removeFirst() {
		if (log == null)
			return;
		log = log.getLink();
	}
}