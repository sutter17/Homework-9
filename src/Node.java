public class Node {
	public Pixel pixel;
	Node parent;
	double weight;

	public Node(Pixel pixel) {
		this.pixel = pixel;
		this.parent = null; 
	}
	public void attatch(Node a) {
		Edge edge = new Edge(this.pixel,a.pixel);
		if(edge.getWeight()>weight) {
			weight = edge.getWeight();
		}
	}

}
