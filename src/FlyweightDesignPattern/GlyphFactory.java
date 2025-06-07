package FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {

	private Map<Character, Glyph> glyphs = new HashMap<>();

	public Glyph getGlyph(char c) {
		if (!glyphs.containsKey(c)) {
			glyphs.put(c, new CharacterGlyph(c));
		}
		return glyphs.get(c);
	}
}
