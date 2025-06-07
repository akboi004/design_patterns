package FlyweightDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		GlyphFactory glyphFactory = new GlyphFactory();

		String text = "abac";
		int x = 0;

		for (char c : text.toCharArray()) {
			Glyph glyph = glyphFactory.getGlyph(c);
			glyph.render(x, 10, "Aerial");
			x += 10;
		}
	}
}
