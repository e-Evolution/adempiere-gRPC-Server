// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public final class ADempiereDictionary {
  private ADempiereDictionary() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_ApplicationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_ApplicationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_EntityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_EntityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Window_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Window_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Tab_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Tab_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_ContextInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_ContextInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_MessageText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_MessageText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_FieldGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_FieldGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_FieldDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_FieldDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_FieldCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_FieldCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Process_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Process_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Form_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Form_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_SmartBrowser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_SmartBrowser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Validation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Validation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Reference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_ReferenceValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_ReferenceValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_ReferenceTable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_ReferenceTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_Menu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_Menu_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020dictionary.proto\022\ndictionary\"K\n\022Applic" +
      "ationRequest\022\014\n\004uuid\030\001 \001(\t\022\020\n\010language\030\002" +
      " \001(\t\022\025\n\rclientVersion\030\003 \001(\t\"e\n\rEntityReq" +
      "uest\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022:\n\022applic" +
      "ationRequest\030\003 \001(\0132\036.dictionary.Applicat" +
      "ionRequest\"\261\001\n\006Window\022\n\n\002id\030\001 \001(\005\022\014\n\004uui" +
      "d\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\023\n\013description\030\004 \001" +
      "(\t\022\014\n\004help\030\005 \001(\t\022\017\n\007isSOTrx\030\006 \001(\010\022,\n\013con" +
      "textInfo\030\007 \001(\0132\027.dictionary.ContextInfo\022" +
      "\035\n\004tabs\030\010 \003(\0132\017.dictionary.Tab\"\356\004\n\003Tab\022\n" +
      "\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\023" +
      "\n\013description\030\004 \001(\t\022\014\n\004help\030\005 \001(\t\022\021\n\ttab" +
      "leName\030\006 \001(\t\022\020\n\010sequence\030\007 \001(\005\022\020\n\010tabLev" +
      "el\030\010 \001(\005\022\023\n\013isSingleRow\030\t \001(\010\022\025\n\risAdvan" +
      "cedTab\030\n \001(\010\022\021\n\tisHasTree\030\013 \001(\010\022\021\n\tisInf" +
      "oTab\030\014 \001(\010\022\021\n\tisSortTab\030\r \001(\010\022\030\n\020isTrans" +
      "lationTab\030\016 \001(\010\022\022\n\nisReadOnly\030\017 \001(\010\022\026\n\016i" +
      "sInsertRecord\030\020 \001(\010\022\016\n\006isView\030\021 \001(\010\022\024\n\014i" +
      "sDeleteable\030\022 \001(\010\022\022\n\nisDocument\030\023 \001(\010\022\023\n" +
      "\013accessLevel\030\024 \001(\005\022\026\n\016linkColumnName\030\025 \001" +
      "(\t\022\030\n\020parentColumnName\030\026 \001(\t\022\024\n\014displayL" +
      "ogic\030\027 \001(\t\022\025\n\rcommitWarning\030\030 \001(\t\022\025\n\rord" +
      "erByClause\030\031 \001(\t\022,\n\013contextInfo\030\032 \001(\0132\027." +
      "dictionary.ContextInfo\022$\n\007process\030\033 \001(\0132" +
      "\023.dictionary.Process\022!\n\006fields\030\034 \003(\0132\021.d" +
      "ictionary.Field\"\221\t\n\005Field\022\n\n\002id\030\001 \001(\005\022\014\n" +
      "\004uuid\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\023\n\013description" +
      "\030\004 \001(\t\022\014\n\004help\030\005 \001(\t\022\020\n\010sequence\030\006 \001(\005\022\022" +
      "\n\ncolumnName\030\007 \001(\t\022\023\n\013isDisplayed\030\010 \001(\010\022" +
      "\027\n\017isDisplayedGrid\030\t \001(\010\022\022\n\nisReadOnly\030\n" +
      " \001(\010\022\023\n\013isAllowCopy\030\013 \001(\010\022\023\n\013isEncrypted" +
      "\030\014 \001(\010\022\022\n\nisSameLine\030\r \001(\010\022\021\n\tisHeading\030" +
      "\016 \001(\010\022\023\n\013isFieldOnly\030\017 \001(\010\022\024\n\014isQuickEnt" +
      "ry\030\020 \001(\010\022\023\n\013isMandatory\030\021 \001(\010\022\r\n\005isKey\030\022" +
      " \001(\010\022\020\n\010isParent\030\023 \001(\010\022\024\n\014isUpdateable\030\024" +
      " \001(\010\022\024\n\014isIdentifier\030\025 \001(\010\022\026\n\016isAllowLog" +
      "ging\030\026 \001(\010\022\031\n\021isSelectionColumn\030\027 \001(\010\022\017\n" +
      "\007isRange\030\030 \001(\010\022\032\n\022isAlwaysUpdateable\030\031 \001" +
      "(\010\022\024\n\014isTranslated\030\032 \001(\010\022\032\n\022identifierSe" +
      "quence\030M \001(\005\022\024\n\014displayLogic\030\034 \001(\t\022\023\n\013di" +
      "splayType\030\035 \001(\005\022\024\n\014defaultValue\030\036 \001(\t\022\025\n" +
      "\rreadOnlyLogic\030\037 \001(\t\022\026\n\016mandatoryLogic\030 " +
      " \001(\t\022\017\n\007callout\030! \001(\t\022\021\n\tcolumnSQL\030\" \001(\t" +
      "\022\017\n\007vFormat\030# \001(\t\022\020\n\010valueMin\030$ \001(\t\022\020\n\010v" +
      "alueMax\030% \001(\t\022\025\n\rformatPattern\030& \001(\t\022,\n\013" +
      "contextInfo\030\' \001(\0132\027.dictionary.ContextIn" +
      "fo\022*\n\nfieldGroup\030( \001(\0132\026.dictionary.Fiel" +
      "dGroup\022*\n\nvalidation\030) \001(\0132\026.dictionary." +
      "Validation\0224\n\017fieldDefinition\030* \001(\0132\033.di" +
      "ctionary.FieldDefinition\022(\n\treference\030+ " +
      "\001(\0132\025.dictionary.Reference\022$\n\007process\030, " +
      "\001(\0132\023.dictionary.Process\022\027\n\017isQueryCrite" +
      "ria\030- \001(\010\022\021\n\tisOrderBy\030. \001(\010\022\021\n\tseqNoGri" +
      "d\030/ \001(\005\022\016\n\006sortNo\0300 \001(\005\022\022\n\nisInfoOnly\0301 " +
      "\001(\010\022\026\n\016defaultValueTo\0302 \001(\t\"\216\001\n\013ContextI" +
      "nfo\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\014\n\004name\030\003 " +
      "\001(\t\022\023\n\013description\030\004 \001(\t\022,\n\013messageText\030" +
      "\005 \001(\0132\027.dictionary.MessageText\022\024\n\014sqlSta" +
      "tement\030\006 \001(\t\"h\n\013MessageText\022\n\n\002id\030\001 \001(\005\022" +
      "\014\n\004uuid\030\002 \001(\t\022\r\n\005value\030\003 \001(\t\022\017\n\007msgType\030" +
      "\004 \001(\t\022\017\n\007msgText\030\005 \001(\t\022\016\n\006msgTip\030\006 \001(\t\"L" +
      "\n\nFieldGroup\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\014" +
      "\n\004name\030\003 \001(\t\022\026\n\016fieldGroupType\030\004 \001(\t\"\220\001\n" +
      "\017FieldDefinition\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001" +
      "(\t\022\r\n\005value\030\003 \001(\t\022\014\n\004name\030\004 \001(\t\022\026\n\016field" +
      "GroupType\030\005 \001(\t\022.\n\nconditions\030\006 \003(\0132\032.di" +
      "ctionary.FieldCondition\"Q\n\016FieldConditio" +
      "n\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\021\n\tcondition" +
      "\030\003 \001(\t\022\022\n\nStylesheet\030\004 \001(\t\"\332\001\n\007Process\022\n" +
      "\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\r\n\005value\030\003 \001(\t\022" +
      "\014\n\004name\030\004 \001(\t\022\023\n\013description\030\005 \001(\t\022\014\n\004he" +
      "lp\030\006 \001(\t\022\020\n\010isReport\030\007 \001(\010\022\023\n\013accessLeve" +
      "l\030\010 \001(\005\022\020\n\010showHelp\030\t \001(\t\022\025\n\risDirectPri" +
      "nt\030\n \001(\010\022%\n\nparameters\030\013 \003(\0132\021.dictionar" +
      "y.Field\"y\n\004Form\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(" +
      "\t\022\014\n\004name\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\022\014\n\004" +
      "help\030\005 \001(\t\022\023\n\013accessLevel\030\006 \001(\005\022\021\n\tclass" +
      "Name\030\007 \001(\t\"\261\003\n\014SmartBrowser\022\n\n\002id\030\001 \001(\005\022" +
      "\014\n\004uuid\030\002 \001(\t\022\r\n\005value\030\003 \001(\t\022\014\n\004name\030\004 \001" +
      "(\t\022\023\n\013description\030\005 \001(\t\022\014\n\004help\030\006 \001(\t\022\023\n" +
      "\013accessLevel\030\010 \001(\005\022\023\n\013whereClause\030\t \001(\t\022" +
      "\024\n\014isUpdateable\030\n \001(\010\022\024\n\014IsDeleteable\030\013 " +
      "\001(\010\022\033\n\023IsSelectedByDefault\030\014 \001(\010\022\036\n\026IsCo" +
      "llapsibleByDefault\030\r \001(\010\022 \n\030IsExecutedQu" +
      "eryByDefault\030\016 \001(\010\022\023\n\013IsShowTotal\030\017 \001(\010\022" +
      "\020\n\010viewUuid\030\020 \001(\t\022\"\n\006window\030\021 \001(\0132\022.dict" +
      "ionary.Window\022$\n\007process\030\022 \001(\0132\023.diction" +
      "ary.Process\022!\n\006fields\030\023 \003(\0132\021.dictionary" +
      ".Field\"Z\n\nValidation\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid" +
      "\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\026\n\016validationType\030\004" +
      " \001(\t\022\014\n\004code\030\005 \001(\t\"\253\001\n\tReference\022\n\n\002id\030\001" +
      " \001(\005\022\014\n\004uuid\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\026\n\016vali" +
      "dationType\030\004 \001(\t\0222\n\016referenceTable\030\005 \001(\013" +
      "2\032.dictionary.ReferenceTable\022*\n\006values\030\006" +
      " \003(\0132\032.dictionary.ReferenceValue\"\\\n\016Refe" +
      "renceValue\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\r\n\005" +
      "value\030\003 \001(\t\022\014\n\004name\030\004 \001(\t\022\023\n\013description" +
      "\030\005 \001(\t\"\317\001\n\016ReferenceTable\022\n\n\002id\030\001 \001(\005\022\014\n" +
      "\004uuid\030\002 \001(\t\022\021\n\ttableName\030\003 \001(\t\022\025\n\rkeyCol" +
      "umnName\030\004 \001(\t\022\031\n\021displayColumnName\030\005 \001(\t" +
      "\022\033\n\023isDisplayIdentifier\030\006 \001(\010\022\030\n\020isValue" +
      "Displayed\030\007 \001(\010\022\022\n\ndisplaySQL\030\010 \001(\t\022\023\n\013w" +
      "hereClause\030\t \001(\t\"\250\002\n\004Menu\022\n\n\002id\030\001 \001(\005\022\014\n" +
      "\004uuid\030\002 \001(\t\022\022\n\nparentUuid\030\004 \001(\t\022\014\n\004name\030" +
      "\005 \001(\t\022\023\n\013description\030\006 \001(\t\022\020\n\010sequence\030\007" +
      " \001(\t\022\022\n\nisReadOnly\030\010 \001(\010\022\021\n\tisSummary\030\t " +
      "\001(\010\022\017\n\007isSOTrx\030\n \001(\010\022\016\n\006action\030\013 \001(\t\022\020\n\010" +
      "formUuid\030\014 \001(\t\022\022\n\nwindowUuid\030\r \001(\t\022\023\n\013pr" +
      "ocessUuid\030\016 \001(\t\022\030\n\020smartBrowserUuid\030\017 \001(" +
      "\t\022 \n\006childs\030\020 \003(\0132\020.dictionary.Menu2\343\003\n\021" +
      "DictionaryService\022D\n\023RequestMenuAndChild" +
      "\022\031.dictionary.EntityRequest\032\020.dictionary" +
      ".Menu\"\000\022<\n\013RequestMenu\022\031.dictionary.Enti" +
      "tyRequest\032\020.dictionary.Menu\"\000\022@\n\rRequest" +
      "Window\022\031.dictionary.EntityRequest\032\022.dict" +
      "ionary.Window\"\000\022G\n\024RequestWindowAndTabs\022" +
      "\031.dictionary.EntityRequest\032\022.dictionary." +
      "Window\"\000\022:\n\nRequestTab\022\031.dictionary.Enti" +
      "tyRequest\032\017.dictionary.Tab\"\000\022C\n\023RequestT" +
      "abAndFields\022\031.dictionary.EntityRequest\032\017" +
      ".dictionary.Tab\"\000\022>\n\014RequestField\022\031.dict" +
      "ionary.EntityRequest\032\021.dictionary.Field\"" +
      "\000B1\n\022org.spin.grpc.utilB\023ADempiereDictio" +
      "naryP\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_dictionary_ApplicationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dictionary_ApplicationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_ApplicationRequest_descriptor,
        new java.lang.String[] { "Uuid", "Language", "ClientVersion", });
    internal_static_dictionary_EntityRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dictionary_EntityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_EntityRequest_descriptor,
        new java.lang.String[] { "Id", "Uuid", "ApplicationRequest", });
    internal_static_dictionary_Window_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dictionary_Window_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Window_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "Description", "Help", "IsSOTrx", "ContextInfo", "Tabs", });
    internal_static_dictionary_Tab_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dictionary_Tab_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Tab_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "Description", "Help", "TableName", "Sequence", "TabLevel", "IsSingleRow", "IsAdvancedTab", "IsHasTree", "IsInfoTab", "IsSortTab", "IsTranslationTab", "IsReadOnly", "IsInsertRecord", "IsView", "IsDeleteable", "IsDocument", "AccessLevel", "LinkColumnName", "ParentColumnName", "DisplayLogic", "CommitWarning", "OrderByClause", "ContextInfo", "Process", "Fields", });
    internal_static_dictionary_Field_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_dictionary_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Field_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "Description", "Help", "Sequence", "ColumnName", "IsDisplayed", "IsDisplayedGrid", "IsReadOnly", "IsAllowCopy", "IsEncrypted", "IsSameLine", "IsHeading", "IsFieldOnly", "IsQuickEntry", "IsMandatory", "IsKey", "IsParent", "IsUpdateable", "IsIdentifier", "IsAllowLogging", "IsSelectionColumn", "IsRange", "IsAlwaysUpdateable", "IsTranslated", "IdentifierSequence", "DisplayLogic", "DisplayType", "DefaultValue", "ReadOnlyLogic", "MandatoryLogic", "Callout", "ColumnSQL", "VFormat", "ValueMin", "ValueMax", "FormatPattern", "ContextInfo", "FieldGroup", "Validation", "FieldDefinition", "Reference", "Process", "IsQueryCriteria", "IsOrderBy", "SeqNoGrid", "SortNo", "IsInfoOnly", "DefaultValueTo", });
    internal_static_dictionary_ContextInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_dictionary_ContextInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_ContextInfo_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "Description", "MessageText", "SqlStatement", });
    internal_static_dictionary_MessageText_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_dictionary_MessageText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_MessageText_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Value", "MsgType", "MsgText", "MsgTip", });
    internal_static_dictionary_FieldGroup_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_dictionary_FieldGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_FieldGroup_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "FieldGroupType", });
    internal_static_dictionary_FieldDefinition_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_dictionary_FieldDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_FieldDefinition_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Value", "Name", "FieldGroupType", "Conditions", });
    internal_static_dictionary_FieldCondition_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_dictionary_FieldCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_FieldCondition_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Condition", "Stylesheet", });
    internal_static_dictionary_Process_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_dictionary_Process_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Process_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Value", "Name", "Description", "Help", "IsReport", "AccessLevel", "ShowHelp", "IsDirectPrint", "Parameters", });
    internal_static_dictionary_Form_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_dictionary_Form_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Form_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "Description", "Help", "AccessLevel", "ClassName", });
    internal_static_dictionary_SmartBrowser_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_dictionary_SmartBrowser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_SmartBrowser_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Value", "Name", "Description", "Help", "AccessLevel", "WhereClause", "IsUpdateable", "IsDeleteable", "IsSelectedByDefault", "IsCollapsibleByDefault", "IsExecutedQueryByDefault", "IsShowTotal", "ViewUuid", "Window", "Process", "Fields", });
    internal_static_dictionary_Validation_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_dictionary_Validation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Validation_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "ValidationType", "Code", });
    internal_static_dictionary_Reference_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_dictionary_Reference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Reference_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "ValidationType", "ReferenceTable", "Values", });
    internal_static_dictionary_ReferenceValue_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_dictionary_ReferenceValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_ReferenceValue_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Value", "Name", "Description", });
    internal_static_dictionary_ReferenceTable_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_dictionary_ReferenceTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_ReferenceTable_descriptor,
        new java.lang.String[] { "Id", "Uuid", "TableName", "KeyColumnName", "DisplayColumnName", "IsDisplayIdentifier", "IsValueDisplayed", "DisplaySQL", "WhereClause", });
    internal_static_dictionary_Menu_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_dictionary_Menu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_Menu_descriptor,
        new java.lang.String[] { "Id", "Uuid", "ParentUuid", "Name", "Description", "Sequence", "IsReadOnly", "IsSummary", "IsSOTrx", "Action", "FormUuid", "WindowUuid", "ProcessUuid", "SmartBrowserUuid", "Childs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}