package org.botcat.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Collection {

	/**
	 * Collections Iterable -> Collections -> List ->
	 * {ArrayList,LinkedList,Vector,Stack}
	 */

	public static void main(String[] args) {

		// ArrayList
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterator<Integer> arraysIterator = arrayList.iterator();
		while (arraysIterator.hasNext()) {
			System.out.println(arraysIterator.next());
		}

		// LinkedList
		List<Integer> linkedList = new LinkedList<>(Arrays.asList(4, 5, 6));
		Iterator<Integer> linkedListIterator = linkedList.iterator();
		while (linkedListIterator.hasNext()) {
			System.out.println(linkedListIterator.next());
		}

		// Vectors
		List<Integer> vectorList = new Vector<>(Arrays.asList(7, 8, 9));
		Iterator<Integer> vectorListIterator = vectorList.iterator();
		while (vectorListIterator.hasNext()) {
			System.out.println(vectorListIterator.next());
		}

		// Stack
		Stack<Integer> stackList = new Stack<>();
		stackList.push(4);
		stackList.push(4);
		stackList.pop();
		Iterator<Integer> stackListIterator = stackList.iterator();
		while (stackListIterator.hasNext()) {
			System.out.println(stackListIterator.next());
		}

		/**Queue Interface -> PriorityQueue
		 * First come First Serve 
		 */
		Queue<Integer> queue = new PriorityQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		Iterator queueIterator = queue.iterator();
		while(queueIterator.hasNext()) {
			System.out.println("Priority Queue : "+queueIterator.next());
		}

		/**Deque Interface -> ArrayQueue
		 * Operations from Both end
		 */
		Deque<Integer> deque = new ArrayDeque();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		Iterator dequeIterator = deque.iterator();
		while(dequeIterator.hasNext()) {
			System.out.println(dequeIterator.next());
		}

		/**Set Interface ->{ hashset,Linked Hashset, ThreeSet} 
		 * 
		 */
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(1);
		hashSet.add(1);
		Iterator hashSetIterator = hashSet.iterator();
		while(hashSetIterator.hasNext()) {
			System.out.println(hashSetIterator.next());
		}
		
	   // SortedSet<data-type> set = new TreeSet();  




	}

}
