package FlyweightDesignPattern;

public class CharacterGlyph implements Glyph {

	private char symbol;

	public CharacterGlyph(char symbol) {
		this.symbol = symbol;
	}

	@Override
	public void render(int x, int y, String font) {
		System.out.println("Rendering '" + symbol + "' at (" + x + ", " + y + ") in font: " + font);
	}

}
