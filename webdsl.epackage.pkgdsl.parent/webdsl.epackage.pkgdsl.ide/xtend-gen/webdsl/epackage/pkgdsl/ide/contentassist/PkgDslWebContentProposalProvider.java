/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package webdsl.epackage.pkgdsl.ide.contentassist;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import webdsl.epackage.pkgdsl.services.PkgDslGrammarAccess;
import webdsl.epackage.pkgdsl.xml_context;

@SuppressWarnings("all")
public class PkgDslWebContentProposalProvider extends IdeContentProposalProvider {
  @Inject
  @Extension
  private PkgDslGrammarAccess _pkgDslGrammarAccess;
  
  @Inject
  private PkgDslTemplateProposalProvider templateProvider;
  
  private xml_context t = new xml_context();
  
  private ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>(xml_context.size);
  
  /**
   * override dispatch createProposals(RuleCall ruleCall, ContentAssistContext context,
   * IIdeContentProposalAcceptor acceptor)
   * { System.out.println("ruleCall : "+ruleCall.rule.name);
   * if (ruleCall.rule.name.equals("Nested_Package"))
   * {System.out.println("I AM INSIDE IF STATEMENT :");
   * arr = t.parse();
   * System.out.println(" array size"+arr.get(12).size());
   * 
   * for (var j = 0; j < arr.get(12).size(); j=j+1)
   * {System.out.println("I AM INSIDE IF FOR LOOP : ");
   * val entry = proposalCreator.createProposal('"'+arr.get(12).get(j)+'"', context);
   * acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
   * System.out.println("array item...... here "+arr.get(j));
   * }
   * val entry2 = proposalCreator.createProposal('"'+"/Extension/Extensions/Timing/TimingRequirements/Customized"+'"',context);
   * acceptor.accept(entry2, proposalPriorities.getDefaultPriority(entry2));
   * 
   * }
   * }
   */
  @Override
  protected void _createProposals(final Assignment assignment, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    String _feature = assignment.getFeature();
    String _plus = ("assignment : " + _feature);
    System.out.println(_plus);
    this.arr = xml_context.parse();
    boolean _equals = assignment.getFeature().equals("value");
    if (_equals) {
      for (int j = 0; (j < this.arr.get(1).size()); j++) {
        {
          IdeContentProposalCreator _proposalCreator = this.getProposalCreator();
          String _get = this.arr.get(1).get(j);
          String _plus_1 = ("\"" + _get);
          String _plus_2 = (_plus_1 + "\"");
          final ContentAssistEntry entry = _proposalCreator.createProposal(_plus_2, context);
          acceptor.accept(entry, this.getProposalPriorities().getDefaultPriority(entry));
        }
      }
      for (int j = 0; (j < this.arr.get(12).size()); j++) {
        {
          IdeContentProposalCreator _proposalCreator = this.getProposalCreator();
          String _get = this.arr.get(12).get(j);
          String _plus_1 = ("\"" + _get);
          String _plus_2 = (_plus_1 + "\"");
          final ContentAssistEntry entry = _proposalCreator.createProposal(_plus_2, context);
          acceptor.accept(entry, this.getProposalPriorities().getDefaultPriority(entry));
        }
      }
      for (int j = 0; (j < this.arr.get(13).size()); j++) {
        {
          IdeContentProposalCreator _proposalCreator = this.getProposalCreator();
          String _get = this.arr.get(13).get(j);
          String _plus_1 = ("\"" + _get);
          String _plus_2 = (_plus_1 + "\"");
          final ContentAssistEntry entry = _proposalCreator.createProposal(_plus_2, context);
          acceptor.accept(entry, this.getProposalPriorities().getDefaultPriority(entry));
        }
      }
      final ContentAssistEntry entry2 = this.getProposalCreator().createProposal((("\"" + "/Extension/Extensions/Timing/Timing/Period") + "\""), context);
      acceptor.accept(entry2, this.getProposalPriorities().getDefaultPriority(entry2));
    } else {
      boolean _equals_1 = assignment.getFeature().equals("test");
      if (_equals_1) {
        final ContentAssistEntry entry2_1 = this.getProposalCreator().createProposal("UUID:\"\" SHORT-NAME:\" \" CATEGORY:\"\" NAME:\"\"SCOPE:\"Scope\" }", context);
        acceptor.accept(entry2_1, this.getProposalPriorities().getDefaultPriority(entry2_1));
      } else {
        boolean _equals_2 = assignment.getFeature().equals("start");
        if (_equals_2) {
          for (int j = 0; (j < this.arr.get(4).size()); j++) {
            {
              IdeContentProposalCreator _proposalCreator = this.getProposalCreator();
              String _get = this.arr.get(4).get(j);
              String _plus_1 = ("\"" + _get);
              String _plus_2 = (_plus_1 + " START\"");
              final ContentAssistEntry entry = _proposalCreator.createProposal(_plus_2, context);
              acceptor.accept(entry, this.getProposalPriorities().getDefaultPriority(entry));
            }
          }
        } else {
          boolean _equals_3 = assignment.getFeature().equals("stop");
          if (_equals_3) {
            for (int j = 0; (j < this.arr.get(4).size()); j++) {
              {
                IdeContentProposalCreator _proposalCreator = this.getProposalCreator();
                String _get = this.arr.get(4).get(j);
                String _plus_1 = ("\"" + _get);
                String _plus_2 = (_plus_1 + " STOP\"");
                final ContentAssistEntry entry = _proposalCreator.createProposal(_plus_2, context);
                acceptor.accept(entry, this.getProposalPriorities().getDefaultPriority(entry));
              }
            }
          } else {
            super._createProposals(assignment, context, acceptor);
          }
        }
      }
    }
  }
  
  @Override
  public void createProposals(final AbstractElement assignment, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    if (assignment instanceof Assignment) {
      _createProposals((Assignment)assignment, context, acceptor);
      return;
    } else if (assignment instanceof CrossReference) {
      _createProposals((CrossReference)assignment, context, acceptor);
      return;
    } else if (assignment instanceof Keyword) {
      _createProposals((Keyword)assignment, context, acceptor);
      return;
    } else if (assignment instanceof RuleCall) {
      _createProposals((RuleCall)assignment, context, acceptor);
      return;
    } else if (assignment != null) {
      _createProposals(assignment, context, acceptor);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assignment, context, acceptor).toString());
    }
  }
}
