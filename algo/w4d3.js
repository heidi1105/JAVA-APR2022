
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}


class SLLQueue{
	constructor(){
		this.front = null;
		this.rear = null;
	}

  /**
   * Returns whether or not this queue is empty.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @returns {boolean}
   */
	isEmpty(){}

  /**
   * Create a new node with the given data, push it to the back of this queue.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @param {any} item The new item to add to the back.
   * @returns {number} The new size of this queue.
   */
	enqueue(data){}

  /**
   * Removes and returns the first item of this queue.
   * - Time: O(n) linear, due to having to shift all the remaining items to
   *    the left after removing first elem.
   * - Space: O(1) constant.
   * @returns {any} The first item or undefined if empty.
   */
	dequeue(){}

  /**
   * Retrieves the first item without removing it.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @returns {any} The first item or undefined if empty.
   */
	front(){}


  /**
   * Retrieves the size of this queue.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @returns {number} The length.
   */
	size(){}

	// helper function
	printQueue(){
		var runner = this.front;
		if(this.front){
		console.log("FRONT: " + this.front.data)			
		}

		while(runner){
			console.log(runner.data)
			runner = runner.next
		}
		if(this.rear){
		console.log("REAR: " + this.rear.data)			
		}

	}

}


var q = new SLLQueue();
q.enqueue("a");
q.enqueue("b");
q.enqueue("b");
q.enqueue("a");
//q.printQueue();


