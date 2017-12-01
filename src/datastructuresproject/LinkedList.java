//----------------------------------------------------------------------
// LinkedList.java       by Dale/Joyce/Weems              Chapter 2
//
// Implements TLogInterface using a linked list 
// of LLNode<T> to hold the log strings.
//----------------------------------------------------------------------

package datastructuresproject;

import java.io.Serializable;


public class LinkedList <T> implements Serializable
{
    
	protected LLNode<T> log; // reference to first node of linked
								// list that holds the TLog strings
	protected T name; // name of this TLog

	public LinkedList(T name)
	// Instantiates and returns a reference to an empty TLog object
	// with name "name".
	{
		log = null;
		this.name = name;
	}

	public void insert(T element)
	// Precondition: This TLog is not full.
	//
	// Places element into this TLog.
	{
		LLNode<T> newNode = new LLNode<T>(element);
		newNode.setLink(log);
		log = newNode;
	}

	// inserts into the last position of linked list
	public void insertLast(T element) {
		LLNode<T> temp = log;
		if (log == null) {
			insert(element);
		}
		while (temp.getLink() != null) {
			temp = temp.getLink();
		}
		temp.setLink(new LLNode<T>(element));

	}

	// checks to see if the contents of linked lists are equivalent
	public boolean equals(LinkedList compLog) {
		return this.toStringContents().equals(compLog.toStringContents());
	}

	public boolean isFull()
	// Returns true if this TLog is full, false otherwise.
	{
		return false;
	}

	public int size()
	// Returns the number of Ts in this TLog.
	{
		int count = 0;
		LLNode<T> node;
		node = log;
		while (node != null) {
			count++;
			node = node.getLink();
		}
		return count;
	}

	public boolean contains(T element)
	// Returns true if element is in this TLog,
	// otherwise returns false.
	// Ignores case difference when doing string comparison.
	{
		LLNode<T> node;
		node = log;

		while (node != null) {
			if (element.equals(node)) // if they match
				return true;
			else
				node = node.getLink();
		}

		return false;
	}

	public void clear()
	// Makes this TLog empty.
	{
		log = null;
	}

	public T getName()
	// Returns the name of this TLog.
	{
		return name;
	}

	public String toString()
	// Returns a nicely formatted string representing this TLog.
	{
		String logT = "Log: " + name + "\n\n";
		LLNode<T> node;
		node = log;
		int count = 0;

		while (node != null) {
			count++;
			logT = logT + count + ". " + node.getInfo() + "\n";
			node = node.getLink();
		}

		return logT;
	}

	public String toStringContents()
	// Returns a nicely formatted string representing this TLog.
	{
		String logT = "";
		LLNode<T> node;
		node = log;
		int count = 0;
		if (node == null)
			return "empty";
		while (node != null) {
			count++;
			logT = logT + count + ". " + node.getInfo() + "\n";
			node = node.getLink();
		}

		return logT;

	}

	public void removeFirst() {
		if (log == null)
			return;
		log = log.getLink();
	}
}