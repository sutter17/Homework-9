import java.awt.Color;

public class DisjointSetForest {
	Node[][] forest;
	public DisjointSetForest(Color[][] rgbArray) {
		for(int r = 0; r < rgbArray.length;r++) {
			for(int c = 0; c < rgbArray[0].length;c++) {
				forest[r][c] = new Node(new Pixel(r,c,rgbArray[r][c]));
			}
			
		}
	}
	public Node node(Pixel pixel) {
		return forest[pixel.getRow()][pixel.getCol()];
	}
	public Node find(Node node) {
		if(node.parent!=null && node.parent != node) {
			return find(node.parent);
		}else {
			return node;
		}
	}
	public Pixel find(Pixel pixel) {
		Node node = forest[pixel.getRow()][pixel.getCol()];
		node.attatch(find(node));
		return node.parent.pixel;
	}
	public void Union(Pixel a, Pixel b) {
		find(node(b)).attatch(find(node(a)));
	}
	public void segment (int gran) {
		for (int row = 0; row < forest.length; row++) {
            for (int col = 0; col < forest[row].length; col++) {
                Pixel a = forest[row][col].pixel;
            	Pixel g = null;
                a.compareTo(g);
                
            }
        }
	}
}
