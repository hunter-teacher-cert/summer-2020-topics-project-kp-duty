import java.util.LinkedList;

public class Blockchain {
	
	private LinkedList<Block> chain;
	
	public Blockchain() {
		this.chain = new LinkedList<Block>();
	}
	
	public Blockchain(Block firstBlock) {
		this();
		chain.push(firstBlock);
	}
	
	public Block getLastBlock() {
		return this.chain.peek();
	}
	
	public int getLastIndex() {
		return this.chain.peek().getIndex();
	}
	
	public void addBlock(Block newBlock) {
		//verify
		this.chain.push(newBlock);
	}
	
	//miners need to get previousHash to create a new Block
	public String getLastHash() {
		return this.chain.peek().getHash();
	}
}//end of class