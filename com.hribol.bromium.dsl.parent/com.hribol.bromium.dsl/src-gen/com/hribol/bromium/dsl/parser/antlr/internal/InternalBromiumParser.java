package com.hribol.bromium.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBromiumParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'from'", "'actions'", "'{'", "'}'", "'action'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'not'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'selector'", "'is'", "'clickable'", "'click'", "'on'", "'load'", "'page'", "'type'", "'in'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBromiumParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBromiumParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBromiumParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBromium.g"; }



     	private BromiumGrammarAccess grammarAccess;

        public InternalBromiumParser(TokenStream input, BromiumGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BromiumGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBromium.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBromium.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBromium.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBromium.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_version_3_0 = null;

        EObject lv_baseVersion_5_0 = null;

        EObject lv_actions_8_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:77:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' ) )
            // InternalBromium.g:78:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' )
            {
            // InternalBromium.g:78:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' )
            // InternalBromium.g:79:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getNameKeyword_0());
            		
            // InternalBromium.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBromium.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBromium.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalBromium.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getVersionKeyword_2());
            		
            // InternalBromium.g:105:3: ( (lv_version_3_0= ruleVersion ) )
            // InternalBromium.g:106:4: (lv_version_3_0= ruleVersion )
            {
            // InternalBromium.g:106:4: (lv_version_3_0= ruleVersion )
            // InternalBromium.g:107:5: lv_version_3_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getModelAccess().getVersionVersionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_version_3_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_3_0,
            						"com.hribol.bromium.dsl.Bromium.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBromium.g:124:3: (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBromium.g:125:4: otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getFromKeyword_4_0());
                    			
                    // InternalBromium.g:129:4: ( (lv_baseVersion_5_0= ruleVersion ) )
                    // InternalBromium.g:130:5: (lv_baseVersion_5_0= ruleVersion )
                    {
                    // InternalBromium.g:130:5: (lv_baseVersion_5_0= ruleVersion )
                    // InternalBromium.g:131:6: lv_baseVersion_5_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getBaseVersionVersionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_baseVersion_5_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"baseVersion",
                    							lv_baseVersion_5_0,
                    							"com.hribol.bromium.dsl.Bromium.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getActionsKeyword_5());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBromium.g:157:3: ( (lv_actions_8_0= ruleApplicationAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBromium.g:158:4: (lv_actions_8_0= ruleApplicationAction )
            	    {
            	    // InternalBromium.g:158:4: (lv_actions_8_0= ruleApplicationAction )
            	    // InternalBromium.g:159:5: lv_actions_8_0= ruleApplicationAction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getActionsApplicationActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actions_8_0=ruleApplicationAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_8_0,
            	    						"com.hribol.bromium.dsl.Bromium.ApplicationAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplicationAction"
    // InternalBromium.g:184:1: entryRuleApplicationAction returns [EObject current=null] : iv_ruleApplicationAction= ruleApplicationAction EOF ;
    public final EObject entryRuleApplicationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAction = null;


        try {
            // InternalBromium.g:184:58: (iv_ruleApplicationAction= ruleApplicationAction EOF )
            // InternalBromium.g:185:2: iv_ruleApplicationAction= ruleApplicationAction EOF
            {
             newCompositeNode(grammarAccess.getApplicationActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationAction=ruleApplicationAction();

            state._fsp--;

             current =iv_ruleApplicationAction; 
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
    // $ANTLR end "entryRuleApplicationAction"


    // $ANTLR start "ruleApplicationAction"
    // InternalBromium.g:191:1: ruleApplicationAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_actionId_1_0= RULE_STRING ) ) (otherlv_2= 'when' ( (lv_precondition_3_0= ruleWebDriverAction ) ) )? ( (lv_webDriverAction_4_0= ruleWebDriverAction ) ) (otherlv_5= 'then' otherlv_6= 'make' otherlv_7= 'sure' ( (lv_postcondition_8_0= ruleWebDriverAction ) ) )? (otherlv_9= 'do' (otherlv_10= 'not' )? otherlv_11= 'expect' otherlv_12= 'http' otherlv_13= 'request' )? ) ;
    public final EObject ruleApplicationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_actionId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_precondition_3_0 = null;

        EObject lv_webDriverAction_4_0 = null;

        EObject lv_postcondition_8_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:197:2: ( (otherlv_0= 'action' ( (lv_actionId_1_0= RULE_STRING ) ) (otherlv_2= 'when' ( (lv_precondition_3_0= ruleWebDriverAction ) ) )? ( (lv_webDriverAction_4_0= ruleWebDriverAction ) ) (otherlv_5= 'then' otherlv_6= 'make' otherlv_7= 'sure' ( (lv_postcondition_8_0= ruleWebDriverAction ) ) )? (otherlv_9= 'do' (otherlv_10= 'not' )? otherlv_11= 'expect' otherlv_12= 'http' otherlv_13= 'request' )? ) )
            // InternalBromium.g:198:2: (otherlv_0= 'action' ( (lv_actionId_1_0= RULE_STRING ) ) (otherlv_2= 'when' ( (lv_precondition_3_0= ruleWebDriverAction ) ) )? ( (lv_webDriverAction_4_0= ruleWebDriverAction ) ) (otherlv_5= 'then' otherlv_6= 'make' otherlv_7= 'sure' ( (lv_postcondition_8_0= ruleWebDriverAction ) ) )? (otherlv_9= 'do' (otherlv_10= 'not' )? otherlv_11= 'expect' otherlv_12= 'http' otherlv_13= 'request' )? )
            {
            // InternalBromium.g:198:2: (otherlv_0= 'action' ( (lv_actionId_1_0= RULE_STRING ) ) (otherlv_2= 'when' ( (lv_precondition_3_0= ruleWebDriverAction ) ) )? ( (lv_webDriverAction_4_0= ruleWebDriverAction ) ) (otherlv_5= 'then' otherlv_6= 'make' otherlv_7= 'sure' ( (lv_postcondition_8_0= ruleWebDriverAction ) ) )? (otherlv_9= 'do' (otherlv_10= 'not' )? otherlv_11= 'expect' otherlv_12= 'http' otherlv_13= 'request' )? )
            // InternalBromium.g:199:3: otherlv_0= 'action' ( (lv_actionId_1_0= RULE_STRING ) ) (otherlv_2= 'when' ( (lv_precondition_3_0= ruleWebDriverAction ) ) )? ( (lv_webDriverAction_4_0= ruleWebDriverAction ) ) (otherlv_5= 'then' otherlv_6= 'make' otherlv_7= 'sure' ( (lv_postcondition_8_0= ruleWebDriverAction ) ) )? (otherlv_9= 'do' (otherlv_10= 'not' )? otherlv_11= 'expect' otherlv_12= 'http' otherlv_13= 'request' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationActionAccess().getActionKeyword_0());
            		
            // InternalBromium.g:203:3: ( (lv_actionId_1_0= RULE_STRING ) )
            // InternalBromium.g:204:4: (lv_actionId_1_0= RULE_STRING )
            {
            // InternalBromium.g:204:4: (lv_actionId_1_0= RULE_STRING )
            // InternalBromium.g:205:5: lv_actionId_1_0= RULE_STRING
            {
            lv_actionId_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_actionId_1_0, grammarAccess.getApplicationActionAccess().getActionIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actionId",
            						lv_actionId_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBromium.g:221:3: (otherlv_2= 'when' ( (lv_precondition_3_0= ruleWebDriverAction ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBromium.g:222:4: otherlv_2= 'when' ( (lv_precondition_3_0= ruleWebDriverAction ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getApplicationActionAccess().getWhenKeyword_2_0());
                    			
                    // InternalBromium.g:226:4: ( (lv_precondition_3_0= ruleWebDriverAction ) )
                    // InternalBromium.g:227:5: (lv_precondition_3_0= ruleWebDriverAction )
                    {
                    // InternalBromium.g:227:5: (lv_precondition_3_0= ruleWebDriverAction )
                    // InternalBromium.g:228:6: lv_precondition_3_0= ruleWebDriverAction
                    {

                    						newCompositeNode(grammarAccess.getApplicationActionAccess().getPreconditionWebDriverActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_precondition_3_0=ruleWebDriverAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationActionRule());
                    						}
                    						set(
                    							current,
                    							"precondition",
                    							lv_precondition_3_0,
                    							"com.hribol.bromium.dsl.Bromium.WebDriverAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBromium.g:246:3: ( (lv_webDriverAction_4_0= ruleWebDriverAction ) )
            // InternalBromium.g:247:4: (lv_webDriverAction_4_0= ruleWebDriverAction )
            {
            // InternalBromium.g:247:4: (lv_webDriverAction_4_0= ruleWebDriverAction )
            // InternalBromium.g:248:5: lv_webDriverAction_4_0= ruleWebDriverAction
            {

            					newCompositeNode(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_webDriverAction_4_0=ruleWebDriverAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
            					}
            					set(
            						current,
            						"webDriverAction",
            						lv_webDriverAction_4_0,
            						"com.hribol.bromium.dsl.Bromium.WebDriverAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBromium.g:265:3: (otherlv_5= 'then' otherlv_6= 'make' otherlv_7= 'sure' ( (lv_postcondition_8_0= ruleWebDriverAction ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:266:4: otherlv_5= 'then' otherlv_6= 'make' otherlv_7= 'sure' ( (lv_postcondition_8_0= ruleWebDriverAction ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getApplicationActionAccess().getThenKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getApplicationActionAccess().getMakeKeyword_4_1());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getApplicationActionAccess().getSureKeyword_4_2());
                    			
                    // InternalBromium.g:278:4: ( (lv_postcondition_8_0= ruleWebDriverAction ) )
                    // InternalBromium.g:279:5: (lv_postcondition_8_0= ruleWebDriverAction )
                    {
                    // InternalBromium.g:279:5: (lv_postcondition_8_0= ruleWebDriverAction )
                    // InternalBromium.g:280:6: lv_postcondition_8_0= ruleWebDriverAction
                    {

                    						newCompositeNode(grammarAccess.getApplicationActionAccess().getPostconditionWebDriverActionParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_postcondition_8_0=ruleWebDriverAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationActionRule());
                    						}
                    						set(
                    							current,
                    							"postcondition",
                    							lv_postcondition_8_0,
                    							"com.hribol.bromium.dsl.Bromium.WebDriverAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBromium.g:298:3: (otherlv_9= 'do' (otherlv_10= 'not' )? otherlv_11= 'expect' otherlv_12= 'http' otherlv_13= 'request' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBromium.g:299:4: otherlv_9= 'do' (otherlv_10= 'not' )? otherlv_11= 'expect' otherlv_12= 'http' otherlv_13= 'request'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getApplicationActionAccess().getDoKeyword_5_0());
                    			
                    // InternalBromium.g:303:4: (otherlv_10= 'not' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==23) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalBromium.g:304:5: otherlv_10= 'not'
                            {
                            otherlv_10=(Token)match(input,23,FOLLOW_16); 

                            					newLeafNode(otherlv_10, grammarAccess.getApplicationActionAccess().getNotKeyword_5_1());
                            				

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getApplicationActionAccess().getExpectKeyword_5_2());
                    			
                    otherlv_12=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getApplicationActionAccess().getHttpKeyword_5_3());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getApplicationActionAccess().getRequestKeyword_5_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleApplicationAction"


    // $ANTLR start "entryRuleWebDriverAction"
    // InternalBromium.g:326:1: entryRuleWebDriverAction returns [EObject current=null] : iv_ruleWebDriverAction= ruleWebDriverAction EOF ;
    public final EObject entryRuleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebDriverAction = null;


        try {
            // InternalBromium.g:326:56: (iv_ruleWebDriverAction= ruleWebDriverAction EOF )
            // InternalBromium.g:327:2: iv_ruleWebDriverAction= ruleWebDriverAction EOF
            {
             newCompositeNode(grammarAccess.getWebDriverActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebDriverAction=ruleWebDriverAction();

            state._fsp--;

             current =iv_ruleWebDriverAction; 
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
    // $ANTLR end "entryRuleWebDriverAction"


    // $ANTLR start "ruleWebDriverAction"
    // InternalBromium.g:333:1: ruleWebDriverAction returns [EObject current=null] : (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector ) ;
    public final EObject ruleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject this_ElementWithIdIsPresent_0 = null;

        EObject this_ClickOnElementWithId_1 = null;

        EObject this_PageLoad_2 = null;

        EObject this_TypeTextInElementFoundByCssSelector_3 = null;



        	enterRule();

        try {
            // InternalBromium.g:339:2: ( (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector ) )
            // InternalBromium.g:340:2: (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector )
            {
            // InternalBromium.g:340:2: (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBromium.g:341:3: this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getElementWithIdIsPresentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementWithIdIsPresent_0=ruleElementWithIdIsPresent();

                    state._fsp--;


                    			current = this_ElementWithIdIsPresent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBromium.g:350:3: this_ClickOnElementWithId_1= ruleClickOnElementWithId
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getClickOnElementWithIdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickOnElementWithId_1=ruleClickOnElementWithId();

                    state._fsp--;


                    			current = this_ClickOnElementWithId_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBromium.g:359:3: this_PageLoad_2= rulePageLoad
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getPageLoadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageLoad_2=rulePageLoad();

                    state._fsp--;


                    			current = this_PageLoad_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBromium.g:368:3: this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeTextInElementFoundByCssSelector_3=ruleTypeTextInElementFoundByCssSelector();

                    state._fsp--;


                    			current = this_TypeTextInElementFoundByCssSelector_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleWebDriverAction"


    // $ANTLR start "entryRuleElementWithIdIsPresent"
    // InternalBromium.g:380:1: entryRuleElementWithIdIsPresent returns [EObject current=null] : iv_ruleElementWithIdIsPresent= ruleElementWithIdIsPresent EOF ;
    public final EObject entryRuleElementWithIdIsPresent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementWithIdIsPresent = null;


        try {
            // InternalBromium.g:380:63: (iv_ruleElementWithIdIsPresent= ruleElementWithIdIsPresent EOF )
            // InternalBromium.g:381:2: iv_ruleElementWithIdIsPresent= ruleElementWithIdIsPresent EOF
            {
             newCompositeNode(grammarAccess.getElementWithIdIsPresentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementWithIdIsPresent=ruleElementWithIdIsPresent();

            state._fsp--;

             current =iv_ruleElementWithIdIsPresent; 
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
    // $ANTLR end "entryRuleElementWithIdIsPresent"


    // $ANTLR start "ruleElementWithIdIsPresent"
    // InternalBromium.g:387:1: ruleElementWithIdIsPresent returns [EObject current=null] : (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= RULE_STRING ) ) otherlv_5= 'is' otherlv_6= 'clickable' ) ;
    public final EObject ruleElementWithIdIsPresent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_cssSelector_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalBromium.g:393:2: ( (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= RULE_STRING ) ) otherlv_5= 'is' otherlv_6= 'clickable' ) )
            // InternalBromium.g:394:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= RULE_STRING ) ) otherlv_5= 'is' otherlv_6= 'clickable' )
            {
            // InternalBromium.g:394:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= RULE_STRING ) ) otherlv_5= 'is' otherlv_6= 'clickable' )
            // InternalBromium.g:395:3: otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= RULE_STRING ) ) otherlv_5= 'is' otherlv_6= 'clickable'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getElementWithIdIsPresentAccess().getElementKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getElementWithIdIsPresentAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getElementWithIdIsPresentAccess().getCssKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getElementWithIdIsPresentAccess().getSelectorKeyword_3());
            		
            // InternalBromium.g:411:3: ( (lv_cssSelector_4_0= RULE_STRING ) )
            // InternalBromium.g:412:4: (lv_cssSelector_4_0= RULE_STRING )
            {
            // InternalBromium.g:412:4: (lv_cssSelector_4_0= RULE_STRING )
            // InternalBromium.g:413:5: lv_cssSelector_4_0= RULE_STRING
            {
            lv_cssSelector_4_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_cssSelector_4_0, grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementWithIdIsPresentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cssSelector",
            						lv_cssSelector_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getElementWithIdIsPresentAccess().getIsKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getElementWithIdIsPresentAccess().getClickableKeyword_6());
            		

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
    // $ANTLR end "ruleElementWithIdIsPresent"


    // $ANTLR start "entryRuleClickOnElementWithId"
    // InternalBromium.g:441:1: entryRuleClickOnElementWithId returns [EObject current=null] : iv_ruleClickOnElementWithId= ruleClickOnElementWithId EOF ;
    public final EObject entryRuleClickOnElementWithId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickOnElementWithId = null;


        try {
            // InternalBromium.g:441:61: (iv_ruleClickOnElementWithId= ruleClickOnElementWithId EOF )
            // InternalBromium.g:442:2: iv_ruleClickOnElementWithId= ruleClickOnElementWithId EOF
            {
             newCompositeNode(grammarAccess.getClickOnElementWithIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickOnElementWithId=ruleClickOnElementWithId();

            state._fsp--;

             current =iv_ruleClickOnElementWithId; 
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
    // $ANTLR end "entryRuleClickOnElementWithId"


    // $ANTLR start "ruleClickOnElementWithId"
    // InternalBromium.g:448:1: ruleClickOnElementWithId returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleClickOnElementWithId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_cssSelector_6_0=null;


        	enterRule();

        try {
            // InternalBromium.g:454:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= RULE_STRING ) ) ) )
            // InternalBromium.g:455:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= RULE_STRING ) ) )
            {
            // InternalBromium.g:455:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= RULE_STRING ) ) )
            // InternalBromium.g:456:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getClickOnElementWithIdAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getClickOnElementWithIdAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getClickOnElementWithIdAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getClickOnElementWithIdAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getClickOnElementWithIdAccess().getCssKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getClickOnElementWithIdAccess().getSelectorKeyword_5());
            		
            // InternalBromium.g:480:3: ( (lv_cssSelector_6_0= RULE_STRING ) )
            // InternalBromium.g:481:4: (lv_cssSelector_6_0= RULE_STRING )
            {
            // InternalBromium.g:481:4: (lv_cssSelector_6_0= RULE_STRING )
            // InternalBromium.g:482:5: lv_cssSelector_6_0= RULE_STRING
            {
            lv_cssSelector_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_cssSelector_6_0, grammarAccess.getClickOnElementWithIdAccess().getCssSelectorSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickOnElementWithIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cssSelector",
            						lv_cssSelector_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleClickOnElementWithId"


    // $ANTLR start "entryRulePageLoad"
    // InternalBromium.g:502:1: entryRulePageLoad returns [EObject current=null] : iv_rulePageLoad= rulePageLoad EOF ;
    public final EObject entryRulePageLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageLoad = null;


        try {
            // InternalBromium.g:502:49: (iv_rulePageLoad= rulePageLoad EOF )
            // InternalBromium.g:503:2: iv_rulePageLoad= rulePageLoad EOF
            {
             newCompositeNode(grammarAccess.getPageLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageLoad=rulePageLoad();

            state._fsp--;

             current =iv_rulePageLoad; 
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
    // $ANTLR end "entryRulePageLoad"


    // $ANTLR start "rulePageLoad"
    // InternalBromium.g:509:1: rulePageLoad returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePageLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_subpath_2_0=null;


        	enterRule();

        try {
            // InternalBromium.g:515:2: ( (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) ) )
            // InternalBromium.g:516:2: (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) )
            {
            // InternalBromium.g:516:2: (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) )
            // InternalBromium.g:517:3: otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getPageLoadAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPageLoadAccess().getPageKeyword_1());
            		
            // InternalBromium.g:525:3: ( (lv_subpath_2_0= RULE_STRING ) )
            // InternalBromium.g:526:4: (lv_subpath_2_0= RULE_STRING )
            {
            // InternalBromium.g:526:4: (lv_subpath_2_0= RULE_STRING )
            // InternalBromium.g:527:5: lv_subpath_2_0= RULE_STRING
            {
            lv_subpath_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_subpath_2_0, grammarAccess.getPageLoadAccess().getSubpathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subpath",
            						lv_subpath_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "rulePageLoad"


    // $ANTLR start "entryRuleTypeTextInElementFoundByCssSelector"
    // InternalBromium.g:547:1: entryRuleTypeTextInElementFoundByCssSelector returns [EObject current=null] : iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF ;
    public final EObject entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTextInElementFoundByCssSelector = null;


        try {
            // InternalBromium.g:547:76: (iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:548:2: iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF
            {
             newCompositeNode(grammarAccess.getTypeTextInElementFoundByCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeTextInElementFoundByCssSelector=ruleTypeTextInElementFoundByCssSelector();

            state._fsp--;

             current =iv_ruleTypeTextInElementFoundByCssSelector; 
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
    // $ANTLR end "entryRuleTypeTextInElementFoundByCssSelector"


    // $ANTLR start "ruleTypeTextInElementFoundByCssSelector"
    // InternalBromium.g:554:1: ruleTypeTextInElementFoundByCssSelector returns [EObject current=null] : (otherlv_0= 'type' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_cssSelector_7_0=null;


        	enterRule();

        try {
            // InternalBromium.g:560:2: ( (otherlv_0= 'type' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= RULE_STRING ) ) ) )
            // InternalBromium.g:561:2: (otherlv_0= 'type' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= RULE_STRING ) ) )
            {
            // InternalBromium.g:561:2: (otherlv_0= 'type' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= RULE_STRING ) ) )
            // InternalBromium.g:562:3: otherlv_0= 'type' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0());
            		
            // InternalBromium.g:566:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalBromium.g:567:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalBromium.g:567:4: (lv_text_1_0= RULE_STRING )
            // InternalBromium.g:568:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getSelectorKeyword_6());
            		
            // InternalBromium.g:604:3: ( (lv_cssSelector_7_0= RULE_STRING ) )
            // InternalBromium.g:605:4: (lv_cssSelector_7_0= RULE_STRING )
            {
            // InternalBromium.g:605:4: (lv_cssSelector_7_0= RULE_STRING )
            // InternalBromium.g:606:5: lv_cssSelector_7_0= RULE_STRING
            {
            lv_cssSelector_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_cssSelector_7_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cssSelector",
            						lv_cssSelector_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTypeTextInElementFoundByCssSelector"


    // $ANTLR start "entryRuleVersion"
    // InternalBromium.g:626:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalBromium.g:626:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalBromium.g:627:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalBromium.g:633:1: ruleVersion returns [EObject current=null] : (this_ThreeDottedVersion_0= ruleThreeDottedVersion | this_STRING_1= RULE_STRING ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        EObject this_ThreeDottedVersion_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:639:2: ( (this_ThreeDottedVersion_0= ruleThreeDottedVersion | this_STRING_1= RULE_STRING ) )
            // InternalBromium.g:640:2: (this_ThreeDottedVersion_0= ruleThreeDottedVersion | this_STRING_1= RULE_STRING )
            {
            // InternalBromium.g:640:2: (this_ThreeDottedVersion_0= ruleThreeDottedVersion | this_STRING_1= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBromium.g:641:3: this_ThreeDottedVersion_0= ruleThreeDottedVersion
                    {

                    			newCompositeNode(grammarAccess.getVersionAccess().getThreeDottedVersionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThreeDottedVersion_0=ruleThreeDottedVersion();

                    state._fsp--;


                    			current = this_ThreeDottedVersion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBromium.g:650:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleThreeDottedVersion"
    // InternalBromium.g:658:1: entryRuleThreeDottedVersion returns [EObject current=null] : iv_ruleThreeDottedVersion= ruleThreeDottedVersion EOF ;
    public final EObject entryRuleThreeDottedVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreeDottedVersion = null;


        try {
            // InternalBromium.g:658:59: (iv_ruleThreeDottedVersion= ruleThreeDottedVersion EOF )
            // InternalBromium.g:659:2: iv_ruleThreeDottedVersion= ruleThreeDottedVersion EOF
            {
             newCompositeNode(grammarAccess.getThreeDottedVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreeDottedVersion=ruleThreeDottedVersion();

            state._fsp--;

             current =iv_ruleThreeDottedVersion; 
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
    // $ANTLR end "entryRuleThreeDottedVersion"


    // $ANTLR start "ruleThreeDottedVersion"
    // InternalBromium.g:665:1: ruleThreeDottedVersion returns [EObject current=null] : ( ( (lv_big_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_medium_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_small_4_0= RULE_INT ) ) ) ;
    public final EObject ruleThreeDottedVersion() throws RecognitionException {
        EObject current = null;

        Token lv_big_0_0=null;
        Token otherlv_1=null;
        Token lv_medium_2_0=null;
        Token otherlv_3=null;
        Token lv_small_4_0=null;


        	enterRule();

        try {
            // InternalBromium.g:671:2: ( ( ( (lv_big_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_medium_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_small_4_0= RULE_INT ) ) ) )
            // InternalBromium.g:672:2: ( ( (lv_big_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_medium_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_small_4_0= RULE_INT ) ) )
            {
            // InternalBromium.g:672:2: ( ( (lv_big_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_medium_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_small_4_0= RULE_INT ) ) )
            // InternalBromium.g:673:3: ( (lv_big_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_medium_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_small_4_0= RULE_INT ) )
            {
            // InternalBromium.g:673:3: ( (lv_big_0_0= RULE_INT ) )
            // InternalBromium.g:674:4: (lv_big_0_0= RULE_INT )
            {
            // InternalBromium.g:674:4: (lv_big_0_0= RULE_INT )
            // InternalBromium.g:675:5: lv_big_0_0= RULE_INT
            {
            lv_big_0_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_big_0_0, grammarAccess.getThreeDottedVersionAccess().getBigINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThreeDottedVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"big",
            						lv_big_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getThreeDottedVersionAccess().getFullStopKeyword_1());
            		
            // InternalBromium.g:695:3: ( (lv_medium_2_0= RULE_INT ) )
            // InternalBromium.g:696:4: (lv_medium_2_0= RULE_INT )
            {
            // InternalBromium.g:696:4: (lv_medium_2_0= RULE_INT )
            // InternalBromium.g:697:5: lv_medium_2_0= RULE_INT
            {
            lv_medium_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_medium_2_0, grammarAccess.getThreeDottedVersionAccess().getMediumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThreeDottedVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"medium",
            						lv_medium_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getThreeDottedVersionAccess().getFullStopKeyword_3());
            		
            // InternalBromium.g:717:3: ( (lv_small_4_0= RULE_INT ) )
            // InternalBromium.g:718:4: (lv_small_4_0= RULE_INT )
            {
            // InternalBromium.g:718:4: (lv_small_4_0= RULE_INT )
            // InternalBromium.g:719:5: lv_small_4_0= RULE_INT
            {
            lv_small_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_small_4_0, grammarAccess.getThreeDottedVersionAccess().getSmallINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThreeDottedVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"small",
            						lv_small_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleThreeDottedVersion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002A08040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});

}