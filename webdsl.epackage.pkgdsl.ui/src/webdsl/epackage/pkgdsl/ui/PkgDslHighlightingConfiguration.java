package webdsl.epackage.pkgdsl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import webdsl.epackage.pkgdsl.ide.PkgDslSemanticHighlightingCalculator.PkgDslHighlightingStyles;

public class PkgDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(PkgDslHighlightingStyles.KEYWORD_RED_ID, "KeywordRed", keywordRedTextStyle());
		super.configure(acceptor);
	}
	
	public TextStyle keywordRedTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

}