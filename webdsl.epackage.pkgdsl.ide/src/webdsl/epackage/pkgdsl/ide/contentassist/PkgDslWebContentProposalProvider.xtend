/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package webdsl.epackage.pkgdsl.ide.contentassist;

import com.google.inject.Inject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import webdsl.epackage.pkgdsl.services.PkgDslGrammarAccess
import webdsl.epackage.pkgdsl.xml_context;
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject


//import static org.xtext.example.statemachine.statemachine.StatemachinePackage.Literals.*

class PkgDslWebContentProposalProvider extends IdeContentProposalProvider {
	
	@Inject extension PkgDslGrammarAccess
	@Inject PkgDslTemplateProposalProvider templateProvider
	
	 xml_context t = new xml_context();
	 ArrayList<ArrayList<String>> arr =   new ArrayList<ArrayList<String> >(t.size);
	 
	
/*	override dispatch createProposals(RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) 
	{ System.out.println("ruleCall : "+ruleCall.rule.name);
			 if (ruleCall.rule.name.equals("Nested_Package"))
			{System.out.println("I AM INSIDE IF STATEMENT :");
			arr = t.parse();
			System.out.println(" array size"+arr.get(12).size());
			
		    for (var j = 0; j < arr.get(12).size(); j=j+1) 
		    {System.out.println("I AM INSIDE IF FOR LOOP : ");
			val entry = proposalCreator.createProposal('"'+arr.get(12).get(j)+'"', context);
			acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
				 System.out.println("array item...... here "+arr.get(j));
			} 
			val entry2 = proposalCreator.createProposal('"'+"/Extension/Extensions/Timing/TimingRequirements/Customized"+'"',context);
			acceptor.accept(entry2, proposalPriorities.getDefaultPriority(entry2));
	
			}
	}*/

	
override dispatch createProposals(Assignment assignment, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) 
{
		System.out.println("assignment : "+assignment.feature);
		arr = t.parse();
		if (assignment.feature.equals("value"))
			{
			
			for (var j = 0; j < arr.get(1).size(); j++) {
				val entry = proposalCreator.createProposal('"'+arr.get(1).get(j)+'"', context);
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
			} 
			for (var j = 0; j < arr.get(12).size(); j++) {
				val entry = proposalCreator.createProposal('"'+arr.get(12).get(j)+'"', context);
			   acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
			} 
			for (var j = 0; j < arr.get(13).size(); j++) {
				val entry = proposalCreator.createProposal('"'+arr.get(13).get(j)+'"', context);
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
				} 
			val entry2 = proposalCreator.createProposal('"'+"/Extension/Extensions/Timing/Timing/Period"+'"',context);
			acceptor.accept(entry2, proposalPriorities.getDefaultPriority(entry2));
		}
		else if (assignment.feature.equals("test")){
			
			val entry2 = proposalCreator.createProposal("UUID:\"\" SHORT-NAME:\" \" CATEGORY:\"\" NAME:\"\"SCOPE:\"Scope\" }",context);
			acceptor.accept(entry2, proposalPriorities.getDefaultPriority(entry2));
		}
		else if (assignment.feature.equals("start")){
			
			for (var j = 0; j < arr.get(4).size(); j++) {
				val entry = proposalCreator.createProposal('"'+arr.get(4).get(j)+' START"', context);
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
			}
			
			
		}
		else if (assignment.feature.equals("stop")){
			
			for (var j = 0; j < arr.get(4).size(); j++) {
				val entry = proposalCreator.createProposal('"'+arr.get(4).get(j)+' STOP"', context);
				acceptor.accept(entry, proposalPriorities.getDefaultPriority(entry));
			}
			
		}
		else super._createProposals(assignment, context, acceptor);
}
	
/*	override protected filterKeyword(Keyword keyword, ContentAssistContext context) {
		System.out.println("keyword : "+keyword.value);
			super.filterKeyword(keyword, context)
		
	}*/
	
}
