package webdsl.epackage.pkgdsl.ide;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
//import org.xtext.example.mydsl.myDsl.Model;
//import org.xtext.example.mydsl.services.MyDslGrammarAccess;

import com.google.inject.Inject;
import org.eclipse.xtext.resource.XtextResource;

//import persons.tasks3.merger.mdsl.mergerDsl.Person;
//import persons.tasks3.merger.mdsl.mergerDsl.Planning;
import webdsl.epackage.pkgdsl.pkgDsl.File;
import webdsl.epackage.pkgdsl.services.PkgDslGrammarAccess;

public class PkgDslSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	
	public static class PkgDslHighlightingStyles implements HighlightingStyles {
		public static String KEYWORD_RED_ID = KEYWORD_ID + "GREEN";
	}

	@Inject
	PkgDslGrammarAccess ga;

	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,CancelIndicator cancelIndicator) { //String prev="abc"; //boolean flag=true;
		if (object instanceof File) {
			Keyword keyword = ga.getAge_ConstraintAccess().getAgeConstraintKeyword_1();
			for (ILeafNode n : NodeModelUtils.findActualNodeFor(object).getLeafNodes()) {					
				//System.out.println("n.getGrammarElement(): "+ n.getSemanticElement()+"..."+n.getOffset()+"..."+n.getLength());

				if (keyword == n.getGrammarElement()) { 
					//System.out.println("n.getSemanticElement(): "+ (Person)n.getSemanticElement());
					//Person p=(Person)n.getSemanticElement();
					
					System.out.println("I AM INSIDE HIGHLIGHTENING  "+ n.getGrammarElement());//.getName());
					//if (p.getName().contains(prev))
					acceptor.addPosition(n.getOffset()+n.getLength(), 10, PkgDslHighlightingStyles.KEYWORD_RED_ID);
					//else prev=p.getName();
				}
			}
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}
// @Override
/*   public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor)
   {
      if (resource == null || resource.getParseResult() == null)
         return;

      INode root = resource.getParseResult().getRootNode();
      for (INode node : root.getAsTreeIterable())
      {
         if (node.getSemanticElement() instanceof DocCommentElement)
         {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                  MyHighlightingConfiguration.DOCUMENTATION_COMMENT_ID);
         }
      }
   }*/
}

