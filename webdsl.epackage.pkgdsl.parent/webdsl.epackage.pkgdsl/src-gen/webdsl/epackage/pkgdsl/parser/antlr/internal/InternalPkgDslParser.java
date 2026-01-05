package webdsl.epackage.pkgdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import webdsl.epackage.pkgdsl.services.PkgDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPkgDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Top-Package {'", "'UUID:'", "'SHORT-NAME:'", "'CATEGORY:'", "'NAME:'", "'}'", "'Sub-Package {'", "'Package {'", "'Element {'", "'Timing {'", "'TRACEABLE-SPECIFICATION-REFS:'", "'Constraints {'", "'Reaction-Constraint {'", "'SCOPE:'", "'Timing Expression {'", "'TYPE:'", "'Value:'", "'Pattern-Constraint {'", "'EVENT:'", "'Order-Constraint {'", "'TARGET:'", "'SOURCE:'", "'Execution-Time-Constraint {'", "'RESUME-REFS:'", "'PREEMPTION-REFS:'", "'START:'", "'STOP:'", "'Age-Constraint {'", "'Delay-Constraint {'", "'Periodic-Constraint {'", "'Events {'", "'Event-Chain {'", "'SEGMENT-REFS:'", "'STIMULUS:'", "'RESPONSE:'", "'Event-Function-Flow-Port {'", "'FUNCTION-TYPE:'", "'FUNCTION-VALUE:'", "'FUNCTION-PROTOTYPE:'", "'FUNCTION-FLOW-PORT:'", "'Event-Function {'", "'FFUNCTION-PROTOTYPE-TARGET:'", "'FUNCTION-PROTOTYPE-CONTEXT:'", "'Unit {'", "'FACTOR:'", "'SYMBOL:'", "'OFFSET:'", "'QUNATITY:'", "'Quantity {'", "'AMOUNT-OF-SUBSTANCE-EXP:'", "'ELECTRIC-CURRENT-EXP:'", "'LENGTH-EXP:'", "'LUMINOUS-INTENSITY-EXP:'", "'MASS-EXP:'", "'THERMODYNAMIC-TEMPERATURE-EXP:'", "'TIME-EXP:'", "'EA_Numerical {'", "'TEXT:'", "'MAX:'", "'MIN:'", "'UNIT-OF-DATA:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPkgDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPkgDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPkgDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPkgDsl.g"; }



     	private PkgDslGrammarAccess grammarAccess;

        public InternalPkgDslParser(TokenStream input, PkgDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected PkgDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalPkgDsl.g:64:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalPkgDsl.g:64:45: (iv_ruleFile= ruleFile EOF )
            // InternalPkgDsl.g:65:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalPkgDsl.g:71:1: ruleFile returns [EObject current=null] : ( ( (lv_ea_package_0_0= ruleEA_Package ) )* ( (lv_timing_1_0= ruleTiming ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_ea_package_0_0 = null;

        EObject lv_timing_1_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:77:2: ( ( ( (lv_ea_package_0_0= ruleEA_Package ) )* ( (lv_timing_1_0= ruleTiming ) )* ) )
            // InternalPkgDsl.g:78:2: ( ( (lv_ea_package_0_0= ruleEA_Package ) )* ( (lv_timing_1_0= ruleTiming ) )* )
            {
            // InternalPkgDsl.g:78:2: ( ( (lv_ea_package_0_0= ruleEA_Package ) )* ( (lv_timing_1_0= ruleTiming ) )* )
            // InternalPkgDsl.g:79:3: ( (lv_ea_package_0_0= ruleEA_Package ) )* ( (lv_timing_1_0= ruleTiming ) )*
            {
            // InternalPkgDsl.g:79:3: ( (lv_ea_package_0_0= ruleEA_Package ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==11||LA1_1==17||LA1_1==19) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>=12 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPkgDsl.g:80:4: (lv_ea_package_0_0= ruleEA_Package )
            	    {
            	    // InternalPkgDsl.g:80:4: (lv_ea_package_0_0= ruleEA_Package )
            	    // InternalPkgDsl.g:81:5: lv_ea_package_0_0= ruleEA_Package
            	    {

            	    					newCompositeNode(grammarAccess.getFileAccess().getEa_packageEA_PackageParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_ea_package_0_0=ruleEA_Package();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ea_package",
            	    						lv_ea_package_0_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.EA_Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPkgDsl.g:98:3: ( (lv_timing_1_0= ruleTiming ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPkgDsl.g:99:4: (lv_timing_1_0= ruleTiming )
            	    {
            	    // InternalPkgDsl.g:99:4: (lv_timing_1_0= ruleTiming )
            	    // InternalPkgDsl.g:100:5: lv_timing_1_0= ruleTiming
            	    {

            	    					newCompositeNode(grammarAccess.getFileAccess().getTimingTimingParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_timing_1_0=ruleTiming();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timing",
            	    						lv_timing_1_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Timing");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleEA_Package"
    // InternalPkgDsl.g:121:1: entryRuleEA_Package returns [EObject current=null] : iv_ruleEA_Package= ruleEA_Package EOF ;
    public final EObject entryRuleEA_Package() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEA_Package = null;


        try {
            // InternalPkgDsl.g:121:51: (iv_ruleEA_Package= ruleEA_Package EOF )
            // InternalPkgDsl.g:122:2: iv_ruleEA_Package= ruleEA_Package EOF
            {
             newCompositeNode(grammarAccess.getEA_PackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEA_Package=ruleEA_Package();

            state._fsp--;

             current =iv_ruleEA_Package; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEA_Package"


    // $ANTLR start "ruleEA_Package"
    // InternalPkgDsl.g:128:1: ruleEA_Package returns [EObject current=null] : ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Top-Package {' )? (otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) )? (otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) )? (otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) )? (otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_elements_11_0= ruleElements ) )* otherlv_12= '}' ) ;
    public final EObject ruleEA_Package() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_12=null;
        EObject lv_subpackages_10_0 = null;

        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:134:2: ( ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Top-Package {' )? (otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) )? (otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) )? (otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) )? (otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_elements_11_0= ruleElements ) )* otherlv_12= '}' ) )
            // InternalPkgDsl.g:135:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Top-Package {' )? (otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) )? (otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) )? (otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) )? (otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_elements_11_0= ruleElements ) )* otherlv_12= '}' )
            {
            // InternalPkgDsl.g:135:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Top-Package {' )? (otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) )? (otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) )? (otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) )? (otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_elements_11_0= ruleElements ) )* otherlv_12= '}' )
            // InternalPkgDsl.g:136:3: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Top-Package {' )? (otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) )? (otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) )? (otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) )? (otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) )? ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_elements_11_0= ruleElements ) )* otherlv_12= '}'
            {
            // InternalPkgDsl.g:136:3: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Top-Package {' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==11) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalPkgDsl.g:137:4: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Top-Package {'
                    {
                    // InternalPkgDsl.g:137:4: ( (lv_define_0_0= RULE_ID ) )
                    // InternalPkgDsl.g:138:5: (lv_define_0_0= RULE_ID )
                    {
                    // InternalPkgDsl.g:138:5: (lv_define_0_0= RULE_ID )
                    // InternalPkgDsl.g:139:6: lv_define_0_0= RULE_ID
                    {
                    lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_define_0_0, grammarAccess.getEA_PackageAccess().getDefineIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_PackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"define",
                    							lv_define_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getEA_PackageAccess().getTopPackageKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPkgDsl.g:160:3: (otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPkgDsl.g:161:4: otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEA_PackageAccess().getUUIDKeyword_1_0());
                    			
                    // InternalPkgDsl.g:165:4: ( (lv_uuid_3_0= RULE_STRING ) )
                    // InternalPkgDsl.g:166:5: (lv_uuid_3_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:166:5: (lv_uuid_3_0= RULE_STRING )
                    // InternalPkgDsl.g:167:6: lv_uuid_3_0= RULE_STRING
                    {
                    lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_uuid_3_0, grammarAccess.getEA_PackageAccess().getUuidSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_PackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"uuid",
                    							lv_uuid_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:184:3: (otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPkgDsl.g:185:4: otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEA_PackageAccess().getSHORTNAMEKeyword_2_0());
                    			
                    // InternalPkgDsl.g:189:4: ( (lv_shortname_5_0= RULE_STRING ) )
                    // InternalPkgDsl.g:190:5: (lv_shortname_5_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:190:5: (lv_shortname_5_0= RULE_STRING )
                    // InternalPkgDsl.g:191:6: lv_shortname_5_0= RULE_STRING
                    {
                    lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_shortname_5_0, grammarAccess.getEA_PackageAccess().getShortnameSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_PackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"shortname",
                    							lv_shortname_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:208:3: (otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPkgDsl.g:209:4: otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getEA_PackageAccess().getCATEGORYKeyword_3_0());
                    			
                    // InternalPkgDsl.g:213:4: ( (lv_category_7_0= RULE_STRING ) )
                    // InternalPkgDsl.g:214:5: (lv_category_7_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:214:5: (lv_category_7_0= RULE_STRING )
                    // InternalPkgDsl.g:215:6: lv_category_7_0= RULE_STRING
                    {
                    lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_category_7_0, grammarAccess.getEA_PackageAccess().getCategorySTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_PackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"category",
                    							lv_category_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:232:3: (otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPkgDsl.g:233:4: otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getEA_PackageAccess().getNAMEKeyword_4_0());
                    			
                    // InternalPkgDsl.g:237:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalPkgDsl.g:238:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:238:5: (lv_name_9_0= RULE_STRING )
                    // InternalPkgDsl.g:239:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getEA_PackageAccess().getNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_PackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:256:3: ( (lv_subpackages_10_0= ruleSub_Package ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==17) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalPkgDsl.g:257:4: (lv_subpackages_10_0= ruleSub_Package )
            	    {
            	    // InternalPkgDsl.g:257:4: (lv_subpackages_10_0= ruleSub_Package )
            	    // InternalPkgDsl.g:258:5: lv_subpackages_10_0= ruleSub_Package
            	    {

            	    					newCompositeNode(grammarAccess.getEA_PackageAccess().getSubpackagesSub_PackageParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_subpackages_10_0=ruleSub_Package();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEA_PackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subpackages",
            	    						lv_subpackages_10_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Sub_Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPkgDsl.g:275:3: ( (lv_elements_11_0= ruleElements ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPkgDsl.g:276:4: (lv_elements_11_0= ruleElements )
            	    {
            	    // InternalPkgDsl.g:276:4: (lv_elements_11_0= ruleElements )
            	    // InternalPkgDsl.g:277:5: lv_elements_11_0= ruleElements
            	    {

            	    					newCompositeNode(grammarAccess.getEA_PackageAccess().getElementsElementsParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_11_0=ruleElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEA_PackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_11_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Elements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEA_PackageAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEA_Package"


    // $ANTLR start "entryRuleSub_Package"
    // InternalPkgDsl.g:302:1: entryRuleSub_Package returns [EObject current=null] : iv_ruleSub_Package= ruleSub_Package EOF ;
    public final EObject entryRuleSub_Package() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub_Package = null;


        try {
            // InternalPkgDsl.g:302:52: (iv_ruleSub_Package= ruleSub_Package EOF )
            // InternalPkgDsl.g:303:2: iv_ruleSub_Package= ruleSub_Package EOF
            {
             newCompositeNode(grammarAccess.getSub_PackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSub_Package=ruleSub_Package();

            state._fsp--;

             current =iv_ruleSub_Package; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSub_Package"


    // $ANTLR start "ruleSub_Package"
    // InternalPkgDsl.g:309:1: ruleSub_Package returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Sub-Package {' ( (lv_nested_package_2_0= ruleNested_Package ) )* otherlv_3= '}' ) ;
    public final EObject ruleSub_Package() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nested_package_2_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:315:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Sub-Package {' ( (lv_nested_package_2_0= ruleNested_Package ) )* otherlv_3= '}' ) )
            // InternalPkgDsl.g:316:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Sub-Package {' ( (lv_nested_package_2_0= ruleNested_Package ) )* otherlv_3= '}' )
            {
            // InternalPkgDsl.g:316:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Sub-Package {' ( (lv_nested_package_2_0= ruleNested_Package ) )* otherlv_3= '}' )
            // InternalPkgDsl.g:317:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Sub-Package {' ( (lv_nested_package_2_0= ruleNested_Package ) )* otherlv_3= '}'
            {
            // InternalPkgDsl.g:317:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:318:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:318:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:319:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_define_0_0, grammarAccess.getSub_PackageAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSub_PackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSub_PackageAccess().getSubPackageKeyword_1());
            		
            // InternalPkgDsl.g:339:3: ( (lv_nested_package_2_0= ruleNested_Package ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPkgDsl.g:340:4: (lv_nested_package_2_0= ruleNested_Package )
            	    {
            	    // InternalPkgDsl.g:340:4: (lv_nested_package_2_0= ruleNested_Package )
            	    // InternalPkgDsl.g:341:5: lv_nested_package_2_0= ruleNested_Package
            	    {

            	    					newCompositeNode(grammarAccess.getSub_PackageAccess().getNested_packageNested_PackageParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_nested_package_2_0=ruleNested_Package();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSub_PackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nested_package",
            	    						lv_nested_package_2_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Nested_Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSub_PackageAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSub_Package"


    // $ANTLR start "entryRuleNested_Package"
    // InternalPkgDsl.g:366:1: entryRuleNested_Package returns [EObject current=null] : iv_ruleNested_Package= ruleNested_Package EOF ;
    public final EObject entryRuleNested_Package() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNested_Package = null;


        try {
            // InternalPkgDsl.g:366:55: (iv_ruleNested_Package= ruleNested_Package EOF )
            // InternalPkgDsl.g:367:2: iv_ruleNested_Package= ruleNested_Package EOF
            {
             newCompositeNode(grammarAccess.getNested_PackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNested_Package=ruleNested_Package();

            state._fsp--;

             current =iv_ruleNested_Package; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNested_Package"


    // $ANTLR start "ruleNested_Package"
    // InternalPkgDsl.g:373:1: ruleNested_Package returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Package {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_element_11_0= ruleElement ) )* otherlv_12= '}' ) ;
    public final EObject ruleNested_Package() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_12=null;
        EObject lv_subpackages_10_0 = null;

        EObject lv_element_11_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:379:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Package {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_element_11_0= ruleElement ) )* otherlv_12= '}' ) )
            // InternalPkgDsl.g:380:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Package {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_element_11_0= ruleElement ) )* otherlv_12= '}' )
            {
            // InternalPkgDsl.g:380:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Package {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_element_11_0= ruleElement ) )* otherlv_12= '}' )
            // InternalPkgDsl.g:381:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Package {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) ( (lv_subpackages_10_0= ruleSub_Package ) )* ( (lv_element_11_0= ruleElement ) )* otherlv_12= '}'
            {
            // InternalPkgDsl.g:381:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:382:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:382:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:383:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_define_0_0, grammarAccess.getNested_PackageAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNested_PackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNested_PackageAccess().getPackageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getNested_PackageAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:407:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:408:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:408:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:409:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getNested_PackageAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNested_PackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getNested_PackageAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:429:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:430:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:430:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:431:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getNested_PackageAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNested_PackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getNested_PackageAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:451:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:452:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:452:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:453:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getNested_PackageAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNested_PackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getNested_PackageAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:473:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:474:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:474:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:475:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_9_0, grammarAccess.getNested_PackageAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNested_PackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:491:3: ( (lv_subpackages_10_0= ruleSub_Package ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==17) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalPkgDsl.g:492:4: (lv_subpackages_10_0= ruleSub_Package )
            	    {
            	    // InternalPkgDsl.g:492:4: (lv_subpackages_10_0= ruleSub_Package )
            	    // InternalPkgDsl.g:493:5: lv_subpackages_10_0= ruleSub_Package
            	    {

            	    					newCompositeNode(grammarAccess.getNested_PackageAccess().getSubpackagesSub_PackageParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_subpackages_10_0=ruleSub_Package();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNested_PackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subpackages",
            	    						lv_subpackages_10_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Sub_Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalPkgDsl.g:510:3: ( (lv_element_11_0= ruleElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPkgDsl.g:511:4: (lv_element_11_0= ruleElement )
            	    {
            	    // InternalPkgDsl.g:511:4: (lv_element_11_0= ruleElement )
            	    // InternalPkgDsl.g:512:5: lv_element_11_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getNested_PackageAccess().getElementElementParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_element_11_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNested_PackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"element",
            	    						lv_element_11_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getNested_PackageAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNested_Package"


    // $ANTLR start "entryRuleElement"
    // InternalPkgDsl.g:537:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalPkgDsl.g:537:48: (iv_ruleElement= ruleElement EOF )
            // InternalPkgDsl.g:538:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalPkgDsl.g:544:1: ruleElement returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_ea_numerical_2_0 = null;

        EObject lv_unit_3_0 = null;

        EObject lv_qunatity_4_0 = null;

        EObject lv_timing_5_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:550:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' ) )
            // InternalPkgDsl.g:551:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' )
            {
            // InternalPkgDsl.g:551:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' )
            // InternalPkgDsl.g:552:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}'
            {
            // InternalPkgDsl.g:552:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:553:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:553:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:554:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_define_0_0, grammarAccess.getElementAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getElementKeyword_1());
            		
            // InternalPkgDsl.g:574:3: ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==67) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalPkgDsl.g:575:4: (lv_ea_numerical_2_0= ruleEA_Numerical )
            	    {
            	    // InternalPkgDsl.g:575:4: (lv_ea_numerical_2_0= ruleEA_Numerical )
            	    // InternalPkgDsl.g:576:5: lv_ea_numerical_2_0= ruleEA_Numerical
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getEa_numericalEA_NumericalParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ea_numerical_2_0=ruleEA_Numerical();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ea_numerical",
            	    						lv_ea_numerical_2_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.EA_Numerical");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalPkgDsl.g:593:3: ( (lv_unit_3_0= ruleUnit ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==54) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalPkgDsl.g:594:4: (lv_unit_3_0= ruleUnit )
            	    {
            	    // InternalPkgDsl.g:594:4: (lv_unit_3_0= ruleUnit )
            	    // InternalPkgDsl.g:595:5: lv_unit_3_0= ruleUnit
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getUnitUnitParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_unit_3_0=ruleUnit();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"unit",
            	    						lv_unit_3_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Unit");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalPkgDsl.g:612:3: ( (lv_qunatity_4_0= ruleQuantity ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==59) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalPkgDsl.g:613:4: (lv_qunatity_4_0= ruleQuantity )
            	    {
            	    // InternalPkgDsl.g:613:4: (lv_qunatity_4_0= ruleQuantity )
            	    // InternalPkgDsl.g:614:5: lv_qunatity_4_0= ruleQuantity
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getQunatityQuantityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_qunatity_4_0=ruleQuantity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qunatity",
            	    						lv_qunatity_4_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Quantity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalPkgDsl.g:631:3: ( (lv_timing_5_0= ruleTiming ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPkgDsl.g:632:4: (lv_timing_5_0= ruleTiming )
            	    {
            	    // InternalPkgDsl.g:632:4: (lv_timing_5_0= ruleTiming )
            	    // InternalPkgDsl.g:633:5: lv_timing_5_0= ruleTiming
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getTimingTimingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timing_5_0=ruleTiming();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timing",
            	    						lv_timing_5_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Timing");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleElements"
    // InternalPkgDsl.g:658:1: entryRuleElements returns [EObject current=null] : iv_ruleElements= ruleElements EOF ;
    public final EObject entryRuleElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElements = null;


        try {
            // InternalPkgDsl.g:658:49: (iv_ruleElements= ruleElements EOF )
            // InternalPkgDsl.g:659:2: iv_ruleElements= ruleElements EOF
            {
             newCompositeNode(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElements=ruleElements();

            state._fsp--;

             current =iv_ruleElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // InternalPkgDsl.g:665:1: ruleElements returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' ) ;
    public final EObject ruleElements() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_ea_numerical_2_0 = null;

        EObject lv_unit_3_0 = null;

        EObject lv_qunatity_4_0 = null;

        EObject lv_timing_5_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:671:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' ) )
            // InternalPkgDsl.g:672:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' )
            {
            // InternalPkgDsl.g:672:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}' )
            // InternalPkgDsl.g:673:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Element {' ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )* ( (lv_unit_3_0= ruleUnit ) )* ( (lv_qunatity_4_0= ruleQuantity ) )* ( (lv_timing_5_0= ruleTiming ) )* otherlv_6= '}'
            {
            // InternalPkgDsl.g:673:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:674:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:674:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:675:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_define_0_0, grammarAccess.getElementsAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getElementsAccess().getElementKeyword_1());
            		
            // InternalPkgDsl.g:695:3: ( (lv_ea_numerical_2_0= ruleEA_Numerical ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==67) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalPkgDsl.g:696:4: (lv_ea_numerical_2_0= ruleEA_Numerical )
            	    {
            	    // InternalPkgDsl.g:696:4: (lv_ea_numerical_2_0= ruleEA_Numerical )
            	    // InternalPkgDsl.g:697:5: lv_ea_numerical_2_0= ruleEA_Numerical
            	    {

            	    					newCompositeNode(grammarAccess.getElementsAccess().getEa_numericalEA_NumericalParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ea_numerical_2_0=ruleEA_Numerical();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ea_numerical",
            	    						lv_ea_numerical_2_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.EA_Numerical");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalPkgDsl.g:714:3: ( (lv_unit_3_0= ruleUnit ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==54) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalPkgDsl.g:715:4: (lv_unit_3_0= ruleUnit )
            	    {
            	    // InternalPkgDsl.g:715:4: (lv_unit_3_0= ruleUnit )
            	    // InternalPkgDsl.g:716:5: lv_unit_3_0= ruleUnit
            	    {

            	    					newCompositeNode(grammarAccess.getElementsAccess().getUnitUnitParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_unit_3_0=ruleUnit();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"unit",
            	    						lv_unit_3_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Unit");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalPkgDsl.g:733:3: ( (lv_qunatity_4_0= ruleQuantity ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==59) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalPkgDsl.g:734:4: (lv_qunatity_4_0= ruleQuantity )
            	    {
            	    // InternalPkgDsl.g:734:4: (lv_qunatity_4_0= ruleQuantity )
            	    // InternalPkgDsl.g:735:5: lv_qunatity_4_0= ruleQuantity
            	    {

            	    					newCompositeNode(grammarAccess.getElementsAccess().getQunatityQuantityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_qunatity_4_0=ruleQuantity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qunatity",
            	    						lv_qunatity_4_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Quantity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalPkgDsl.g:752:3: ( (lv_timing_5_0= ruleTiming ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPkgDsl.g:753:4: (lv_timing_5_0= ruleTiming )
            	    {
            	    // InternalPkgDsl.g:753:4: (lv_timing_5_0= ruleTiming )
            	    // InternalPkgDsl.g:754:5: lv_timing_5_0= ruleTiming
            	    {

            	    					newCompositeNode(grammarAccess.getElementsAccess().getTimingTimingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timing_5_0=ruleTiming();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timing",
            	    						lv_timing_5_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Timing");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getElementsAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleTiming"
    // InternalPkgDsl.g:779:1: entryRuleTiming returns [EObject current=null] : iv_ruleTiming= ruleTiming EOF ;
    public final EObject entryRuleTiming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTiming = null;


        try {
            // InternalPkgDsl.g:779:47: (iv_ruleTiming= ruleTiming EOF )
            // InternalPkgDsl.g:780:2: iv_ruleTiming= ruleTiming EOF
            {
             newCompositeNode(grammarAccess.getTimingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTiming=ruleTiming();

            state._fsp--;

             current =iv_ruleTiming; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTiming"


    // $ANTLR start "ruleTiming"
    // InternalPkgDsl.g:786:1: ruleTiming returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TRACEABLE-SPECIFICATION-REFS:' ( (lv_traceable_specification_11_0= RULE_STRING ) ) )? ( (lv_descriptions_12_0= ruleDescriptions ) )* ( (lv_constraints_13_0= ruleConstraints ) )* otherlv_14= '}' ) ;
    public final EObject ruleTiming() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_traceable_specification_11_0=null;
        Token otherlv_14=null;
        EObject lv_descriptions_12_0 = null;

        EObject lv_constraints_13_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:792:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TRACEABLE-SPECIFICATION-REFS:' ( (lv_traceable_specification_11_0= RULE_STRING ) ) )? ( (lv_descriptions_12_0= ruleDescriptions ) )* ( (lv_constraints_13_0= ruleConstraints ) )* otherlv_14= '}' ) )
            // InternalPkgDsl.g:793:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TRACEABLE-SPECIFICATION-REFS:' ( (lv_traceable_specification_11_0= RULE_STRING ) ) )? ( (lv_descriptions_12_0= ruleDescriptions ) )* ( (lv_constraints_13_0= ruleConstraints ) )* otherlv_14= '}' )
            {
            // InternalPkgDsl.g:793:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TRACEABLE-SPECIFICATION-REFS:' ( (lv_traceable_specification_11_0= RULE_STRING ) ) )? ( (lv_descriptions_12_0= ruleDescriptions ) )* ( (lv_constraints_13_0= ruleConstraints ) )* otherlv_14= '}' )
            // InternalPkgDsl.g:794:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TRACEABLE-SPECIFICATION-REFS:' ( (lv_traceable_specification_11_0= RULE_STRING ) ) )? ( (lv_descriptions_12_0= ruleDescriptions ) )* ( (lv_constraints_13_0= ruleConstraints ) )* otherlv_14= '}'
            {
            // InternalPkgDsl.g:794:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:795:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:795:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:796:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_define_0_0, grammarAccess.getTimingAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTimingAccess().getTimingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTimingAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:820:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:821:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:821:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:822:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getTimingAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTimingAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:842:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:843:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:843:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:844:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getTimingAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getTimingAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:864:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:865:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:865:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:866:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getTimingAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getTimingAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:886:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:887:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:887:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:888:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_9_0, grammarAccess.getTimingAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:904:3: (otherlv_10= 'TRACEABLE-SPECIFICATION-REFS:' ( (lv_traceable_specification_11_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPkgDsl.g:905:4: otherlv_10= 'TRACEABLE-SPECIFICATION-REFS:' ( (lv_traceable_specification_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getTimingAccess().getTRACEABLESPECIFICATIONREFSKeyword_10_0());
                    			
                    // InternalPkgDsl.g:909:4: ( (lv_traceable_specification_11_0= RULE_STRING ) )
                    // InternalPkgDsl.g:910:5: (lv_traceable_specification_11_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:910:5: (lv_traceable_specification_11_0= RULE_STRING )
                    // InternalPkgDsl.g:911:6: lv_traceable_specification_11_0= RULE_STRING
                    {
                    lv_traceable_specification_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_traceable_specification_11_0, grammarAccess.getTimingAccess().getTraceable_specificationSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"traceable_specification",
                    							lv_traceable_specification_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:928:3: ( (lv_descriptions_12_0= ruleDescriptions ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==41) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalPkgDsl.g:929:4: (lv_descriptions_12_0= ruleDescriptions )
            	    {
            	    // InternalPkgDsl.g:929:4: (lv_descriptions_12_0= ruleDescriptions )
            	    // InternalPkgDsl.g:930:5: lv_descriptions_12_0= ruleDescriptions
            	    {

            	    					newCompositeNode(grammarAccess.getTimingAccess().getDescriptionsDescriptionsParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_descriptions_12_0=ruleDescriptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTimingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"descriptions",
            	    						lv_descriptions_12_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Descriptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalPkgDsl.g:947:3: ( (lv_constraints_13_0= ruleConstraints ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPkgDsl.g:948:4: (lv_constraints_13_0= ruleConstraints )
            	    {
            	    // InternalPkgDsl.g:948:4: (lv_constraints_13_0= ruleConstraints )
            	    // InternalPkgDsl.g:949:5: lv_constraints_13_0= ruleConstraints
            	    {

            	    					newCompositeNode(grammarAccess.getTimingAccess().getConstraintsConstraintsParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_constraints_13_0=ruleConstraints();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTimingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_13_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Constraints");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTimingAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTiming"


    // $ANTLR start "entryRuleConstraints"
    // InternalPkgDsl.g:974:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalPkgDsl.g:974:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalPkgDsl.g:975:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPkgDsl.g:981:1: ruleConstraints returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Constraints {' ( (lv_periodic_constraint_2_0= rulePeriodic_Constraint ) )* ( (lv_delay_constraint_3_0= ruleDelay_Constraint ) )* ( (lv_age_constraint_4_0= ruleAge_Constraint ) )* ( (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint ) )* ( (lv_order_constraint_6_0= ruleOrder_Constraint ) )* ( (lv_pattern_constraint_7_0= rulePattern_Constraint ) )* ( (lv_reaction_constraint_8_0= ruleReaction_Constraint ) )* otherlv_9= '}' ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_9=null;
        EObject lv_periodic_constraint_2_0 = null;

        EObject lv_delay_constraint_3_0 = null;

        EObject lv_age_constraint_4_0 = null;

        EObject lv_execution_time_constraint_5_0 = null;

        EObject lv_order_constraint_6_0 = null;

        EObject lv_pattern_constraint_7_0 = null;

        EObject lv_reaction_constraint_8_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:987:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Constraints {' ( (lv_periodic_constraint_2_0= rulePeriodic_Constraint ) )* ( (lv_delay_constraint_3_0= ruleDelay_Constraint ) )* ( (lv_age_constraint_4_0= ruleAge_Constraint ) )* ( (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint ) )* ( (lv_order_constraint_6_0= ruleOrder_Constraint ) )* ( (lv_pattern_constraint_7_0= rulePattern_Constraint ) )* ( (lv_reaction_constraint_8_0= ruleReaction_Constraint ) )* otherlv_9= '}' ) )
            // InternalPkgDsl.g:988:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Constraints {' ( (lv_periodic_constraint_2_0= rulePeriodic_Constraint ) )* ( (lv_delay_constraint_3_0= ruleDelay_Constraint ) )* ( (lv_age_constraint_4_0= ruleAge_Constraint ) )* ( (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint ) )* ( (lv_order_constraint_6_0= ruleOrder_Constraint ) )* ( (lv_pattern_constraint_7_0= rulePattern_Constraint ) )* ( (lv_reaction_constraint_8_0= ruleReaction_Constraint ) )* otherlv_9= '}' )
            {
            // InternalPkgDsl.g:988:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Constraints {' ( (lv_periodic_constraint_2_0= rulePeriodic_Constraint ) )* ( (lv_delay_constraint_3_0= ruleDelay_Constraint ) )* ( (lv_age_constraint_4_0= ruleAge_Constraint ) )* ( (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint ) )* ( (lv_order_constraint_6_0= ruleOrder_Constraint ) )* ( (lv_pattern_constraint_7_0= rulePattern_Constraint ) )* ( (lv_reaction_constraint_8_0= ruleReaction_Constraint ) )* otherlv_9= '}' )
            // InternalPkgDsl.g:989:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Constraints {' ( (lv_periodic_constraint_2_0= rulePeriodic_Constraint ) )* ( (lv_delay_constraint_3_0= ruleDelay_Constraint ) )* ( (lv_age_constraint_4_0= ruleAge_Constraint ) )* ( (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint ) )* ( (lv_order_constraint_6_0= ruleOrder_Constraint ) )* ( (lv_pattern_constraint_7_0= rulePattern_Constraint ) )* ( (lv_reaction_constraint_8_0= ruleReaction_Constraint ) )* otherlv_9= '}'
            {
            // InternalPkgDsl.g:989:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:990:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:990:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:991:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_define_0_0, grammarAccess.getConstraintsAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintsAccess().getConstraintsKeyword_1());
            		
            // InternalPkgDsl.g:1011:3: ( (lv_periodic_constraint_2_0= rulePeriodic_Constraint ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==40) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalPkgDsl.g:1012:4: (lv_periodic_constraint_2_0= rulePeriodic_Constraint )
            	    {
            	    // InternalPkgDsl.g:1012:4: (lv_periodic_constraint_2_0= rulePeriodic_Constraint )
            	    // InternalPkgDsl.g:1013:5: lv_periodic_constraint_2_0= rulePeriodic_Constraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getPeriodic_constraintPeriodic_ConstraintParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_periodic_constraint_2_0=rulePeriodic_Constraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"periodic_constraint",
            	    						lv_periodic_constraint_2_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Periodic_Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalPkgDsl.g:1030:3: ( (lv_delay_constraint_3_0= ruleDelay_Constraint ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==39) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalPkgDsl.g:1031:4: (lv_delay_constraint_3_0= ruleDelay_Constraint )
            	    {
            	    // InternalPkgDsl.g:1031:4: (lv_delay_constraint_3_0= ruleDelay_Constraint )
            	    // InternalPkgDsl.g:1032:5: lv_delay_constraint_3_0= ruleDelay_Constraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getDelay_constraintDelay_ConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_delay_constraint_3_0=ruleDelay_Constraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"delay_constraint",
            	    						lv_delay_constraint_3_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Delay_Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalPkgDsl.g:1049:3: ( (lv_age_constraint_4_0= ruleAge_Constraint ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==38) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalPkgDsl.g:1050:4: (lv_age_constraint_4_0= ruleAge_Constraint )
            	    {
            	    // InternalPkgDsl.g:1050:4: (lv_age_constraint_4_0= ruleAge_Constraint )
            	    // InternalPkgDsl.g:1051:5: lv_age_constraint_4_0= ruleAge_Constraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getAge_constraintAge_ConstraintParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_age_constraint_4_0=ruleAge_Constraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"age_constraint",
            	    						lv_age_constraint_4_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Age_Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalPkgDsl.g:1068:3: ( (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==33) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalPkgDsl.g:1069:4: (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint )
            	    {
            	    // InternalPkgDsl.g:1069:4: (lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint )
            	    // InternalPkgDsl.g:1070:5: lv_execution_time_constraint_5_0= ruleExecution_Time_Constraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getExecution_time_constraintExecution_Time_ConstraintParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_execution_time_constraint_5_0=ruleExecution_Time_Constraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"execution_time_constraint",
            	    						lv_execution_time_constraint_5_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Execution_Time_Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalPkgDsl.g:1087:3: ( (lv_order_constraint_6_0= ruleOrder_Constraint ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==30) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalPkgDsl.g:1088:4: (lv_order_constraint_6_0= ruleOrder_Constraint )
            	    {
            	    // InternalPkgDsl.g:1088:4: (lv_order_constraint_6_0= ruleOrder_Constraint )
            	    // InternalPkgDsl.g:1089:5: lv_order_constraint_6_0= ruleOrder_Constraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getOrder_constraintOrder_ConstraintParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_order_constraint_6_0=ruleOrder_Constraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"order_constraint",
            	    						lv_order_constraint_6_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Order_Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalPkgDsl.g:1106:3: ( (lv_pattern_constraint_7_0= rulePattern_Constraint ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==28) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalPkgDsl.g:1107:4: (lv_pattern_constraint_7_0= rulePattern_Constraint )
            	    {
            	    // InternalPkgDsl.g:1107:4: (lv_pattern_constraint_7_0= rulePattern_Constraint )
            	    // InternalPkgDsl.g:1108:5: lv_pattern_constraint_7_0= rulePattern_Constraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getPattern_constraintPattern_ConstraintParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_pattern_constraint_7_0=rulePattern_Constraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pattern_constraint",
            	    						lv_pattern_constraint_7_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Pattern_Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalPkgDsl.g:1125:3: ( (lv_reaction_constraint_8_0= ruleReaction_Constraint ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPkgDsl.g:1126:4: (lv_reaction_constraint_8_0= ruleReaction_Constraint )
            	    {
            	    // InternalPkgDsl.g:1126:4: (lv_reaction_constraint_8_0= ruleReaction_Constraint )
            	    // InternalPkgDsl.g:1127:5: lv_reaction_constraint_8_0= ruleReaction_Constraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getReaction_constraintReaction_ConstraintParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_reaction_constraint_8_0=ruleReaction_Constraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reaction_constraint",
            	    						lv_reaction_constraint_8_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Reaction_Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConstraintsAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleReaction_Constraint"
    // InternalPkgDsl.g:1152:1: entryRuleReaction_Constraint returns [EObject current=null] : iv_ruleReaction_Constraint= ruleReaction_Constraint EOF ;
    public final EObject entryRuleReaction_Constraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction_Constraint = null;


        try {
            // InternalPkgDsl.g:1152:60: (iv_ruleReaction_Constraint= ruleReaction_Constraint EOF )
            // InternalPkgDsl.g:1153:2: iv_ruleReaction_Constraint= ruleReaction_Constraint EOF
            {
             newCompositeNode(grammarAccess.getReaction_ConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReaction_Constraint=ruleReaction_Constraint();

            state._fsp--;

             current =iv_ruleReaction_Constraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReaction_Constraint"


    // $ANTLR start "ruleReaction_Constraint"
    // InternalPkgDsl.g:1159:1: ruleReaction_Constraint returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Reaction-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'SCOPE:' ( (lv_scope_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= ruleRC_TimingExpression ) )* otherlv_13= '}' ) ;
    public final EObject ruleReaction_Constraint() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_scope_11_0=null;
        Token otherlv_13=null;
        EObject lv_timingexpression_12_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:1165:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Reaction-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'SCOPE:' ( (lv_scope_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= ruleRC_TimingExpression ) )* otherlv_13= '}' ) )
            // InternalPkgDsl.g:1166:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Reaction-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'SCOPE:' ( (lv_scope_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= ruleRC_TimingExpression ) )* otherlv_13= '}' )
            {
            // InternalPkgDsl.g:1166:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Reaction-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'SCOPE:' ( (lv_scope_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= ruleRC_TimingExpression ) )* otherlv_13= '}' )
            // InternalPkgDsl.g:1167:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Reaction-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'SCOPE:' ( (lv_scope_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= ruleRC_TimingExpression ) )* otherlv_13= '}'
            {
            // InternalPkgDsl.g:1167:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:1168:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:1168:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:1169:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_define_0_0, grammarAccess.getReaction_ConstraintAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReaction_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getReaction_ConstraintAccess().getReactionConstraintKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getReaction_ConstraintAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:1193:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:1194:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1194:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:1195:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getReaction_ConstraintAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReaction_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getReaction_ConstraintAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:1215:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:1216:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1216:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:1217:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getReaction_ConstraintAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReaction_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getReaction_ConstraintAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:1237:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:1238:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1238:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:1239:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getReaction_ConstraintAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReaction_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getReaction_ConstraintAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:1259:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:1260:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1260:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:1261:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_name_9_0, grammarAccess.getReaction_ConstraintAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReaction_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getReaction_ConstraintAccess().getSCOPEKeyword_10());
            		
            // InternalPkgDsl.g:1281:3: ( (lv_scope_11_0= RULE_STRING ) )
            // InternalPkgDsl.g:1282:4: (lv_scope_11_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1282:4: (lv_scope_11_0= RULE_STRING )
            // InternalPkgDsl.g:1283:5: lv_scope_11_0= RULE_STRING
            {
            lv_scope_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_scope_11_0, grammarAccess.getReaction_ConstraintAccess().getScopeSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReaction_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scope",
            						lv_scope_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:1299:3: ( (lv_timingexpression_12_0= ruleRC_TimingExpression ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPkgDsl.g:1300:4: (lv_timingexpression_12_0= ruleRC_TimingExpression )
            	    {
            	    // InternalPkgDsl.g:1300:4: (lv_timingexpression_12_0= ruleRC_TimingExpression )
            	    // InternalPkgDsl.g:1301:5: lv_timingexpression_12_0= ruleRC_TimingExpression
            	    {

            	    					newCompositeNode(grammarAccess.getReaction_ConstraintAccess().getTimingexpressionRC_TimingExpressionParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timingexpression_12_0=ruleRC_TimingExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReaction_ConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timingexpression",
            	    						lv_timingexpression_12_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.RC_TimingExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getReaction_ConstraintAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReaction_Constraint"


    // $ANTLR start "entryRuleRC_TimingExpression"
    // InternalPkgDsl.g:1326:1: entryRuleRC_TimingExpression returns [EObject current=null] : iv_ruleRC_TimingExpression= ruleRC_TimingExpression EOF ;
    public final EObject entryRuleRC_TimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRC_TimingExpression = null;


        try {
            // InternalPkgDsl.g:1326:60: (iv_ruleRC_TimingExpression= ruleRC_TimingExpression EOF )
            // InternalPkgDsl.g:1327:2: iv_ruleRC_TimingExpression= ruleRC_TimingExpression EOF
            {
             newCompositeNode(grammarAccess.getRC_TimingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRC_TimingExpression=ruleRC_TimingExpression();

            state._fsp--;

             current =iv_ruleRC_TimingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRC_TimingExpression"


    // $ANTLR start "ruleRC_TimingExpression"
    // InternalPkgDsl.g:1333:1: ruleRC_TimingExpression returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleRC_TimingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:1339:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalPkgDsl.g:1340:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalPkgDsl.g:1340:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalPkgDsl.g:1341:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            // InternalPkgDsl.g:1341:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:1342:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:1342:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:1343:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_define_0_0, grammarAccess.getRC_TimingExpressionAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRC_TimingExpressionAccess().getTimingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRC_TimingExpressionAccess().getNAMEKeyword_2());
            		
            // InternalPkgDsl.g:1367:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:1368:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1368:4: (lv_name_3_0= RULE_STRING )
            // InternalPkgDsl.g:1369:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getRC_TimingExpressionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRC_TimingExpressionAccess().getTYPEKeyword_4());
            		
            // InternalPkgDsl.g:1389:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:1390:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1390:4: (lv_type_5_0= RULE_STRING )
            // InternalPkgDsl.g:1391:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_type_5_0, grammarAccess.getRC_TimingExpressionAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRC_TimingExpressionAccess().getValueKeyword_6());
            		
            // InternalPkgDsl.g:1411:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:1412:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1412:4: (lv_value_7_0= RULE_STRING )
            // InternalPkgDsl.g:1413:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_value_7_0, grammarAccess.getRC_TimingExpressionAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRC_TimingExpressionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRC_TimingExpression"


    // $ANTLR start "entryRulePattern_Constraint"
    // InternalPkgDsl.g:1437:1: entryRulePattern_Constraint returns [EObject current=null] : iv_rulePattern_Constraint= rulePattern_Constraint EOF ;
    public final EObject entryRulePattern_Constraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern_Constraint = null;


        try {
            // InternalPkgDsl.g:1437:59: (iv_rulePattern_Constraint= rulePattern_Constraint EOF )
            // InternalPkgDsl.g:1438:2: iv_rulePattern_Constraint= rulePattern_Constraint EOF
            {
             newCompositeNode(grammarAccess.getPattern_ConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern_Constraint=rulePattern_Constraint();

            state._fsp--;

             current =iv_rulePattern_Constraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern_Constraint"


    // $ANTLR start "rulePattern_Constraint"
    // InternalPkgDsl.g:1444:1: rulePattern_Constraint returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Pattern-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression ) )* otherlv_13= '}' ) ;
    public final EObject rulePattern_Constraint() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_event_11_0=null;
        Token otherlv_13=null;
        EObject lv_timingexpression_12_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:1450:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Pattern-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression ) )* otherlv_13= '}' ) )
            // InternalPkgDsl.g:1451:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Pattern-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression ) )* otherlv_13= '}' )
            {
            // InternalPkgDsl.g:1451:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Pattern-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression ) )* otherlv_13= '}' )
            // InternalPkgDsl.g:1452:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Pattern-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression ) )* otherlv_13= '}'
            {
            // InternalPkgDsl.g:1452:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:1453:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:1453:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:1454:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_define_0_0, grammarAccess.getPattern_ConstraintAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPattern_ConstraintAccess().getPatternConstraintKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPattern_ConstraintAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:1478:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:1479:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1479:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:1480:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getPattern_ConstraintAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPattern_ConstraintAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:1500:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:1501:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1501:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:1502:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getPattern_ConstraintAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPattern_ConstraintAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:1522:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:1523:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1523:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:1524:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getPattern_ConstraintAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getPattern_ConstraintAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:1544:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:1545:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1545:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:1546:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_name_9_0, grammarAccess.getPattern_ConstraintAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getPattern_ConstraintAccess().getEVENTKeyword_10());
            		
            // InternalPkgDsl.g:1566:3: ( (lv_event_11_0= RULE_STRING ) )
            // InternalPkgDsl.g:1567:4: (lv_event_11_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1567:4: (lv_event_11_0= RULE_STRING )
            // InternalPkgDsl.g:1568:5: lv_event_11_0= RULE_STRING
            {
            lv_event_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_event_11_0, grammarAccess.getPattern_ConstraintAccess().getEventSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:1584:3: ( (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPkgDsl.g:1585:4: (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression )
            	    {
            	    // InternalPkgDsl.g:1585:4: (lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression )
            	    // InternalPkgDsl.g:1586:5: lv_timingexpression_12_0= rulePattern_Constraint_TimingExpression
            	    {

            	    					newCompositeNode(grammarAccess.getPattern_ConstraintAccess().getTimingexpressionPattern_Constraint_TimingExpressionParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timingexpression_12_0=rulePattern_Constraint_TimingExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPattern_ConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timingexpression",
            	    						lv_timingexpression_12_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Pattern_Constraint_TimingExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPattern_ConstraintAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern_Constraint"


    // $ANTLR start "entryRulePattern_Constraint_TimingExpression"
    // InternalPkgDsl.g:1611:1: entryRulePattern_Constraint_TimingExpression returns [EObject current=null] : iv_rulePattern_Constraint_TimingExpression= rulePattern_Constraint_TimingExpression EOF ;
    public final EObject entryRulePattern_Constraint_TimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern_Constraint_TimingExpression = null;


        try {
            // InternalPkgDsl.g:1611:76: (iv_rulePattern_Constraint_TimingExpression= rulePattern_Constraint_TimingExpression EOF )
            // InternalPkgDsl.g:1612:2: iv_rulePattern_Constraint_TimingExpression= rulePattern_Constraint_TimingExpression EOF
            {
             newCompositeNode(grammarAccess.getPattern_Constraint_TimingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern_Constraint_TimingExpression=rulePattern_Constraint_TimingExpression();

            state._fsp--;

             current =iv_rulePattern_Constraint_TimingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern_Constraint_TimingExpression"


    // $ANTLR start "rulePattern_Constraint_TimingExpression"
    // InternalPkgDsl.g:1618:1: rulePattern_Constraint_TimingExpression returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject rulePattern_Constraint_TimingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:1624:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalPkgDsl.g:1625:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalPkgDsl.g:1625:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalPkgDsl.g:1626:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            // InternalPkgDsl.g:1626:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:1627:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:1627:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:1628:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_define_0_0, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_Constraint_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getTimingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getNAMEKeyword_2());
            		
            // InternalPkgDsl.g:1652:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:1653:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1653:4: (lv_name_3_0= RULE_STRING )
            // InternalPkgDsl.g:1654:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_Constraint_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getTYPEKeyword_4());
            		
            // InternalPkgDsl.g:1674:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:1675:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1675:4: (lv_type_5_0= RULE_STRING )
            // InternalPkgDsl.g:1676:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_type_5_0, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_Constraint_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getValueKeyword_6());
            		
            // InternalPkgDsl.g:1696:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:1697:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1697:4: (lv_value_7_0= RULE_STRING )
            // InternalPkgDsl.g:1698:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_value_7_0, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPattern_Constraint_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPattern_Constraint_TimingExpressionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern_Constraint_TimingExpression"


    // $ANTLR start "entryRuleOrder_Constraint"
    // InternalPkgDsl.g:1722:1: entryRuleOrder_Constraint returns [EObject current=null] : iv_ruleOrder_Constraint= ruleOrder_Constraint EOF ;
    public final EObject entryRuleOrder_Constraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder_Constraint = null;


        try {
            // InternalPkgDsl.g:1722:57: (iv_ruleOrder_Constraint= ruleOrder_Constraint EOF )
            // InternalPkgDsl.g:1723:2: iv_ruleOrder_Constraint= ruleOrder_Constraint EOF
            {
             newCompositeNode(grammarAccess.getOrder_ConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder_Constraint=ruleOrder_Constraint();

            state._fsp--;

             current =iv_ruleOrder_Constraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder_Constraint"


    // $ANTLR start "ruleOrder_Constraint"
    // InternalPkgDsl.g:1729:1: ruleOrder_Constraint returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Order-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) otherlv_14= '}' ) ;
    public final EObject ruleOrder_Constraint() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_target_11_0=null;
        Token otherlv_12=null;
        Token lv_source_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:1735:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Order-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) otherlv_14= '}' ) )
            // InternalPkgDsl.g:1736:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Order-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) otherlv_14= '}' )
            {
            // InternalPkgDsl.g:1736:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Order-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) otherlv_14= '}' )
            // InternalPkgDsl.g:1737:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Order-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) otherlv_14= '}'
            {
            // InternalPkgDsl.g:1737:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:1738:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:1738:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:1739:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_define_0_0, grammarAccess.getOrder_ConstraintAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrder_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getOrder_ConstraintAccess().getOrderConstraintKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getOrder_ConstraintAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:1763:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:1764:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1764:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:1765:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getOrder_ConstraintAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrder_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getOrder_ConstraintAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:1785:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:1786:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1786:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:1787:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getOrder_ConstraintAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrder_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getOrder_ConstraintAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:1807:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:1808:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1808:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:1809:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getOrder_ConstraintAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrder_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getOrder_ConstraintAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:1829:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:1830:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1830:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:1831:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_name_9_0, grammarAccess.getOrder_ConstraintAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrder_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getOrder_ConstraintAccess().getTARGETKeyword_10());
            		
            // InternalPkgDsl.g:1851:3: ( (lv_target_11_0= RULE_STRING ) )
            // InternalPkgDsl.g:1852:4: (lv_target_11_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1852:4: (lv_target_11_0= RULE_STRING )
            // InternalPkgDsl.g:1853:5: lv_target_11_0= RULE_STRING
            {
            lv_target_11_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_target_11_0, grammarAccess.getOrder_ConstraintAccess().getTargetSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrder_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getOrder_ConstraintAccess().getSOURCEKeyword_12());
            		
            // InternalPkgDsl.g:1873:3: ( (lv_source_13_0= RULE_STRING ) )
            // InternalPkgDsl.g:1874:4: (lv_source_13_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1874:4: (lv_source_13_0= RULE_STRING )
            // InternalPkgDsl.g:1875:5: lv_source_13_0= RULE_STRING
            {
            lv_source_13_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_source_13_0, grammarAccess.getOrder_ConstraintAccess().getSourceSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrder_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getOrder_ConstraintAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder_Constraint"


    // $ANTLR start "entryRuleExecution_Time_Constraint"
    // InternalPkgDsl.g:1899:1: entryRuleExecution_Time_Constraint returns [EObject current=null] : iv_ruleExecution_Time_Constraint= ruleExecution_Time_Constraint EOF ;
    public final EObject entryRuleExecution_Time_Constraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecution_Time_Constraint = null;


        try {
            // InternalPkgDsl.g:1899:66: (iv_ruleExecution_Time_Constraint= ruleExecution_Time_Constraint EOF )
            // InternalPkgDsl.g:1900:2: iv_ruleExecution_Time_Constraint= ruleExecution_Time_Constraint EOF
            {
             newCompositeNode(grammarAccess.getExecution_Time_ConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecution_Time_Constraint=ruleExecution_Time_Constraint();

            state._fsp--;

             current =iv_ruleExecution_Time_Constraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecution_Time_Constraint"


    // $ANTLR start "ruleExecution_Time_Constraint"
    // InternalPkgDsl.g:1906:1: ruleExecution_Time_Constraint returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Execution-Time-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'RESUME-REFS:' ( (lv_resume_ref_11_0= RULE_STRING ) ) )? (otherlv_12= 'PREEMPTION-REFS:' ( (lv_preemption_refs_13_0= RULE_STRING ) ) )? otherlv_14= 'START:' ( (lv_start_15_0= RULE_STRING ) ) otherlv_16= 'STOP:' ( (lv_stop_17_0= RULE_STRING ) ) ( (lv_timingexpression_18_0= ruleETC_TimingExpression ) )* otherlv_19= '}' ) ;
    public final EObject ruleExecution_Time_Constraint() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_resume_ref_11_0=null;
        Token otherlv_12=null;
        Token lv_preemption_refs_13_0=null;
        Token otherlv_14=null;
        Token lv_start_15_0=null;
        Token otherlv_16=null;
        Token lv_stop_17_0=null;
        Token otherlv_19=null;
        EObject lv_timingexpression_18_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:1912:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Execution-Time-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'RESUME-REFS:' ( (lv_resume_ref_11_0= RULE_STRING ) ) )? (otherlv_12= 'PREEMPTION-REFS:' ( (lv_preemption_refs_13_0= RULE_STRING ) ) )? otherlv_14= 'START:' ( (lv_start_15_0= RULE_STRING ) ) otherlv_16= 'STOP:' ( (lv_stop_17_0= RULE_STRING ) ) ( (lv_timingexpression_18_0= ruleETC_TimingExpression ) )* otherlv_19= '}' ) )
            // InternalPkgDsl.g:1913:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Execution-Time-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'RESUME-REFS:' ( (lv_resume_ref_11_0= RULE_STRING ) ) )? (otherlv_12= 'PREEMPTION-REFS:' ( (lv_preemption_refs_13_0= RULE_STRING ) ) )? otherlv_14= 'START:' ( (lv_start_15_0= RULE_STRING ) ) otherlv_16= 'STOP:' ( (lv_stop_17_0= RULE_STRING ) ) ( (lv_timingexpression_18_0= ruleETC_TimingExpression ) )* otherlv_19= '}' )
            {
            // InternalPkgDsl.g:1913:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Execution-Time-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'RESUME-REFS:' ( (lv_resume_ref_11_0= RULE_STRING ) ) )? (otherlv_12= 'PREEMPTION-REFS:' ( (lv_preemption_refs_13_0= RULE_STRING ) ) )? otherlv_14= 'START:' ( (lv_start_15_0= RULE_STRING ) ) otherlv_16= 'STOP:' ( (lv_stop_17_0= RULE_STRING ) ) ( (lv_timingexpression_18_0= ruleETC_TimingExpression ) )* otherlv_19= '}' )
            // InternalPkgDsl.g:1914:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Execution-Time-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'RESUME-REFS:' ( (lv_resume_ref_11_0= RULE_STRING ) ) )? (otherlv_12= 'PREEMPTION-REFS:' ( (lv_preemption_refs_13_0= RULE_STRING ) ) )? otherlv_14= 'START:' ( (lv_start_15_0= RULE_STRING ) ) otherlv_16= 'STOP:' ( (lv_stop_17_0= RULE_STRING ) ) ( (lv_timingexpression_18_0= ruleETC_TimingExpression ) )* otherlv_19= '}'
            {
            // InternalPkgDsl.g:1914:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:1915:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:1915:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:1916:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_define_0_0, grammarAccess.getExecution_Time_ConstraintAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getExecution_Time_ConstraintAccess().getExecutionTimeConstraintKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExecution_Time_ConstraintAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:1940:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:1941:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1941:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:1942:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getExecution_Time_ConstraintAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getExecution_Time_ConstraintAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:1962:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:1963:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1963:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:1964:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getExecution_Time_ConstraintAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getExecution_Time_ConstraintAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:1984:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:1985:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:1985:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:1986:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getExecution_Time_ConstraintAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getExecution_Time_ConstraintAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:2006:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:2007:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2007:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:2008:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_name_9_0, grammarAccess.getExecution_Time_ConstraintAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:2024:3: (otherlv_10= 'RESUME-REFS:' ( (lv_resume_ref_11_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPkgDsl.g:2025:4: otherlv_10= 'RESUME-REFS:' ( (lv_resume_ref_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getExecution_Time_ConstraintAccess().getRESUMEREFSKeyword_10_0());
                    			
                    // InternalPkgDsl.g:2029:4: ( (lv_resume_ref_11_0= RULE_STRING ) )
                    // InternalPkgDsl.g:2030:5: (lv_resume_ref_11_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:2030:5: (lv_resume_ref_11_0= RULE_STRING )
                    // InternalPkgDsl.g:2031:6: lv_resume_ref_11_0= RULE_STRING
                    {
                    lv_resume_ref_11_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_resume_ref_11_0, grammarAccess.getExecution_Time_ConstraintAccess().getResume_refSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"resume_ref",
                    							lv_resume_ref_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:2048:3: (otherlv_12= 'PREEMPTION-REFS:' ( (lv_preemption_refs_13_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPkgDsl.g:2049:4: otherlv_12= 'PREEMPTION-REFS:' ( (lv_preemption_refs_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getExecution_Time_ConstraintAccess().getPREEMPTIONREFSKeyword_11_0());
                    			
                    // InternalPkgDsl.g:2053:4: ( (lv_preemption_refs_13_0= RULE_STRING ) )
                    // InternalPkgDsl.g:2054:5: (lv_preemption_refs_13_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:2054:5: (lv_preemption_refs_13_0= RULE_STRING )
                    // InternalPkgDsl.g:2055:6: lv_preemption_refs_13_0= RULE_STRING
                    {
                    lv_preemption_refs_13_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

                    						newLeafNode(lv_preemption_refs_13_0, grammarAccess.getExecution_Time_ConstraintAccess().getPreemption_refsSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"preemption_refs",
                    							lv_preemption_refs_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getExecution_Time_ConstraintAccess().getSTARTKeyword_12());
            		
            // InternalPkgDsl.g:2076:3: ( (lv_start_15_0= RULE_STRING ) )
            // InternalPkgDsl.g:2077:4: (lv_start_15_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2077:4: (lv_start_15_0= RULE_STRING )
            // InternalPkgDsl.g:2078:5: lv_start_15_0= RULE_STRING
            {
            lv_start_15_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_start_15_0, grammarAccess.getExecution_Time_ConstraintAccess().getStartSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getExecution_Time_ConstraintAccess().getSTOPKeyword_14());
            		
            // InternalPkgDsl.g:2098:3: ( (lv_stop_17_0= RULE_STRING ) )
            // InternalPkgDsl.g:2099:4: (lv_stop_17_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2099:4: (lv_stop_17_0= RULE_STRING )
            // InternalPkgDsl.g:2100:5: lv_stop_17_0= RULE_STRING
            {
            lv_stop_17_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_stop_17_0, grammarAccess.getExecution_Time_ConstraintAccess().getStopSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecution_Time_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stop",
            						lv_stop_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:2116:3: ( (lv_timingexpression_18_0= ruleETC_TimingExpression ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPkgDsl.g:2117:4: (lv_timingexpression_18_0= ruleETC_TimingExpression )
            	    {
            	    // InternalPkgDsl.g:2117:4: (lv_timingexpression_18_0= ruleETC_TimingExpression )
            	    // InternalPkgDsl.g:2118:5: lv_timingexpression_18_0= ruleETC_TimingExpression
            	    {

            	    					newCompositeNode(grammarAccess.getExecution_Time_ConstraintAccess().getTimingexpressionETC_TimingExpressionParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timingexpression_18_0=ruleETC_TimingExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExecution_Time_ConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timingexpression",
            	    						lv_timingexpression_18_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.ETC_TimingExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getExecution_Time_ConstraintAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecution_Time_Constraint"


    // $ANTLR start "entryRuleETC_TimingExpression"
    // InternalPkgDsl.g:2143:1: entryRuleETC_TimingExpression returns [EObject current=null] : iv_ruleETC_TimingExpression= ruleETC_TimingExpression EOF ;
    public final EObject entryRuleETC_TimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETC_TimingExpression = null;


        try {
            // InternalPkgDsl.g:2143:61: (iv_ruleETC_TimingExpression= ruleETC_TimingExpression EOF )
            // InternalPkgDsl.g:2144:2: iv_ruleETC_TimingExpression= ruleETC_TimingExpression EOF
            {
             newCompositeNode(grammarAccess.getETC_TimingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETC_TimingExpression=ruleETC_TimingExpression();

            state._fsp--;

             current =iv_ruleETC_TimingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETC_TimingExpression"


    // $ANTLR start "ruleETC_TimingExpression"
    // InternalPkgDsl.g:2150:1: ruleETC_TimingExpression returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleETC_TimingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:2156:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalPkgDsl.g:2157:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalPkgDsl.g:2157:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalPkgDsl.g:2158:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            // InternalPkgDsl.g:2158:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:2159:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:2159:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:2160:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_define_0_0, grammarAccess.getETC_TimingExpressionAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getETC_TimingExpressionAccess().getTimingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getETC_TimingExpressionAccess().getNAMEKeyword_2());
            		
            // InternalPkgDsl.g:2184:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:2185:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2185:4: (lv_name_3_0= RULE_STRING )
            // InternalPkgDsl.g:2186:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getETC_TimingExpressionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getETC_TimingExpressionAccess().getTYPEKeyword_4());
            		
            // InternalPkgDsl.g:2206:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:2207:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2207:4: (lv_type_5_0= RULE_STRING )
            // InternalPkgDsl.g:2208:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_type_5_0, grammarAccess.getETC_TimingExpressionAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getETC_TimingExpressionAccess().getValueKeyword_6());
            		
            // InternalPkgDsl.g:2228:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:2229:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2229:4: (lv_value_7_0= RULE_STRING )
            // InternalPkgDsl.g:2230:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_value_7_0, grammarAccess.getETC_TimingExpressionAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getETC_TimingExpressionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETC_TimingExpression"


    // $ANTLR start "entryRuleAge_Constraint"
    // InternalPkgDsl.g:2254:1: entryRuleAge_Constraint returns [EObject current=null] : iv_ruleAge_Constraint= ruleAge_Constraint EOF ;
    public final EObject entryRuleAge_Constraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAge_Constraint = null;


        try {
            // InternalPkgDsl.g:2254:55: (iv_ruleAge_Constraint= ruleAge_Constraint EOF )
            // InternalPkgDsl.g:2255:2: iv_ruleAge_Constraint= ruleAge_Constraint EOF
            {
             newCompositeNode(grammarAccess.getAge_ConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAge_Constraint=ruleAge_Constraint();

            state._fsp--;

             current =iv_ruleAge_Constraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAge_Constraint"


    // $ANTLR start "ruleAge_Constraint"
    // InternalPkgDsl.g:2261:1: ruleAge_Constraint returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Age-Constraint {' ( (lv_test_2_0= ruletest1 ) ) ) ;
    public final EObject ruleAge_Constraint() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        EObject lv_test_2_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:2267:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Age-Constraint {' ( (lv_test_2_0= ruletest1 ) ) ) )
            // InternalPkgDsl.g:2268:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Age-Constraint {' ( (lv_test_2_0= ruletest1 ) ) )
            {
            // InternalPkgDsl.g:2268:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Age-Constraint {' ( (lv_test_2_0= ruletest1 ) ) )
            // InternalPkgDsl.g:2269:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Age-Constraint {' ( (lv_test_2_0= ruletest1 ) )
            {
            // InternalPkgDsl.g:2269:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:2270:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:2270:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:2271:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_define_0_0, grammarAccess.getAge_ConstraintAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAge_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAge_ConstraintAccess().getAgeConstraintKeyword_1());
            		
            // InternalPkgDsl.g:2291:3: ( (lv_test_2_0= ruletest1 ) )
            // InternalPkgDsl.g:2292:4: (lv_test_2_0= ruletest1 )
            {
            // InternalPkgDsl.g:2292:4: (lv_test_2_0= ruletest1 )
            // InternalPkgDsl.g:2293:5: lv_test_2_0= ruletest1
            {

            					newCompositeNode(grammarAccess.getAge_ConstraintAccess().getTestTest1ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_test_2_0=ruletest1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAge_ConstraintRule());
            					}
            					set(
            						current,
            						"test",
            						lv_test_2_0,
            						"webdsl.epackage.pkgdsl.PkgDsl.test1");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAge_Constraint"


    // $ANTLR start "entryRuletest1"
    // InternalPkgDsl.g:2314:1: entryRuletest1 returns [EObject current=null] : iv_ruletest1= ruletest1 EOF ;
    public final EObject entryRuletest1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletest1 = null;


        try {
            // InternalPkgDsl.g:2314:46: (iv_ruletest1= ruletest1 EOF )
            // InternalPkgDsl.g:2315:2: iv_ruletest1= ruletest1 EOF
            {
             newCompositeNode(grammarAccess.getTest1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruletest1=ruletest1();

            state._fsp--;

             current =iv_ruletest1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletest1"


    // $ANTLR start "ruletest1"
    // InternalPkgDsl.g:2321:1: ruletest1 returns [EObject current=null] : (otherlv_0= 'UUID:' ( (lv_uuid_1_0= RULE_STRING ) ) otherlv_2= 'SHORT-NAME:' ( (lv_shortname_3_0= RULE_STRING ) ) otherlv_4= 'CATEGORY:' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'NAME:' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'SCOPE:' ( (lv_scope_9_0= RULE_STRING ) ) ( (lv_timingexpression_10_0= ruleAC_TimingExpression ) )* otherlv_11= '}' ) ;
    public final EObject ruletest1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_uuid_1_0=null;
        Token otherlv_2=null;
        Token lv_shortname_3_0=null;
        Token otherlv_4=null;
        Token lv_category_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token lv_scope_9_0=null;
        Token otherlv_11=null;
        EObject lv_timingexpression_10_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:2327:2: ( (otherlv_0= 'UUID:' ( (lv_uuid_1_0= RULE_STRING ) ) otherlv_2= 'SHORT-NAME:' ( (lv_shortname_3_0= RULE_STRING ) ) otherlv_4= 'CATEGORY:' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'NAME:' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'SCOPE:' ( (lv_scope_9_0= RULE_STRING ) ) ( (lv_timingexpression_10_0= ruleAC_TimingExpression ) )* otherlv_11= '}' ) )
            // InternalPkgDsl.g:2328:2: (otherlv_0= 'UUID:' ( (lv_uuid_1_0= RULE_STRING ) ) otherlv_2= 'SHORT-NAME:' ( (lv_shortname_3_0= RULE_STRING ) ) otherlv_4= 'CATEGORY:' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'NAME:' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'SCOPE:' ( (lv_scope_9_0= RULE_STRING ) ) ( (lv_timingexpression_10_0= ruleAC_TimingExpression ) )* otherlv_11= '}' )
            {
            // InternalPkgDsl.g:2328:2: (otherlv_0= 'UUID:' ( (lv_uuid_1_0= RULE_STRING ) ) otherlv_2= 'SHORT-NAME:' ( (lv_shortname_3_0= RULE_STRING ) ) otherlv_4= 'CATEGORY:' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'NAME:' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'SCOPE:' ( (lv_scope_9_0= RULE_STRING ) ) ( (lv_timingexpression_10_0= ruleAC_TimingExpression ) )* otherlv_11= '}' )
            // InternalPkgDsl.g:2329:3: otherlv_0= 'UUID:' ( (lv_uuid_1_0= RULE_STRING ) ) otherlv_2= 'SHORT-NAME:' ( (lv_shortname_3_0= RULE_STRING ) ) otherlv_4= 'CATEGORY:' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'NAME:' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= 'SCOPE:' ( (lv_scope_9_0= RULE_STRING ) ) ( (lv_timingexpression_10_0= ruleAC_TimingExpression ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTest1Access().getUUIDKeyword_0());
            		
            // InternalPkgDsl.g:2333:3: ( (lv_uuid_1_0= RULE_STRING ) )
            // InternalPkgDsl.g:2334:4: (lv_uuid_1_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2334:4: (lv_uuid_1_0= RULE_STRING )
            // InternalPkgDsl.g:2335:5: lv_uuid_1_0= RULE_STRING
            {
            lv_uuid_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_1_0, grammarAccess.getTest1Access().getUuidSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTest1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTest1Access().getSHORTNAMEKeyword_2());
            		
            // InternalPkgDsl.g:2355:3: ( (lv_shortname_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:2356:4: (lv_shortname_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2356:4: (lv_shortname_3_0= RULE_STRING )
            // InternalPkgDsl.g:2357:5: lv_shortname_3_0= RULE_STRING
            {
            lv_shortname_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_3_0, grammarAccess.getTest1Access().getShortnameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTest1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTest1Access().getCATEGORYKeyword_4());
            		
            // InternalPkgDsl.g:2377:3: ( (lv_category_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:2378:4: (lv_category_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2378:4: (lv_category_5_0= RULE_STRING )
            // InternalPkgDsl.g:2379:5: lv_category_5_0= RULE_STRING
            {
            lv_category_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_5_0, grammarAccess.getTest1Access().getCategorySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTest1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getTest1Access().getNAMEKeyword_6());
            		
            // InternalPkgDsl.g:2399:3: ( (lv_name_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:2400:4: (lv_name_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2400:4: (lv_name_7_0= RULE_STRING )
            // InternalPkgDsl.g:2401:5: lv_name_7_0= RULE_STRING
            {
            lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_name_7_0, grammarAccess.getTest1Access().getNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTest1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getTest1Access().getSCOPEKeyword_8());
            		
            // InternalPkgDsl.g:2421:3: ( (lv_scope_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:2422:4: (lv_scope_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2422:4: (lv_scope_9_0= RULE_STRING )
            // InternalPkgDsl.g:2423:5: lv_scope_9_0= RULE_STRING
            {
            lv_scope_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_scope_9_0, grammarAccess.getTest1Access().getScopeSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTest1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"scope",
            						lv_scope_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:2439:3: ( (lv_timingexpression_10_0= ruleAC_TimingExpression ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPkgDsl.g:2440:4: (lv_timingexpression_10_0= ruleAC_TimingExpression )
            	    {
            	    // InternalPkgDsl.g:2440:4: (lv_timingexpression_10_0= ruleAC_TimingExpression )
            	    // InternalPkgDsl.g:2441:5: lv_timingexpression_10_0= ruleAC_TimingExpression
            	    {

            	    					newCompositeNode(grammarAccess.getTest1Access().getTimingexpressionAC_TimingExpressionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timingexpression_10_0=ruleAC_TimingExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTest1Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"timingexpression",
            	    						lv_timingexpression_10_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.AC_TimingExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTest1Access().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletest1"


    // $ANTLR start "entryRuleAC_TimingExpression"
    // InternalPkgDsl.g:2466:1: entryRuleAC_TimingExpression returns [EObject current=null] : iv_ruleAC_TimingExpression= ruleAC_TimingExpression EOF ;
    public final EObject entryRuleAC_TimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAC_TimingExpression = null;


        try {
            // InternalPkgDsl.g:2466:60: (iv_ruleAC_TimingExpression= ruleAC_TimingExpression EOF )
            // InternalPkgDsl.g:2467:2: iv_ruleAC_TimingExpression= ruleAC_TimingExpression EOF
            {
             newCompositeNode(grammarAccess.getAC_TimingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAC_TimingExpression=ruleAC_TimingExpression();

            state._fsp--;

             current =iv_ruleAC_TimingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAC_TimingExpression"


    // $ANTLR start "ruleAC_TimingExpression"
    // InternalPkgDsl.g:2473:1: ruleAC_TimingExpression returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleAC_TimingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:2479:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalPkgDsl.g:2480:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalPkgDsl.g:2480:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalPkgDsl.g:2481:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            // InternalPkgDsl.g:2481:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:2482:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:2482:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:2483:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_define_0_0, grammarAccess.getAC_TimingExpressionAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAC_TimingExpressionAccess().getTimingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAC_TimingExpressionAccess().getNAMEKeyword_2());
            		
            // InternalPkgDsl.g:2507:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:2508:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2508:4: (lv_name_3_0= RULE_STRING )
            // InternalPkgDsl.g:2509:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAC_TimingExpressionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAC_TimingExpressionAccess().getTYPEKeyword_4());
            		
            // InternalPkgDsl.g:2529:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:2530:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2530:4: (lv_type_5_0= RULE_STRING )
            // InternalPkgDsl.g:2531:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_type_5_0, grammarAccess.getAC_TimingExpressionAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getAC_TimingExpressionAccess().getValueKeyword_6());
            		
            // InternalPkgDsl.g:2551:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:2552:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2552:4: (lv_value_7_0= RULE_STRING )
            // InternalPkgDsl.g:2553:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_value_7_0, grammarAccess.getAC_TimingExpressionAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAC_TimingExpressionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAC_TimingExpression"


    // $ANTLR start "entryRuleDelay_Constraint"
    // InternalPkgDsl.g:2577:1: entryRuleDelay_Constraint returns [EObject current=null] : iv_ruleDelay_Constraint= ruleDelay_Constraint EOF ;
    public final EObject entryRuleDelay_Constraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelay_Constraint = null;


        try {
            // InternalPkgDsl.g:2577:57: (iv_ruleDelay_Constraint= ruleDelay_Constraint EOF )
            // InternalPkgDsl.g:2578:2: iv_ruleDelay_Constraint= ruleDelay_Constraint EOF
            {
             newCompositeNode(grammarAccess.getDelay_ConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelay_Constraint=ruleDelay_Constraint();

            state._fsp--;

             current =iv_ruleDelay_Constraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelay_Constraint"


    // $ANTLR start "ruleDelay_Constraint"
    // InternalPkgDsl.g:2584:1: ruleDelay_Constraint returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Delay-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_timingexpression_14_0= ruleDC_TimingExpression ) )* otherlv_15= '}' ) ;
    public final EObject ruleDelay_Constraint() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_target_11_0=null;
        Token otherlv_12=null;
        Token lv_source_13_0=null;
        Token otherlv_15=null;
        EObject lv_timingexpression_14_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:2590:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Delay-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_timingexpression_14_0= ruleDC_TimingExpression ) )* otherlv_15= '}' ) )
            // InternalPkgDsl.g:2591:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Delay-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_timingexpression_14_0= ruleDC_TimingExpression ) )* otherlv_15= '}' )
            {
            // InternalPkgDsl.g:2591:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Delay-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_timingexpression_14_0= ruleDC_TimingExpression ) )* otherlv_15= '}' )
            // InternalPkgDsl.g:2592:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Delay-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'TARGET:' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= 'SOURCE:' ( (lv_source_13_0= RULE_STRING ) ) ( (lv_timingexpression_14_0= ruleDC_TimingExpression ) )* otherlv_15= '}'
            {
            // InternalPkgDsl.g:2592:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:2593:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:2593:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:2594:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_define_0_0, grammarAccess.getDelay_ConstraintAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelay_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDelay_ConstraintAccess().getDelayConstraintKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDelay_ConstraintAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:2618:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:2619:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2619:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:2620:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getDelay_ConstraintAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelay_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDelay_ConstraintAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:2640:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:2641:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2641:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:2642:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getDelay_ConstraintAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelay_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDelay_ConstraintAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:2662:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:2663:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2663:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:2664:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getDelay_ConstraintAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelay_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getDelay_ConstraintAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:2684:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:2685:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2685:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:2686:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_name_9_0, grammarAccess.getDelay_ConstraintAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelay_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getDelay_ConstraintAccess().getTARGETKeyword_10());
            		
            // InternalPkgDsl.g:2706:3: ( (lv_target_11_0= RULE_STRING ) )
            // InternalPkgDsl.g:2707:4: (lv_target_11_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2707:4: (lv_target_11_0= RULE_STRING )
            // InternalPkgDsl.g:2708:5: lv_target_11_0= RULE_STRING
            {
            lv_target_11_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_target_11_0, grammarAccess.getDelay_ConstraintAccess().getTargetSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelay_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getDelay_ConstraintAccess().getSOURCEKeyword_12());
            		
            // InternalPkgDsl.g:2728:3: ( (lv_source_13_0= RULE_STRING ) )
            // InternalPkgDsl.g:2729:4: (lv_source_13_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2729:4: (lv_source_13_0= RULE_STRING )
            // InternalPkgDsl.g:2730:5: lv_source_13_0= RULE_STRING
            {
            lv_source_13_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_source_13_0, grammarAccess.getDelay_ConstraintAccess().getSourceSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelay_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:2746:3: ( (lv_timingexpression_14_0= ruleDC_TimingExpression ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPkgDsl.g:2747:4: (lv_timingexpression_14_0= ruleDC_TimingExpression )
            	    {
            	    // InternalPkgDsl.g:2747:4: (lv_timingexpression_14_0= ruleDC_TimingExpression )
            	    // InternalPkgDsl.g:2748:5: lv_timingexpression_14_0= ruleDC_TimingExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDelay_ConstraintAccess().getTimingexpressionDC_TimingExpressionParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timingexpression_14_0=ruleDC_TimingExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDelay_ConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timingexpression",
            	    						lv_timingexpression_14_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.DC_TimingExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDelay_ConstraintAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelay_Constraint"


    // $ANTLR start "entryRuleDC_TimingExpression"
    // InternalPkgDsl.g:2773:1: entryRuleDC_TimingExpression returns [EObject current=null] : iv_ruleDC_TimingExpression= ruleDC_TimingExpression EOF ;
    public final EObject entryRuleDC_TimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDC_TimingExpression = null;


        try {
            // InternalPkgDsl.g:2773:60: (iv_ruleDC_TimingExpression= ruleDC_TimingExpression EOF )
            // InternalPkgDsl.g:2774:2: iv_ruleDC_TimingExpression= ruleDC_TimingExpression EOF
            {
             newCompositeNode(grammarAccess.getDC_TimingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDC_TimingExpression=ruleDC_TimingExpression();

            state._fsp--;

             current =iv_ruleDC_TimingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDC_TimingExpression"


    // $ANTLR start "ruleDC_TimingExpression"
    // InternalPkgDsl.g:2780:1: ruleDC_TimingExpression returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleDC_TimingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:2786:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalPkgDsl.g:2787:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalPkgDsl.g:2787:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalPkgDsl.g:2788:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            // InternalPkgDsl.g:2788:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:2789:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:2789:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:2790:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_define_0_0, grammarAccess.getDC_TimingExpressionAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDC_TimingExpressionAccess().getTimingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDC_TimingExpressionAccess().getNAMEKeyword_2());
            		
            // InternalPkgDsl.g:2814:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:2815:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2815:4: (lv_name_3_0= RULE_STRING )
            // InternalPkgDsl.g:2816:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDC_TimingExpressionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDC_TimingExpressionAccess().getTYPEKeyword_4());
            		
            // InternalPkgDsl.g:2836:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:2837:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2837:4: (lv_type_5_0= RULE_STRING )
            // InternalPkgDsl.g:2838:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_type_5_0, grammarAccess.getDC_TimingExpressionAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDC_TimingExpressionAccess().getValueKeyword_6());
            		
            // InternalPkgDsl.g:2858:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:2859:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2859:4: (lv_value_7_0= RULE_STRING )
            // InternalPkgDsl.g:2860:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_value_7_0, grammarAccess.getDC_TimingExpressionAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDC_TimingExpressionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDC_TimingExpression"


    // $ANTLR start "entryRulePeriodic_Constraint"
    // InternalPkgDsl.g:2884:1: entryRulePeriodic_Constraint returns [EObject current=null] : iv_rulePeriodic_Constraint= rulePeriodic_Constraint EOF ;
    public final EObject entryRulePeriodic_Constraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodic_Constraint = null;


        try {
            // InternalPkgDsl.g:2884:60: (iv_rulePeriodic_Constraint= rulePeriodic_Constraint EOF )
            // InternalPkgDsl.g:2885:2: iv_rulePeriodic_Constraint= rulePeriodic_Constraint EOF
            {
             newCompositeNode(grammarAccess.getPeriodic_ConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriodic_Constraint=rulePeriodic_Constraint();

            state._fsp--;

             current =iv_rulePeriodic_Constraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePeriodic_Constraint"


    // $ANTLR start "rulePeriodic_Constraint"
    // InternalPkgDsl.g:2891:1: rulePeriodic_Constraint returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Periodic-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePC_TimingExpression ) )* otherlv_13= '}' ) ;
    public final EObject rulePeriodic_Constraint() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_event_11_0=null;
        Token otherlv_13=null;
        EObject lv_timingexpression_12_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:2897:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Periodic-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePC_TimingExpression ) )* otherlv_13= '}' ) )
            // InternalPkgDsl.g:2898:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Periodic-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePC_TimingExpression ) )* otherlv_13= '}' )
            {
            // InternalPkgDsl.g:2898:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Periodic-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePC_TimingExpression ) )* otherlv_13= '}' )
            // InternalPkgDsl.g:2899:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Periodic-Constraint {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'EVENT:' ( (lv_event_11_0= RULE_STRING ) ) ( (lv_timingexpression_12_0= rulePC_TimingExpression ) )* otherlv_13= '}'
            {
            // InternalPkgDsl.g:2899:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:2900:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:2900:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:2901:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(lv_define_0_0, grammarAccess.getPeriodic_ConstraintAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodic_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPeriodic_ConstraintAccess().getPeriodicConstraintKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPeriodic_ConstraintAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:2925:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:2926:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2926:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:2927:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getPeriodic_ConstraintAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodic_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPeriodic_ConstraintAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:2947:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:2948:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2948:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:2949:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getPeriodic_ConstraintAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodic_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPeriodic_ConstraintAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:2969:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:2970:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2970:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:2971:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getPeriodic_ConstraintAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodic_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getPeriodic_ConstraintAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:2991:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:2992:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:2992:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:2993:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_name_9_0, grammarAccess.getPeriodic_ConstraintAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodic_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getPeriodic_ConstraintAccess().getEVENTKeyword_10());
            		
            // InternalPkgDsl.g:3013:3: ( (lv_event_11_0= RULE_STRING ) )
            // InternalPkgDsl.g:3014:4: (lv_event_11_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3014:4: (lv_event_11_0= RULE_STRING )
            // InternalPkgDsl.g:3015:5: lv_event_11_0= RULE_STRING
            {
            lv_event_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_event_11_0, grammarAccess.getPeriodic_ConstraintAccess().getEventSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodic_ConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:3031:3: ( (lv_timingexpression_12_0= rulePC_TimingExpression ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPkgDsl.g:3032:4: (lv_timingexpression_12_0= rulePC_TimingExpression )
            	    {
            	    // InternalPkgDsl.g:3032:4: (lv_timingexpression_12_0= rulePC_TimingExpression )
            	    // InternalPkgDsl.g:3033:5: lv_timingexpression_12_0= rulePC_TimingExpression
            	    {

            	    					newCompositeNode(grammarAccess.getPeriodic_ConstraintAccess().getTimingexpressionPC_TimingExpressionParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_timingexpression_12_0=rulePC_TimingExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPeriodic_ConstraintRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timingexpression",
            	    						lv_timingexpression_12_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.PC_TimingExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPeriodic_ConstraintAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeriodic_Constraint"


    // $ANTLR start "entryRulePC_TimingExpression"
    // InternalPkgDsl.g:3058:1: entryRulePC_TimingExpression returns [EObject current=null] : iv_rulePC_TimingExpression= rulePC_TimingExpression EOF ;
    public final EObject entryRulePC_TimingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePC_TimingExpression = null;


        try {
            // InternalPkgDsl.g:3058:60: (iv_rulePC_TimingExpression= rulePC_TimingExpression EOF )
            // InternalPkgDsl.g:3059:2: iv_rulePC_TimingExpression= rulePC_TimingExpression EOF
            {
             newCompositeNode(grammarAccess.getPC_TimingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePC_TimingExpression=rulePC_TimingExpression();

            state._fsp--;

             current =iv_rulePC_TimingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePC_TimingExpression"


    // $ANTLR start "rulePC_TimingExpression"
    // InternalPkgDsl.g:3065:1: rulePC_TimingExpression returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject rulePC_TimingExpression() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:3071:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalPkgDsl.g:3072:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalPkgDsl.g:3072:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalPkgDsl.g:3073:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Timing Expression {' otherlv_2= 'NAME:' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'TYPE:' ( (lv_type_5_0= RULE_STRING ) ) otherlv_6= 'Value:' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            // InternalPkgDsl.g:3073:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:3074:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:3074:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:3075:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_define_0_0, grammarAccess.getPC_TimingExpressionAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPC_TimingExpressionAccess().getTimingExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPC_TimingExpressionAccess().getNAMEKeyword_2());
            		
            // InternalPkgDsl.g:3099:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:3100:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3100:4: (lv_name_3_0= RULE_STRING )
            // InternalPkgDsl.g:3101:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPC_TimingExpressionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPC_TimingExpressionAccess().getTYPEKeyword_4());
            		
            // InternalPkgDsl.g:3121:3: ( (lv_type_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:3122:4: (lv_type_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3122:4: (lv_type_5_0= RULE_STRING )
            // InternalPkgDsl.g:3123:5: lv_type_5_0= RULE_STRING
            {
            lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_type_5_0, grammarAccess.getPC_TimingExpressionAccess().getTypeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPC_TimingExpressionAccess().getValueKeyword_6());
            		
            // InternalPkgDsl.g:3143:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:3144:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3144:4: (lv_value_7_0= RULE_STRING )
            // InternalPkgDsl.g:3145:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_value_7_0, grammarAccess.getPC_TimingExpressionAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPC_TimingExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPC_TimingExpressionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePC_TimingExpression"


    // $ANTLR start "entryRuleDescriptions"
    // InternalPkgDsl.g:3169:1: entryRuleDescriptions returns [EObject current=null] : iv_ruleDescriptions= ruleDescriptions EOF ;
    public final EObject entryRuleDescriptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptions = null;


        try {
            // InternalPkgDsl.g:3169:53: (iv_ruleDescriptions= ruleDescriptions EOF )
            // InternalPkgDsl.g:3170:2: iv_ruleDescriptions= ruleDescriptions EOF
            {
             newCompositeNode(grammarAccess.getDescriptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptions=ruleDescriptions();

            state._fsp--;

             current =iv_ruleDescriptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptions"


    // $ANTLR start "ruleDescriptions"
    // InternalPkgDsl.g:3176:1: ruleDescriptions returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Events {' ( (lv_event_function_2_0= ruleEvent_Function ) )* ( (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port ) )* ( (lv_event_chain_4_0= ruleEvent_Chain ) )* otherlv_5= '}' ) ;
    public final EObject ruleDescriptions() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_event_function_2_0 = null;

        EObject lv_event_function_flow_port_3_0 = null;

        EObject lv_event_chain_4_0 = null;



        	enterRule();

        try {
            // InternalPkgDsl.g:3182:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Events {' ( (lv_event_function_2_0= ruleEvent_Function ) )* ( (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port ) )* ( (lv_event_chain_4_0= ruleEvent_Chain ) )* otherlv_5= '}' ) )
            // InternalPkgDsl.g:3183:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Events {' ( (lv_event_function_2_0= ruleEvent_Function ) )* ( (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port ) )* ( (lv_event_chain_4_0= ruleEvent_Chain ) )* otherlv_5= '}' )
            {
            // InternalPkgDsl.g:3183:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Events {' ( (lv_event_function_2_0= ruleEvent_Function ) )* ( (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port ) )* ( (lv_event_chain_4_0= ruleEvent_Chain ) )* otherlv_5= '}' )
            // InternalPkgDsl.g:3184:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Events {' ( (lv_event_function_2_0= ruleEvent_Function ) )* ( (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port ) )* ( (lv_event_chain_4_0= ruleEvent_Chain ) )* otherlv_5= '}'
            {
            // InternalPkgDsl.g:3184:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:3185:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:3185:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:3186:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_define_0_0, grammarAccess.getDescriptionsAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionsAccess().getEventsKeyword_1());
            		
            // InternalPkgDsl.g:3206:3: ( (lv_event_function_2_0= ruleEvent_Function ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==51) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalPkgDsl.g:3207:4: (lv_event_function_2_0= ruleEvent_Function )
            	    {
            	    // InternalPkgDsl.g:3207:4: (lv_event_function_2_0= ruleEvent_Function )
            	    // InternalPkgDsl.g:3208:5: lv_event_function_2_0= ruleEvent_Function
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionsAccess().getEvent_functionEvent_FunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_event_function_2_0=ruleEvent_Function();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDescriptionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"event_function",
            	    						lv_event_function_2_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Event_Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalPkgDsl.g:3225:3: ( (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==46) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalPkgDsl.g:3226:4: (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port )
            	    {
            	    // InternalPkgDsl.g:3226:4: (lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port )
            	    // InternalPkgDsl.g:3227:5: lv_event_function_flow_port_3_0= ruleEvent_Function_Flow_Port
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionsAccess().getEvent_function_flow_portEvent_Function_Flow_PortParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_event_function_flow_port_3_0=ruleEvent_Function_Flow_Port();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDescriptionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"event_function_flow_port",
            	    						lv_event_function_flow_port_3_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Event_Function_Flow_Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalPkgDsl.g:3244:3: ( (lv_event_chain_4_0= ruleEvent_Chain ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPkgDsl.g:3245:4: (lv_event_chain_4_0= ruleEvent_Chain )
            	    {
            	    // InternalPkgDsl.g:3245:4: (lv_event_chain_4_0= ruleEvent_Chain )
            	    // InternalPkgDsl.g:3246:5: lv_event_chain_4_0= ruleEvent_Chain
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionsAccess().getEvent_chainEvent_ChainParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_event_chain_4_0=ruleEvent_Chain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDescriptionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"event_chain",
            	    						lv_event_chain_4_0,
            	    						"webdsl.epackage.pkgdsl.PkgDsl.Event_Chain");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDescriptionsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptions"


    // $ANTLR start "entryRuleEvent_Chain"
    // InternalPkgDsl.g:3271:1: entryRuleEvent_Chain returns [EObject current=null] : iv_ruleEvent_Chain= ruleEvent_Chain EOF ;
    public final EObject entryRuleEvent_Chain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent_Chain = null;


        try {
            // InternalPkgDsl.g:3271:52: (iv_ruleEvent_Chain= ruleEvent_Chain EOF )
            // InternalPkgDsl.g:3272:2: iv_ruleEvent_Chain= ruleEvent_Chain EOF
            {
             newCompositeNode(grammarAccess.getEvent_ChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent_Chain=ruleEvent_Chain();

            state._fsp--;

             current =iv_ruleEvent_Chain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent_Chain"


    // $ANTLR start "ruleEvent_Chain"
    // InternalPkgDsl.g:3278:1: ruleEvent_Chain returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Chain {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'SEGMENT-REFS:' ( (lv_segment_ref_11_0= RULE_STRING ) ) )? otherlv_12= 'STIMULUS:' ( (lv_stimulus_13_0= RULE_STRING ) ) otherlv_14= 'RESPONSE:' ( (lv_response_15_0= RULE_STRING ) ) otherlv_16= '}' ) ;
    public final EObject ruleEvent_Chain() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_segment_ref_11_0=null;
        Token otherlv_12=null;
        Token lv_stimulus_13_0=null;
        Token otherlv_14=null;
        Token lv_response_15_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:3284:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Chain {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'SEGMENT-REFS:' ( (lv_segment_ref_11_0= RULE_STRING ) ) )? otherlv_12= 'STIMULUS:' ( (lv_stimulus_13_0= RULE_STRING ) ) otherlv_14= 'RESPONSE:' ( (lv_response_15_0= RULE_STRING ) ) otherlv_16= '}' ) )
            // InternalPkgDsl.g:3285:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Chain {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'SEGMENT-REFS:' ( (lv_segment_ref_11_0= RULE_STRING ) ) )? otherlv_12= 'STIMULUS:' ( (lv_stimulus_13_0= RULE_STRING ) ) otherlv_14= 'RESPONSE:' ( (lv_response_15_0= RULE_STRING ) ) otherlv_16= '}' )
            {
            // InternalPkgDsl.g:3285:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Chain {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'SEGMENT-REFS:' ( (lv_segment_ref_11_0= RULE_STRING ) ) )? otherlv_12= 'STIMULUS:' ( (lv_stimulus_13_0= RULE_STRING ) ) otherlv_14= 'RESPONSE:' ( (lv_response_15_0= RULE_STRING ) ) otherlv_16= '}' )
            // InternalPkgDsl.g:3286:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Chain {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'SEGMENT-REFS:' ( (lv_segment_ref_11_0= RULE_STRING ) ) )? otherlv_12= 'STIMULUS:' ( (lv_stimulus_13_0= RULE_STRING ) ) otherlv_14= 'RESPONSE:' ( (lv_response_15_0= RULE_STRING ) ) otherlv_16= '}'
            {
            // InternalPkgDsl.g:3286:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:3287:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:3287:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:3288:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_define_0_0, grammarAccess.getEvent_ChainAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_ChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEvent_ChainAccess().getEventChainKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEvent_ChainAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:3312:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:3313:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3313:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:3314:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getEvent_ChainAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_ChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEvent_ChainAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:3334:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:3335:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3335:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:3336:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getEvent_ChainAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_ChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEvent_ChainAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:3356:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:3357:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3357:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:3358:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getEvent_ChainAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_ChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getEvent_ChainAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:3378:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:3379:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3379:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:3380:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_name_9_0, grammarAccess.getEvent_ChainAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_ChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:3396:3: (otherlv_10= 'SEGMENT-REFS:' ( (lv_segment_ref_11_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPkgDsl.g:3397:4: otherlv_10= 'SEGMENT-REFS:' ( (lv_segment_ref_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getEvent_ChainAccess().getSEGMENTREFSKeyword_10_0());
                    			
                    // InternalPkgDsl.g:3401:4: ( (lv_segment_ref_11_0= RULE_STRING ) )
                    // InternalPkgDsl.g:3402:5: (lv_segment_ref_11_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:3402:5: (lv_segment_ref_11_0= RULE_STRING )
                    // InternalPkgDsl.g:3403:6: lv_segment_ref_11_0= RULE_STRING
                    {
                    lv_segment_ref_11_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

                    						newLeafNode(lv_segment_ref_11_0, grammarAccess.getEvent_ChainAccess().getSegment_refSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvent_ChainRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"segment_ref",
                    							lv_segment_ref_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getEvent_ChainAccess().getSTIMULUSKeyword_11());
            		
            // InternalPkgDsl.g:3424:3: ( (lv_stimulus_13_0= RULE_STRING ) )
            // InternalPkgDsl.g:3425:4: (lv_stimulus_13_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3425:4: (lv_stimulus_13_0= RULE_STRING )
            // InternalPkgDsl.g:3426:5: lv_stimulus_13_0= RULE_STRING
            {
            lv_stimulus_13_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(lv_stimulus_13_0, grammarAccess.getEvent_ChainAccess().getStimulusSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_ChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stimulus",
            						lv_stimulus_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getEvent_ChainAccess().getRESPONSEKeyword_13());
            		
            // InternalPkgDsl.g:3446:3: ( (lv_response_15_0= RULE_STRING ) )
            // InternalPkgDsl.g:3447:4: (lv_response_15_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3447:4: (lv_response_15_0= RULE_STRING )
            // InternalPkgDsl.g:3448:5: lv_response_15_0= RULE_STRING
            {
            lv_response_15_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_response_15_0, grammarAccess.getEvent_ChainAccess().getResponseSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_ChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"response",
            						lv_response_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEvent_ChainAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent_Chain"


    // $ANTLR start "entryRuleEvent_Function_Flow_Port"
    // InternalPkgDsl.g:3472:1: entryRuleEvent_Function_Flow_Port returns [EObject current=null] : iv_ruleEvent_Function_Flow_Port= ruleEvent_Function_Flow_Port EOF ;
    public final EObject entryRuleEvent_Function_Flow_Port() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent_Function_Flow_Port = null;


        try {
            // InternalPkgDsl.g:3472:65: (iv_ruleEvent_Function_Flow_Port= ruleEvent_Function_Flow_Port EOF )
            // InternalPkgDsl.g:3473:2: iv_ruleEvent_Function_Flow_Port= ruleEvent_Function_Flow_Port EOF
            {
             newCompositeNode(grammarAccess.getEvent_Function_Flow_PortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent_Function_Flow_Port=ruleEvent_Function_Flow_Port();

            state._fsp--;

             current =iv_ruleEvent_Function_Flow_Port; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent_Function_Flow_Port"


    // $ANTLR start "ruleEvent_Function_Flow_Port"
    // InternalPkgDsl.g:3479:1: ruleEvent_Function_Flow_Port returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function-Flow-Port {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FUNCTION-PROTOTYPE:' ( (lv_func_prototype_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-FLOW-PORT:' ( (lv_func_flow_port_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleEvent_Function_Flow_Port() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_func_type_11_0=null;
        Token otherlv_12=null;
        Token lv_func_value_13_0=null;
        Token otherlv_14=null;
        Token lv_func_prototype_15_0=null;
        Token otherlv_16=null;
        Token lv_func_flow_port_17_0=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:3485:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function-Flow-Port {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FUNCTION-PROTOTYPE:' ( (lv_func_prototype_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-FLOW-PORT:' ( (lv_func_flow_port_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // InternalPkgDsl.g:3486:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function-Flow-Port {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FUNCTION-PROTOTYPE:' ( (lv_func_prototype_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-FLOW-PORT:' ( (lv_func_flow_port_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // InternalPkgDsl.g:3486:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function-Flow-Port {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FUNCTION-PROTOTYPE:' ( (lv_func_prototype_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-FLOW-PORT:' ( (lv_func_flow_port_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // InternalPkgDsl.g:3487:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function-Flow-Port {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FUNCTION-PROTOTYPE:' ( (lv_func_prototype_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-FLOW-PORT:' ( (lv_func_flow_port_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            // InternalPkgDsl.g:3487:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:3488:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:3488:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:3489:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_define_0_0, grammarAccess.getEvent_Function_Flow_PortAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEvent_Function_Flow_PortAccess().getEventFunctionFlowPortKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEvent_Function_Flow_PortAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:3513:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:3514:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3514:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:3515:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getEvent_Function_Flow_PortAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEvent_Function_Flow_PortAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:3535:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:3536:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3536:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:3537:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getEvent_Function_Flow_PortAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEvent_Function_Flow_PortAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:3557:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:3558:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3558:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:3559:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getEvent_Function_Flow_PortAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getEvent_Function_Flow_PortAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:3579:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:3580:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3580:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:3581:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

            					newLeafNode(lv_name_9_0, grammarAccess.getEvent_Function_Flow_PortAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getEvent_Function_Flow_PortAccess().getFUNCTIONTYPEKeyword_10());
            		
            // InternalPkgDsl.g:3601:3: ( (lv_func_type_11_0= RULE_STRING ) )
            // InternalPkgDsl.g:3602:4: (lv_func_type_11_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3602:4: (lv_func_type_11_0= RULE_STRING )
            // InternalPkgDsl.g:3603:5: lv_func_type_11_0= RULE_STRING
            {
            lv_func_type_11_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_func_type_11_0, grammarAccess.getEvent_Function_Flow_PortAccess().getFunc_typeSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_type",
            						lv_func_type_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getEvent_Function_Flow_PortAccess().getFUNCTIONVALUEKeyword_12());
            		
            // InternalPkgDsl.g:3623:3: ( (lv_func_value_13_0= RULE_STRING ) )
            // InternalPkgDsl.g:3624:4: (lv_func_value_13_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3624:4: (lv_func_value_13_0= RULE_STRING )
            // InternalPkgDsl.g:3625:5: lv_func_value_13_0= RULE_STRING
            {
            lv_func_value_13_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            					newLeafNode(lv_func_value_13_0, grammarAccess.getEvent_Function_Flow_PortAccess().getFunc_valueSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_value",
            						lv_func_value_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getEvent_Function_Flow_PortAccess().getFUNCTIONPROTOTYPEKeyword_14());
            		
            // InternalPkgDsl.g:3645:3: ( (lv_func_prototype_15_0= RULE_STRING ) )
            // InternalPkgDsl.g:3646:4: (lv_func_prototype_15_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3646:4: (lv_func_prototype_15_0= RULE_STRING )
            // InternalPkgDsl.g:3647:5: lv_func_prototype_15_0= RULE_STRING
            {
            lv_func_prototype_15_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            					newLeafNode(lv_func_prototype_15_0, grammarAccess.getEvent_Function_Flow_PortAccess().getFunc_prototypeSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_prototype",
            						lv_func_prototype_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getEvent_Function_Flow_PortAccess().getFUNCTIONFLOWPORTKeyword_16());
            		
            // InternalPkgDsl.g:3667:3: ( (lv_func_flow_port_17_0= RULE_STRING ) )
            // InternalPkgDsl.g:3668:4: (lv_func_flow_port_17_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3668:4: (lv_func_flow_port_17_0= RULE_STRING )
            // InternalPkgDsl.g:3669:5: lv_func_flow_port_17_0= RULE_STRING
            {
            lv_func_flow_port_17_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_func_flow_port_17_0, grammarAccess.getEvent_Function_Flow_PortAccess().getFunc_flow_portSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_Function_Flow_PortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_flow_port",
            						lv_func_flow_port_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getEvent_Function_Flow_PortAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent_Function_Flow_Port"


    // $ANTLR start "entryRuleEvent_Function"
    // InternalPkgDsl.g:3693:1: entryRuleEvent_Function returns [EObject current=null] : iv_ruleEvent_Function= ruleEvent_Function EOF ;
    public final EObject entryRuleEvent_Function() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent_Function = null;


        try {
            // InternalPkgDsl.g:3693:55: (iv_ruleEvent_Function= ruleEvent_Function EOF )
            // InternalPkgDsl.g:3694:2: iv_ruleEvent_Function= ruleEvent_Function EOF
            {
             newCompositeNode(grammarAccess.getEvent_FunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent_Function=ruleEvent_Function();

            state._fsp--;

             current =iv_ruleEvent_Function; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent_Function"


    // $ANTLR start "ruleEvent_Function"
    // InternalPkgDsl.g:3700:1: ruleEvent_Function returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FFUNCTION-PROTOTYPE-TARGET:' ( (lv_func_prototype_target_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-PROTOTYPE-CONTEXT:' ( (lv_func_prototype_context_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleEvent_Function() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_func_type_11_0=null;
        Token otherlv_12=null;
        Token lv_func_value_13_0=null;
        Token otherlv_14=null;
        Token lv_func_prototype_target_15_0=null;
        Token otherlv_16=null;
        Token lv_func_prototype_context_17_0=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:3706:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FFUNCTION-PROTOTYPE-TARGET:' ( (lv_func_prototype_target_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-PROTOTYPE-CONTEXT:' ( (lv_func_prototype_context_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // InternalPkgDsl.g:3707:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FFUNCTION-PROTOTYPE-TARGET:' ( (lv_func_prototype_target_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-PROTOTYPE-CONTEXT:' ( (lv_func_prototype_context_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // InternalPkgDsl.g:3707:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FFUNCTION-PROTOTYPE-TARGET:' ( (lv_func_prototype_target_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-PROTOTYPE-CONTEXT:' ( (lv_func_prototype_context_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // InternalPkgDsl.g:3708:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Event-Function {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= 'FUNCTION-TYPE:' ( (lv_func_type_11_0= RULE_STRING ) ) otherlv_12= 'FUNCTION-VALUE:' ( (lv_func_value_13_0= RULE_STRING ) ) otherlv_14= 'FFUNCTION-PROTOTYPE-TARGET:' ( (lv_func_prototype_target_15_0= RULE_STRING ) ) otherlv_16= 'FUNCTION-PROTOTYPE-CONTEXT:' ( (lv_func_prototype_context_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            // InternalPkgDsl.g:3708:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:3709:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:3709:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:3710:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_define_0_0, grammarAccess.getEvent_FunctionAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEvent_FunctionAccess().getEventFunctionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEvent_FunctionAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:3734:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:3735:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3735:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:3736:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getEvent_FunctionAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEvent_FunctionAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:3756:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:3757:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3757:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:3758:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getEvent_FunctionAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEvent_FunctionAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:3778:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:3779:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3779:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:3780:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getEvent_FunctionAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getEvent_FunctionAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:3800:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:3801:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3801:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:3802:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

            					newLeafNode(lv_name_9_0, grammarAccess.getEvent_FunctionAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getEvent_FunctionAccess().getFUNCTIONTYPEKeyword_10());
            		
            // InternalPkgDsl.g:3822:3: ( (lv_func_type_11_0= RULE_STRING ) )
            // InternalPkgDsl.g:3823:4: (lv_func_type_11_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3823:4: (lv_func_type_11_0= RULE_STRING )
            // InternalPkgDsl.g:3824:5: lv_func_type_11_0= RULE_STRING
            {
            lv_func_type_11_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_func_type_11_0, grammarAccess.getEvent_FunctionAccess().getFunc_typeSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_type",
            						lv_func_type_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getEvent_FunctionAccess().getFUNCTIONVALUEKeyword_12());
            		
            // InternalPkgDsl.g:3844:3: ( (lv_func_value_13_0= RULE_STRING ) )
            // InternalPkgDsl.g:3845:4: (lv_func_value_13_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3845:4: (lv_func_value_13_0= RULE_STRING )
            // InternalPkgDsl.g:3846:5: lv_func_value_13_0= RULE_STRING
            {
            lv_func_value_13_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

            					newLeafNode(lv_func_value_13_0, grammarAccess.getEvent_FunctionAccess().getFunc_valueSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_value",
            						lv_func_value_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,52,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getEvent_FunctionAccess().getFFUNCTIONPROTOTYPETARGETKeyword_14());
            		
            // InternalPkgDsl.g:3866:3: ( (lv_func_prototype_target_15_0= RULE_STRING ) )
            // InternalPkgDsl.g:3867:4: (lv_func_prototype_target_15_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3867:4: (lv_func_prototype_target_15_0= RULE_STRING )
            // InternalPkgDsl.g:3868:5: lv_func_prototype_target_15_0= RULE_STRING
            {
            lv_func_prototype_target_15_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

            					newLeafNode(lv_func_prototype_target_15_0, grammarAccess.getEvent_FunctionAccess().getFunc_prototype_targetSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_prototype_target",
            						lv_func_prototype_target_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getEvent_FunctionAccess().getFUNCTIONPROTOTYPECONTEXTKeyword_16());
            		
            // InternalPkgDsl.g:3888:3: ( (lv_func_prototype_context_17_0= RULE_STRING ) )
            // InternalPkgDsl.g:3889:4: (lv_func_prototype_context_17_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3889:4: (lv_func_prototype_context_17_0= RULE_STRING )
            // InternalPkgDsl.g:3890:5: lv_func_prototype_context_17_0= RULE_STRING
            {
            lv_func_prototype_context_17_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_func_prototype_context_17_0, grammarAccess.getEvent_FunctionAccess().getFunc_prototype_contextSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvent_FunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_prototype_context",
            						lv_func_prototype_context_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getEvent_FunctionAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent_Function"


    // $ANTLR start "entryRuleUnit"
    // InternalPkgDsl.g:3914:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalPkgDsl.g:3914:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalPkgDsl.g:3915:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalPkgDsl.g:3921:1: ruleUnit returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Unit {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'FACTOR:' ( (lv_factor_11_0= RULE_STRING ) ) )? (otherlv_12= 'SYMBOL:' ( (lv_symbol_13_0= RULE_STRING ) ) )? (otherlv_14= 'OFFSET:' ( (lv_offset_15_0= RULE_STRING ) ) )? otherlv_16= 'QUNATITY:' ( (lv_quantity_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_factor_11_0=null;
        Token otherlv_12=null;
        Token lv_symbol_13_0=null;
        Token otherlv_14=null;
        Token lv_offset_15_0=null;
        Token otherlv_16=null;
        Token lv_quantity_17_0=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:3927:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Unit {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'FACTOR:' ( (lv_factor_11_0= RULE_STRING ) ) )? (otherlv_12= 'SYMBOL:' ( (lv_symbol_13_0= RULE_STRING ) ) )? (otherlv_14= 'OFFSET:' ( (lv_offset_15_0= RULE_STRING ) ) )? otherlv_16= 'QUNATITY:' ( (lv_quantity_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // InternalPkgDsl.g:3928:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Unit {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'FACTOR:' ( (lv_factor_11_0= RULE_STRING ) ) )? (otherlv_12= 'SYMBOL:' ( (lv_symbol_13_0= RULE_STRING ) ) )? (otherlv_14= 'OFFSET:' ( (lv_offset_15_0= RULE_STRING ) ) )? otherlv_16= 'QUNATITY:' ( (lv_quantity_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // InternalPkgDsl.g:3928:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Unit {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'FACTOR:' ( (lv_factor_11_0= RULE_STRING ) ) )? (otherlv_12= 'SYMBOL:' ( (lv_symbol_13_0= RULE_STRING ) ) )? (otherlv_14= 'OFFSET:' ( (lv_offset_15_0= RULE_STRING ) ) )? otherlv_16= 'QUNATITY:' ( (lv_quantity_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // InternalPkgDsl.g:3929:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Unit {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'FACTOR:' ( (lv_factor_11_0= RULE_STRING ) ) )? (otherlv_12= 'SYMBOL:' ( (lv_symbol_13_0= RULE_STRING ) ) )? (otherlv_14= 'OFFSET:' ( (lv_offset_15_0= RULE_STRING ) ) )? otherlv_16= 'QUNATITY:' ( (lv_quantity_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            // InternalPkgDsl.g:3929:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:3930:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:3930:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:3931:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_define_0_0, grammarAccess.getUnitAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitAccess().getUnitKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getUnitAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:3955:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:3956:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3956:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:3957:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getUnitAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getUnitAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:3977:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:3978:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:3978:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:3979:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getUnitAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getUnitAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:3999:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:4000:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4000:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:4001:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getUnitAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getUnitAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:4021:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:4022:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4022:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:4023:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

            					newLeafNode(lv_name_9_0, grammarAccess.getUnitAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:4039:3: (otherlv_10= 'FACTOR:' ( (lv_factor_11_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPkgDsl.g:4040:4: otherlv_10= 'FACTOR:' ( (lv_factor_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnitAccess().getFACTORKeyword_10_0());
                    			
                    // InternalPkgDsl.g:4044:4: ( (lv_factor_11_0= RULE_STRING ) )
                    // InternalPkgDsl.g:4045:5: (lv_factor_11_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:4045:5: (lv_factor_11_0= RULE_STRING )
                    // InternalPkgDsl.g:4046:6: lv_factor_11_0= RULE_STRING
                    {
                    lv_factor_11_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

                    						newLeafNode(lv_factor_11_0, grammarAccess.getUnitAccess().getFactorSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"factor",
                    							lv_factor_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4063:3: (otherlv_12= 'SYMBOL:' ( (lv_symbol_13_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPkgDsl.g:4064:4: otherlv_12= 'SYMBOL:' ( (lv_symbol_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getUnitAccess().getSYMBOLKeyword_11_0());
                    			
                    // InternalPkgDsl.g:4068:4: ( (lv_symbol_13_0= RULE_STRING ) )
                    // InternalPkgDsl.g:4069:5: (lv_symbol_13_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:4069:5: (lv_symbol_13_0= RULE_STRING )
                    // InternalPkgDsl.g:4070:6: lv_symbol_13_0= RULE_STRING
                    {
                    lv_symbol_13_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

                    						newLeafNode(lv_symbol_13_0, grammarAccess.getUnitAccess().getSymbolSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"symbol",
                    							lv_symbol_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4087:3: (otherlv_14= 'OFFSET:' ( (lv_offset_15_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPkgDsl.g:4088:4: otherlv_14= 'OFFSET:' ( (lv_offset_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,57,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getUnitAccess().getOFFSETKeyword_12_0());
                    			
                    // InternalPkgDsl.g:4092:4: ( (lv_offset_15_0= RULE_STRING ) )
                    // InternalPkgDsl.g:4093:5: (lv_offset_15_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:4093:5: (lv_offset_15_0= RULE_STRING )
                    // InternalPkgDsl.g:4094:6: lv_offset_15_0= RULE_STRING
                    {
                    lv_offset_15_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_offset_15_0, grammarAccess.getUnitAccess().getOffsetSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"offset",
                    							lv_offset_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,58,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getUnitAccess().getQUNATITYKeyword_13());
            		
            // InternalPkgDsl.g:4115:3: ( (lv_quantity_17_0= RULE_STRING ) )
            // InternalPkgDsl.g:4116:4: (lv_quantity_17_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4116:4: (lv_quantity_17_0= RULE_STRING )
            // InternalPkgDsl.g:4117:5: lv_quantity_17_0= RULE_STRING
            {
            lv_quantity_17_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_quantity_17_0, grammarAccess.getUnitAccess().getQuantitySTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleQuantity"
    // InternalPkgDsl.g:4141:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalPkgDsl.g:4141:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalPkgDsl.g:4142:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalPkgDsl.g:4148:1: ruleQuantity returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Quantity {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'AMOUNT-OF-SUBSTANCE-EXP:' ( (lv_substance_exp_11_0= RULE_INT ) ) )? (otherlv_12= 'ELECTRIC-CURRENT-EXP:' ( (lv_current_exp_13_0= RULE_INT ) ) )? (otherlv_14= 'LENGTH-EXP:' ( (lv_length_exp_15_0= RULE_INT ) ) )? (otherlv_16= 'LUMINOUS-INTENSITY-EXP:' ( (lv_intensity_exp_17_0= RULE_INT ) ) )? (otherlv_18= 'MASS-EXP:' ( (lv_mass_exp_19_0= RULE_INT ) ) )? (otherlv_20= 'THERMODYNAMIC-TEMPERATURE-EXP:' ( (lv_temp_exp_21_0= RULE_INT ) ) )? (otherlv_22= 'TIME-EXP:' ( (lv_time_exp_23_0= RULE_INT ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_substance_exp_11_0=null;
        Token otherlv_12=null;
        Token lv_current_exp_13_0=null;
        Token otherlv_14=null;
        Token lv_length_exp_15_0=null;
        Token otherlv_16=null;
        Token lv_intensity_exp_17_0=null;
        Token otherlv_18=null;
        Token lv_mass_exp_19_0=null;
        Token otherlv_20=null;
        Token lv_temp_exp_21_0=null;
        Token otherlv_22=null;
        Token lv_time_exp_23_0=null;
        Token otherlv_24=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:4154:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Quantity {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'AMOUNT-OF-SUBSTANCE-EXP:' ( (lv_substance_exp_11_0= RULE_INT ) ) )? (otherlv_12= 'ELECTRIC-CURRENT-EXP:' ( (lv_current_exp_13_0= RULE_INT ) ) )? (otherlv_14= 'LENGTH-EXP:' ( (lv_length_exp_15_0= RULE_INT ) ) )? (otherlv_16= 'LUMINOUS-INTENSITY-EXP:' ( (lv_intensity_exp_17_0= RULE_INT ) ) )? (otherlv_18= 'MASS-EXP:' ( (lv_mass_exp_19_0= RULE_INT ) ) )? (otherlv_20= 'THERMODYNAMIC-TEMPERATURE-EXP:' ( (lv_temp_exp_21_0= RULE_INT ) ) )? (otherlv_22= 'TIME-EXP:' ( (lv_time_exp_23_0= RULE_INT ) ) )? otherlv_24= '}' ) )
            // InternalPkgDsl.g:4155:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Quantity {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'AMOUNT-OF-SUBSTANCE-EXP:' ( (lv_substance_exp_11_0= RULE_INT ) ) )? (otherlv_12= 'ELECTRIC-CURRENT-EXP:' ( (lv_current_exp_13_0= RULE_INT ) ) )? (otherlv_14= 'LENGTH-EXP:' ( (lv_length_exp_15_0= RULE_INT ) ) )? (otherlv_16= 'LUMINOUS-INTENSITY-EXP:' ( (lv_intensity_exp_17_0= RULE_INT ) ) )? (otherlv_18= 'MASS-EXP:' ( (lv_mass_exp_19_0= RULE_INT ) ) )? (otherlv_20= 'THERMODYNAMIC-TEMPERATURE-EXP:' ( (lv_temp_exp_21_0= RULE_INT ) ) )? (otherlv_22= 'TIME-EXP:' ( (lv_time_exp_23_0= RULE_INT ) ) )? otherlv_24= '}' )
            {
            // InternalPkgDsl.g:4155:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Quantity {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'AMOUNT-OF-SUBSTANCE-EXP:' ( (lv_substance_exp_11_0= RULE_INT ) ) )? (otherlv_12= 'ELECTRIC-CURRENT-EXP:' ( (lv_current_exp_13_0= RULE_INT ) ) )? (otherlv_14= 'LENGTH-EXP:' ( (lv_length_exp_15_0= RULE_INT ) ) )? (otherlv_16= 'LUMINOUS-INTENSITY-EXP:' ( (lv_intensity_exp_17_0= RULE_INT ) ) )? (otherlv_18= 'MASS-EXP:' ( (lv_mass_exp_19_0= RULE_INT ) ) )? (otherlv_20= 'THERMODYNAMIC-TEMPERATURE-EXP:' ( (lv_temp_exp_21_0= RULE_INT ) ) )? (otherlv_22= 'TIME-EXP:' ( (lv_time_exp_23_0= RULE_INT ) ) )? otherlv_24= '}' )
            // InternalPkgDsl.g:4156:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'Quantity {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'AMOUNT-OF-SUBSTANCE-EXP:' ( (lv_substance_exp_11_0= RULE_INT ) ) )? (otherlv_12= 'ELECTRIC-CURRENT-EXP:' ( (lv_current_exp_13_0= RULE_INT ) ) )? (otherlv_14= 'LENGTH-EXP:' ( (lv_length_exp_15_0= RULE_INT ) ) )? (otherlv_16= 'LUMINOUS-INTENSITY-EXP:' ( (lv_intensity_exp_17_0= RULE_INT ) ) )? (otherlv_18= 'MASS-EXP:' ( (lv_mass_exp_19_0= RULE_INT ) ) )? (otherlv_20= 'THERMODYNAMIC-TEMPERATURE-EXP:' ( (lv_temp_exp_21_0= RULE_INT ) ) )? (otherlv_22= 'TIME-EXP:' ( (lv_time_exp_23_0= RULE_INT ) ) )? otherlv_24= '}'
            {
            // InternalPkgDsl.g:4156:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:4157:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:4157:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:4158:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_59); 

            					newLeafNode(lv_define_0_0, grammarAccess.getQuantityAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getQuantityAccess().getQuantityKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getQuantityAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:4182:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:4183:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4183:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:4184:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getQuantityAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getQuantityAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:4204:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:4205:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4205:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:4206:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getQuantityAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getQuantityAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:4226:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:4227:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4227:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:4228:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getQuantityAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getQuantityAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:4248:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:4249:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4249:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:4250:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            					newLeafNode(lv_name_9_0, grammarAccess.getQuantityAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:4266:3: (otherlv_10= 'AMOUNT-OF-SUBSTANCE-EXP:' ( (lv_substance_exp_11_0= RULE_INT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==60) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPkgDsl.g:4267:4: otherlv_10= 'AMOUNT-OF-SUBSTANCE-EXP:' ( (lv_substance_exp_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,60,FOLLOW_61); 

                    				newLeafNode(otherlv_10, grammarAccess.getQuantityAccess().getAMOUNTOFSUBSTANCEEXPKeyword_10_0());
                    			
                    // InternalPkgDsl.g:4271:4: ( (lv_substance_exp_11_0= RULE_INT ) )
                    // InternalPkgDsl.g:4272:5: (lv_substance_exp_11_0= RULE_INT )
                    {
                    // InternalPkgDsl.g:4272:5: (lv_substance_exp_11_0= RULE_INT )
                    // InternalPkgDsl.g:4273:6: lv_substance_exp_11_0= RULE_INT
                    {
                    lv_substance_exp_11_0=(Token)match(input,RULE_INT,FOLLOW_62); 

                    						newLeafNode(lv_substance_exp_11_0, grammarAccess.getQuantityAccess().getSubstance_expINTTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"substance_exp",
                    							lv_substance_exp_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4290:3: (otherlv_12= 'ELECTRIC-CURRENT-EXP:' ( (lv_current_exp_13_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPkgDsl.g:4291:4: otherlv_12= 'ELECTRIC-CURRENT-EXP:' ( (lv_current_exp_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_61); 

                    				newLeafNode(otherlv_12, grammarAccess.getQuantityAccess().getELECTRICCURRENTEXPKeyword_11_0());
                    			
                    // InternalPkgDsl.g:4295:4: ( (lv_current_exp_13_0= RULE_INT ) )
                    // InternalPkgDsl.g:4296:5: (lv_current_exp_13_0= RULE_INT )
                    {
                    // InternalPkgDsl.g:4296:5: (lv_current_exp_13_0= RULE_INT )
                    // InternalPkgDsl.g:4297:6: lv_current_exp_13_0= RULE_INT
                    {
                    lv_current_exp_13_0=(Token)match(input,RULE_INT,FOLLOW_63); 

                    						newLeafNode(lv_current_exp_13_0, grammarAccess.getQuantityAccess().getCurrent_expINTTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"current_exp",
                    							lv_current_exp_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4314:3: (otherlv_14= 'LENGTH-EXP:' ( (lv_length_exp_15_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==62) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPkgDsl.g:4315:4: otherlv_14= 'LENGTH-EXP:' ( (lv_length_exp_15_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,62,FOLLOW_61); 

                    				newLeafNode(otherlv_14, grammarAccess.getQuantityAccess().getLENGTHEXPKeyword_12_0());
                    			
                    // InternalPkgDsl.g:4319:4: ( (lv_length_exp_15_0= RULE_INT ) )
                    // InternalPkgDsl.g:4320:5: (lv_length_exp_15_0= RULE_INT )
                    {
                    // InternalPkgDsl.g:4320:5: (lv_length_exp_15_0= RULE_INT )
                    // InternalPkgDsl.g:4321:6: lv_length_exp_15_0= RULE_INT
                    {
                    lv_length_exp_15_0=(Token)match(input,RULE_INT,FOLLOW_64); 

                    						newLeafNode(lv_length_exp_15_0, grammarAccess.getQuantityAccess().getLength_expINTTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length_exp",
                    							lv_length_exp_15_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4338:3: (otherlv_16= 'LUMINOUS-INTENSITY-EXP:' ( (lv_intensity_exp_17_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPkgDsl.g:4339:4: otherlv_16= 'LUMINOUS-INTENSITY-EXP:' ( (lv_intensity_exp_17_0= RULE_INT ) )
                    {
                    otherlv_16=(Token)match(input,63,FOLLOW_61); 

                    				newLeafNode(otherlv_16, grammarAccess.getQuantityAccess().getLUMINOUSINTENSITYEXPKeyword_13_0());
                    			
                    // InternalPkgDsl.g:4343:4: ( (lv_intensity_exp_17_0= RULE_INT ) )
                    // InternalPkgDsl.g:4344:5: (lv_intensity_exp_17_0= RULE_INT )
                    {
                    // InternalPkgDsl.g:4344:5: (lv_intensity_exp_17_0= RULE_INT )
                    // InternalPkgDsl.g:4345:6: lv_intensity_exp_17_0= RULE_INT
                    {
                    lv_intensity_exp_17_0=(Token)match(input,RULE_INT,FOLLOW_65); 

                    						newLeafNode(lv_intensity_exp_17_0, grammarAccess.getQuantityAccess().getIntensity_expINTTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intensity_exp",
                    							lv_intensity_exp_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4362:3: (otherlv_18= 'MASS-EXP:' ( (lv_mass_exp_19_0= RULE_INT ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==64) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPkgDsl.g:4363:4: otherlv_18= 'MASS-EXP:' ( (lv_mass_exp_19_0= RULE_INT ) )
                    {
                    otherlv_18=(Token)match(input,64,FOLLOW_61); 

                    				newLeafNode(otherlv_18, grammarAccess.getQuantityAccess().getMASSEXPKeyword_14_0());
                    			
                    // InternalPkgDsl.g:4367:4: ( (lv_mass_exp_19_0= RULE_INT ) )
                    // InternalPkgDsl.g:4368:5: (lv_mass_exp_19_0= RULE_INT )
                    {
                    // InternalPkgDsl.g:4368:5: (lv_mass_exp_19_0= RULE_INT )
                    // InternalPkgDsl.g:4369:6: lv_mass_exp_19_0= RULE_INT
                    {
                    lv_mass_exp_19_0=(Token)match(input,RULE_INT,FOLLOW_66); 

                    						newLeafNode(lv_mass_exp_19_0, grammarAccess.getQuantityAccess().getMass_expINTTerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mass_exp",
                    							lv_mass_exp_19_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4386:3: (otherlv_20= 'THERMODYNAMIC-TEMPERATURE-EXP:' ( (lv_temp_exp_21_0= RULE_INT ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==65) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPkgDsl.g:4387:4: otherlv_20= 'THERMODYNAMIC-TEMPERATURE-EXP:' ( (lv_temp_exp_21_0= RULE_INT ) )
                    {
                    otherlv_20=(Token)match(input,65,FOLLOW_61); 

                    				newLeafNode(otherlv_20, grammarAccess.getQuantityAccess().getTHERMODYNAMICTEMPERATUREEXPKeyword_15_0());
                    			
                    // InternalPkgDsl.g:4391:4: ( (lv_temp_exp_21_0= RULE_INT ) )
                    // InternalPkgDsl.g:4392:5: (lv_temp_exp_21_0= RULE_INT )
                    {
                    // InternalPkgDsl.g:4392:5: (lv_temp_exp_21_0= RULE_INT )
                    // InternalPkgDsl.g:4393:6: lv_temp_exp_21_0= RULE_INT
                    {
                    lv_temp_exp_21_0=(Token)match(input,RULE_INT,FOLLOW_67); 

                    						newLeafNode(lv_temp_exp_21_0, grammarAccess.getQuantityAccess().getTemp_expINTTerminalRuleCall_15_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"temp_exp",
                    							lv_temp_exp_21_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4410:3: (otherlv_22= 'TIME-EXP:' ( (lv_time_exp_23_0= RULE_INT ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==66) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPkgDsl.g:4411:4: otherlv_22= 'TIME-EXP:' ( (lv_time_exp_23_0= RULE_INT ) )
                    {
                    otherlv_22=(Token)match(input,66,FOLLOW_61); 

                    				newLeafNode(otherlv_22, grammarAccess.getQuantityAccess().getTIMEEXPKeyword_16_0());
                    			
                    // InternalPkgDsl.g:4415:4: ( (lv_time_exp_23_0= RULE_INT ) )
                    // InternalPkgDsl.g:4416:5: (lv_time_exp_23_0= RULE_INT )
                    {
                    // InternalPkgDsl.g:4416:5: (lv_time_exp_23_0= RULE_INT )
                    // InternalPkgDsl.g:4417:6: lv_time_exp_23_0= RULE_INT
                    {
                    lv_time_exp_23_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_time_exp_23_0, grammarAccess.getQuantityAccess().getTime_expINTTerminalRuleCall_16_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"time_exp",
                    							lv_time_exp_23_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getQuantityAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleEA_Numerical"
    // InternalPkgDsl.g:4442:1: entryRuleEA_Numerical returns [EObject current=null] : iv_ruleEA_Numerical= ruleEA_Numerical EOF ;
    public final EObject entryRuleEA_Numerical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEA_Numerical = null;


        try {
            // InternalPkgDsl.g:4442:53: (iv_ruleEA_Numerical= ruleEA_Numerical EOF )
            // InternalPkgDsl.g:4443:2: iv_ruleEA_Numerical= ruleEA_Numerical EOF
            {
             newCompositeNode(grammarAccess.getEA_NumericalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEA_Numerical=ruleEA_Numerical();

            state._fsp--;

             current =iv_ruleEA_Numerical; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEA_Numerical"


    // $ANTLR start "ruleEA_Numerical"
    // InternalPkgDsl.g:4449:1: ruleEA_Numerical returns [EObject current=null] : ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'EA_Numerical {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TEXT:' ( (lv_text_11_0= RULE_STRING ) ) )? (otherlv_12= 'MAX:' ( (lv_max_13_0= RULE_STRING ) ) )? (otherlv_14= 'MIN:' ( (lv_min_15_0= RULE_STRING ) ) )? otherlv_16= 'UNIT-OF-DATA:' ( (lv_data_unit_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleEA_Numerical() throws RecognitionException {
        EObject current = null;

        Token lv_define_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_uuid_3_0=null;
        Token otherlv_4=null;
        Token lv_shortname_5_0=null;
        Token otherlv_6=null;
        Token lv_category_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_text_11_0=null;
        Token otherlv_12=null;
        Token lv_max_13_0=null;
        Token otherlv_14=null;
        Token lv_min_15_0=null;
        Token otherlv_16=null;
        Token lv_data_unit_17_0=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalPkgDsl.g:4455:2: ( ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'EA_Numerical {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TEXT:' ( (lv_text_11_0= RULE_STRING ) ) )? (otherlv_12= 'MAX:' ( (lv_max_13_0= RULE_STRING ) ) )? (otherlv_14= 'MIN:' ( (lv_min_15_0= RULE_STRING ) ) )? otherlv_16= 'UNIT-OF-DATA:' ( (lv_data_unit_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // InternalPkgDsl.g:4456:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'EA_Numerical {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TEXT:' ( (lv_text_11_0= RULE_STRING ) ) )? (otherlv_12= 'MAX:' ( (lv_max_13_0= RULE_STRING ) ) )? (otherlv_14= 'MIN:' ( (lv_min_15_0= RULE_STRING ) ) )? otherlv_16= 'UNIT-OF-DATA:' ( (lv_data_unit_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // InternalPkgDsl.g:4456:2: ( ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'EA_Numerical {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TEXT:' ( (lv_text_11_0= RULE_STRING ) ) )? (otherlv_12= 'MAX:' ( (lv_max_13_0= RULE_STRING ) ) )? (otherlv_14= 'MIN:' ( (lv_min_15_0= RULE_STRING ) ) )? otherlv_16= 'UNIT-OF-DATA:' ( (lv_data_unit_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // InternalPkgDsl.g:4457:3: ( (lv_define_0_0= RULE_ID ) ) otherlv_1= 'EA_Numerical {' otherlv_2= 'UUID:' ( (lv_uuid_3_0= RULE_STRING ) ) otherlv_4= 'SHORT-NAME:' ( (lv_shortname_5_0= RULE_STRING ) ) otherlv_6= 'CATEGORY:' ( (lv_category_7_0= RULE_STRING ) ) otherlv_8= 'NAME:' ( (lv_name_9_0= RULE_STRING ) ) (otherlv_10= 'TEXT:' ( (lv_text_11_0= RULE_STRING ) ) )? (otherlv_12= 'MAX:' ( (lv_max_13_0= RULE_STRING ) ) )? (otherlv_14= 'MIN:' ( (lv_min_15_0= RULE_STRING ) ) )? otherlv_16= 'UNIT-OF-DATA:' ( (lv_data_unit_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            // InternalPkgDsl.g:4457:3: ( (lv_define_0_0= RULE_ID ) )
            // InternalPkgDsl.g:4458:4: (lv_define_0_0= RULE_ID )
            {
            // InternalPkgDsl.g:4458:4: (lv_define_0_0= RULE_ID )
            // InternalPkgDsl.g:4459:5: lv_define_0_0= RULE_ID
            {
            lv_define_0_0=(Token)match(input,RULE_ID,FOLLOW_68); 

            					newLeafNode(lv_define_0_0, grammarAccess.getEA_NumericalAccess().getDefineIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEA_NumericalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"define",
            						lv_define_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEA_NumericalAccess().getEA_NumericalKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEA_NumericalAccess().getUUIDKeyword_2());
            		
            // InternalPkgDsl.g:4483:3: ( (lv_uuid_3_0= RULE_STRING ) )
            // InternalPkgDsl.g:4484:4: (lv_uuid_3_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4484:4: (lv_uuid_3_0= RULE_STRING )
            // InternalPkgDsl.g:4485:5: lv_uuid_3_0= RULE_STRING
            {
            lv_uuid_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uuid_3_0, grammarAccess.getEA_NumericalAccess().getUuidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEA_NumericalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uuid",
            						lv_uuid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEA_NumericalAccess().getSHORTNAMEKeyword_4());
            		
            // InternalPkgDsl.g:4505:3: ( (lv_shortname_5_0= RULE_STRING ) )
            // InternalPkgDsl.g:4506:4: (lv_shortname_5_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4506:4: (lv_shortname_5_0= RULE_STRING )
            // InternalPkgDsl.g:4507:5: lv_shortname_5_0= RULE_STRING
            {
            lv_shortname_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_shortname_5_0, grammarAccess.getEA_NumericalAccess().getShortnameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEA_NumericalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shortname",
            						lv_shortname_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEA_NumericalAccess().getCATEGORYKeyword_6());
            		
            // InternalPkgDsl.g:4527:3: ( (lv_category_7_0= RULE_STRING ) )
            // InternalPkgDsl.g:4528:4: (lv_category_7_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4528:4: (lv_category_7_0= RULE_STRING )
            // InternalPkgDsl.g:4529:5: lv_category_7_0= RULE_STRING
            {
            lv_category_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_category_7_0, grammarAccess.getEA_NumericalAccess().getCategorySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEA_NumericalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getEA_NumericalAccess().getNAMEKeyword_8());
            		
            // InternalPkgDsl.g:4549:3: ( (lv_name_9_0= RULE_STRING ) )
            // InternalPkgDsl.g:4550:4: (lv_name_9_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4550:4: (lv_name_9_0= RULE_STRING )
            // InternalPkgDsl.g:4551:5: lv_name_9_0= RULE_STRING
            {
            lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

            					newLeafNode(lv_name_9_0, grammarAccess.getEA_NumericalAccess().getNameSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEA_NumericalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPkgDsl.g:4567:3: (otherlv_10= 'TEXT:' ( (lv_text_11_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==68) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPkgDsl.g:4568:4: otherlv_10= 'TEXT:' ( (lv_text_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,68,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getEA_NumericalAccess().getTEXTKeyword_10_0());
                    			
                    // InternalPkgDsl.g:4572:4: ( (lv_text_11_0= RULE_STRING ) )
                    // InternalPkgDsl.g:4573:5: (lv_text_11_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:4573:5: (lv_text_11_0= RULE_STRING )
                    // InternalPkgDsl.g:4574:6: lv_text_11_0= RULE_STRING
                    {
                    lv_text_11_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

                    						newLeafNode(lv_text_11_0, grammarAccess.getEA_NumericalAccess().getTextSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_NumericalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4591:3: (otherlv_12= 'MAX:' ( (lv_max_13_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==69) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPkgDsl.g:4592:4: otherlv_12= 'MAX:' ( (lv_max_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,69,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getEA_NumericalAccess().getMAXKeyword_11_0());
                    			
                    // InternalPkgDsl.g:4596:4: ( (lv_max_13_0= RULE_STRING ) )
                    // InternalPkgDsl.g:4597:5: (lv_max_13_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:4597:5: (lv_max_13_0= RULE_STRING )
                    // InternalPkgDsl.g:4598:6: lv_max_13_0= RULE_STRING
                    {
                    lv_max_13_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

                    						newLeafNode(lv_max_13_0, grammarAccess.getEA_NumericalAccess().getMaxSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_NumericalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max",
                    							lv_max_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPkgDsl.g:4615:3: (otherlv_14= 'MIN:' ( (lv_min_15_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==70) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPkgDsl.g:4616:4: otherlv_14= 'MIN:' ( (lv_min_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,70,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getEA_NumericalAccess().getMINKeyword_12_0());
                    			
                    // InternalPkgDsl.g:4620:4: ( (lv_min_15_0= RULE_STRING ) )
                    // InternalPkgDsl.g:4621:5: (lv_min_15_0= RULE_STRING )
                    {
                    // InternalPkgDsl.g:4621:5: (lv_min_15_0= RULE_STRING )
                    // InternalPkgDsl.g:4622:6: lv_min_15_0= RULE_STRING
                    {
                    lv_min_15_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						newLeafNode(lv_min_15_0, grammarAccess.getEA_NumericalAccess().getMinSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEA_NumericalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min",
                    							lv_min_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,71,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getEA_NumericalAccess().getUNITOFDATAKeyword_13());
            		
            // InternalPkgDsl.g:4643:3: ( (lv_data_unit_17_0= RULE_STRING ) )
            // InternalPkgDsl.g:4644:4: (lv_data_unit_17_0= RULE_STRING )
            {
            // InternalPkgDsl.g:4644:4: (lv_data_unit_17_0= RULE_STRING )
            // InternalPkgDsl.g:4645:5: lv_data_unit_17_0= RULE_STRING
            {
            lv_data_unit_17_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_data_unit_17_0, grammarAccess.getEA_NumericalAccess().getData_unitSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEA_NumericalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"data_unit",
            						lv_data_unit_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getEA_NumericalAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEA_Numerical"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001F012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001F010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001E010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000210010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xF000000000010000L,0x0000000000000007L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xE000000000010000L,0x0000000000000007L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xC000000000010000L,0x0000000000000007L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000010000L,0x0000000000000007L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000007L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000006L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000004L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});

}