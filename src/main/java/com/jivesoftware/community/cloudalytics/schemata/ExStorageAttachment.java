/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.jivesoftware.community.cloudalytics.schemata;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ExStorageAttachment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8812169303530089088L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ExStorageAttachment\",\"namespace\":\"com.jivesoftware.community.cloudalytics.schemata\",\"fields\":[{\"name\":\"definitionObjectType\",\"type\":{\"type\":\"string\",\"order\":\"ignore\"}},{\"name\":\"definitionObjectId\",\"type\":\"long\"},{\"name\":\"definitionName\",\"type\":\"string\"},{\"name\":\"extensionUUID\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence definitionObjectType;
  @Deprecated public long definitionObjectId;
  @Deprecated public java.lang.CharSequence definitionName;
  @Deprecated public java.lang.CharSequence extensionUUID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ExStorageAttachment() {}

  /**
   * All-args constructor.
   */
  public ExStorageAttachment(java.lang.CharSequence definitionObjectType, java.lang.Long definitionObjectId, java.lang.CharSequence definitionName, java.lang.CharSequence extensionUUID) {
    this.definitionObjectType = definitionObjectType;
    this.definitionObjectId = definitionObjectId;
    this.definitionName = definitionName;
    this.extensionUUID = extensionUUID;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return definitionObjectType;
    case 1: return definitionObjectId;
    case 2: return definitionName;
    case 3: return extensionUUID;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: definitionObjectType = (java.lang.CharSequence)value$; break;
    case 1: definitionObjectId = (java.lang.Long)value$; break;
    case 2: definitionName = (java.lang.CharSequence)value$; break;
    case 3: extensionUUID = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'definitionObjectType' field.
   */
  public java.lang.CharSequence getDefinitionObjectType() {
    return definitionObjectType;
  }

  /**
   * Sets the value of the 'definitionObjectType' field.
   * @param value the value to set.
   */
  public void setDefinitionObjectType(java.lang.CharSequence value) {
    this.definitionObjectType = value;
  }

  /**
   * Gets the value of the 'definitionObjectId' field.
   */
  public java.lang.Long getDefinitionObjectId() {
    return definitionObjectId;
  }

  /**
   * Sets the value of the 'definitionObjectId' field.
   * @param value the value to set.
   */
  public void setDefinitionObjectId(java.lang.Long value) {
    this.definitionObjectId = value;
  }

  /**
   * Gets the value of the 'definitionName' field.
   */
  public java.lang.CharSequence getDefinitionName() {
    return definitionName;
  }

  /**
   * Sets the value of the 'definitionName' field.
   * @param value the value to set.
   */
  public void setDefinitionName(java.lang.CharSequence value) {
    this.definitionName = value;
  }

  /**
   * Gets the value of the 'extensionUUID' field.
   */
  public java.lang.CharSequence getExtensionUUID() {
    return extensionUUID;
  }

  /**
   * Sets the value of the 'extensionUUID' field.
   * @param value the value to set.
   */
  public void setExtensionUUID(java.lang.CharSequence value) {
    this.extensionUUID = value;
  }

  /**
   * Creates a new ExStorageAttachment RecordBuilder.
   * @return A new ExStorageAttachment RecordBuilder
   */
  public static com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder newBuilder() {
    return new com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder();
  }
  
  /**
   * Creates a new ExStorageAttachment RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ExStorageAttachment RecordBuilder
   */
  public static com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder newBuilder(com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder other) {
    return new com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder(other);
  }
  
  /**
   * Creates a new ExStorageAttachment RecordBuilder by copying an existing ExStorageAttachment instance.
   * @param other The existing instance to copy.
   * @return A new ExStorageAttachment RecordBuilder
   */
  public static com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder newBuilder(com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment other) {
    return new com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder(other);
  }
  
  /**
   * RecordBuilder for ExStorageAttachment instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ExStorageAttachment>
    implements org.apache.avro.data.RecordBuilder<ExStorageAttachment> {

    private java.lang.CharSequence definitionObjectType;
    private long definitionObjectId;
    private java.lang.CharSequence definitionName;
    private java.lang.CharSequence extensionUUID;

    /** Creates a new Builder */
    private Builder() {
      super(com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.definitionObjectType)) {
        this.definitionObjectType = data().deepCopy(fields()[0].schema(), other.definitionObjectType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.definitionObjectId)) {
        this.definitionObjectId = data().deepCopy(fields()[1].schema(), other.definitionObjectId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.definitionName)) {
        this.definitionName = data().deepCopy(fields()[2].schema(), other.definitionName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.extensionUUID)) {
        this.extensionUUID = data().deepCopy(fields()[3].schema(), other.extensionUUID);
        fieldSetFlags()[3] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing ExStorageAttachment instance
     * @param other The existing instance to copy.
     */
    private Builder(com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment other) {
            super(com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.SCHEMA$);
      if (isValidValue(fields()[0], other.definitionObjectType)) {
        this.definitionObjectType = data().deepCopy(fields()[0].schema(), other.definitionObjectType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.definitionObjectId)) {
        this.definitionObjectId = data().deepCopy(fields()[1].schema(), other.definitionObjectId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.definitionName)) {
        this.definitionName = data().deepCopy(fields()[2].schema(), other.definitionName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.extensionUUID)) {
        this.extensionUUID = data().deepCopy(fields()[3].schema(), other.extensionUUID);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'definitionObjectType' field.
      * @return The value.
      */
    public java.lang.CharSequence getDefinitionObjectType() {
      return definitionObjectType;
    }

    /**
      * Sets the value of the 'definitionObjectType' field.
      * @param value The value of 'definitionObjectType'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder setDefinitionObjectType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.definitionObjectType = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'definitionObjectType' field has been set.
      * @return True if the 'definitionObjectType' field has been set, false otherwise.
      */
    public boolean hasDefinitionObjectType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'definitionObjectType' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder clearDefinitionObjectType() {
      definitionObjectType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'definitionObjectId' field.
      * @return The value.
      */
    public java.lang.Long getDefinitionObjectId() {
      return definitionObjectId;
    }

    /**
      * Sets the value of the 'definitionObjectId' field.
      * @param value The value of 'definitionObjectId'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder setDefinitionObjectId(long value) {
      validate(fields()[1], value);
      this.definitionObjectId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'definitionObjectId' field has been set.
      * @return True if the 'definitionObjectId' field has been set, false otherwise.
      */
    public boolean hasDefinitionObjectId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'definitionObjectId' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder clearDefinitionObjectId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'definitionName' field.
      * @return The value.
      */
    public java.lang.CharSequence getDefinitionName() {
      return definitionName;
    }

    /**
      * Sets the value of the 'definitionName' field.
      * @param value The value of 'definitionName'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder setDefinitionName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.definitionName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'definitionName' field has been set.
      * @return True if the 'definitionName' field has been set, false otherwise.
      */
    public boolean hasDefinitionName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'definitionName' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder clearDefinitionName() {
      definitionName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'extensionUUID' field.
      * @return The value.
      */
    public java.lang.CharSequence getExtensionUUID() {
      return extensionUUID;
    }

    /**
      * Sets the value of the 'extensionUUID' field.
      * @param value The value of 'extensionUUID'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder setExtensionUUID(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.extensionUUID = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'extensionUUID' field has been set.
      * @return True if the 'extensionUUID' field has been set, false otherwise.
      */
    public boolean hasExtensionUUID() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'extensionUUID' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.ExStorageAttachment.Builder clearExtensionUUID() {
      extensionUUID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public ExStorageAttachment build() {
      try {
        ExStorageAttachment record = new ExStorageAttachment();
        record.definitionObjectType = fieldSetFlags()[0] ? this.definitionObjectType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.definitionObjectId = fieldSetFlags()[1] ? this.definitionObjectId : (java.lang.Long) defaultValue(fields()[1]);
        record.definitionName = fieldSetFlags()[2] ? this.definitionName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.extensionUUID = fieldSetFlags()[3] ? this.extensionUUID : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}