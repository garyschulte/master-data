/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.jivesoftware.community.cloudalytics.schemata;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Content extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6246178732910409523L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Content\",\"namespace\":\"com.jivesoftware.community.cloudalytics.schemata\",\"fields\":[{\"name\":\"subject\",\"type\":{\"type\":\"string\",\"order\":\"ignore\"}},{\"name\":\"creationDate\",\"type\":\"long\"},{\"name\":\"modificationDate\",\"type\":\"long\"},{\"name\":\"containerId\",\"type\":\"long\"},{\"name\":\"containerType\",\"type\":\"string\"},{\"name\":\"isVisibleToPartner\",\"type\":\"boolean\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"fullPath\",\"type\":\"string\"},{\"name\":\"normalizedPath\",\"type\":\"string\"},{\"name\":\"combinedObjectTypeId\",\"type\":\"string\"},{\"name\":\"contentElements\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Comment\",\"doc\":\"****** BEGIN CONTENT ACTIVITY DEFINITIONS *********\",\"fields\":[{\"name\":\"parentCommentId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"parentComment\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"Question\",\"fields\":[{\"name\":\"isQuestion\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"questionStatus\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"resolved\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"assumedResolved\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"open\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"questionCreateDate\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"resolutionDate\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"numHelpfulAnswers\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"numReplies\",\"type\":[\"null\",\"int\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"Task\",\"fields\":[{\"name\":\"completed\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"dueDate\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"owner\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Actor\",\"fields\":[{\"name\":\"class\",\"type\":{\"type\":\"string\",\"order\":\"ignore\"}},{\"name\":\"objectType\",\"type\":\"string\"},{\"name\":\"objectId\",\"type\":\"long\"},{\"name\":\"objectHash\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"isDataAvailable\",\"type\":\"boolean\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"extras\",\"type\":{\"type\":\"map\",\"values\":[\"string\",\"boolean\",\"long\"]}},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"username\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"email\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"creationDate\",\"type\":\"long\"},{\"name\":\"modificationDate\",\"type\":\"long\"},{\"name\":\"enabled\",\"type\":\"boolean\"},{\"name\":\"lastLoggedIn\",\"type\":\"long\"},{\"name\":\"lastProfileUpdate\",\"type\":\"long\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"federated\",\"type\":\"boolean\"},{\"name\":\"visible\",\"type\":\"boolean\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"url\",\"type\":\"string\"}],\"order\":\"ignore\"}],\"default\":null},{\"name\":\"parentTask\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ParentTask\",\"fields\":[{\"name\":\"class\",\"type\":{\"type\":\"string\",\"order\":\"ignore\"}},{\"name\":\"objectType\",\"type\":\"string\"},{\"name\":\"objectId\",\"type\":\"long\"},{\"name\":\"objectHash\",\"type\":\"string\"},{\"name\":\"isDataAvailable\",\"type\":\"boolean\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"extras\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"completed\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"dueDate\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"owner\",\"type\":[\"null\",\"Actor\"],\"default\":null},{\"name\":\"parentTask\",\"type\":[\"null\",\"ParentTask\"],\"default\":null}]}],\"default\":null}]},{\"type\":\"record\",\"name\":\"WallEntry\",\"fields\":[{\"name\":\"recipientIds\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"long\"}],\"default\":null},{\"name\":\"numRecipients\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"messageType\",\"type\":[\"null\",\"string\"],\"default\":null}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence subject;
  @Deprecated public long creationDate;
  @Deprecated public long modificationDate;
  @Deprecated public long containerId;
  @Deprecated public java.lang.CharSequence containerType;
  @Deprecated public boolean isVisibleToPartner;
  @Deprecated public java.lang.CharSequence status;
  @Deprecated public java.lang.CharSequence url;
  @Deprecated public java.lang.CharSequence fullPath;
  @Deprecated public java.lang.CharSequence normalizedPath;
  @Deprecated public java.lang.CharSequence combinedObjectTypeId;
  @Deprecated public java.lang.Object contentElements;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Content() {}

  /**
   * All-args constructor.
   */
  public Content(java.lang.CharSequence subject, java.lang.Long creationDate, java.lang.Long modificationDate, java.lang.Long containerId, java.lang.CharSequence containerType, java.lang.Boolean isVisibleToPartner, java.lang.CharSequence status, java.lang.CharSequence url, java.lang.CharSequence fullPath, java.lang.CharSequence normalizedPath, java.lang.CharSequence combinedObjectTypeId, java.lang.Object contentElements) {
    this.subject = subject;
    this.creationDate = creationDate;
    this.modificationDate = modificationDate;
    this.containerId = containerId;
    this.containerType = containerType;
    this.isVisibleToPartner = isVisibleToPartner;
    this.status = status;
    this.url = url;
    this.fullPath = fullPath;
    this.normalizedPath = normalizedPath;
    this.combinedObjectTypeId = combinedObjectTypeId;
    this.contentElements = contentElements;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return subject;
    case 1: return creationDate;
    case 2: return modificationDate;
    case 3: return containerId;
    case 4: return containerType;
    case 5: return isVisibleToPartner;
    case 6: return status;
    case 7: return url;
    case 8: return fullPath;
    case 9: return normalizedPath;
    case 10: return combinedObjectTypeId;
    case 11: return contentElements;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: subject = (java.lang.CharSequence)value$; break;
    case 1: creationDate = (java.lang.Long)value$; break;
    case 2: modificationDate = (java.lang.Long)value$; break;
    case 3: containerId = (java.lang.Long)value$; break;
    case 4: containerType = (java.lang.CharSequence)value$; break;
    case 5: isVisibleToPartner = (java.lang.Boolean)value$; break;
    case 6: status = (java.lang.CharSequence)value$; break;
    case 7: url = (java.lang.CharSequence)value$; break;
    case 8: fullPath = (java.lang.CharSequence)value$; break;
    case 9: normalizedPath = (java.lang.CharSequence)value$; break;
    case 10: combinedObjectTypeId = (java.lang.CharSequence)value$; break;
    case 11: contentElements = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'subject' field.
   */
  public java.lang.CharSequence getSubject() {
    return subject;
  }

  /**
   * Sets the value of the 'subject' field.
   * @param value the value to set.
   */
  public void setSubject(java.lang.CharSequence value) {
    this.subject = value;
  }

  /**
   * Gets the value of the 'creationDate' field.
   */
  public java.lang.Long getCreationDate() {
    return creationDate;
  }

  /**
   * Sets the value of the 'creationDate' field.
   * @param value the value to set.
   */
  public void setCreationDate(java.lang.Long value) {
    this.creationDate = value;
  }

  /**
   * Gets the value of the 'modificationDate' field.
   */
  public java.lang.Long getModificationDate() {
    return modificationDate;
  }

  /**
   * Sets the value of the 'modificationDate' field.
   * @param value the value to set.
   */
  public void setModificationDate(java.lang.Long value) {
    this.modificationDate = value;
  }

  /**
   * Gets the value of the 'containerId' field.
   */
  public java.lang.Long getContainerId() {
    return containerId;
  }

  /**
   * Sets the value of the 'containerId' field.
   * @param value the value to set.
   */
  public void setContainerId(java.lang.Long value) {
    this.containerId = value;
  }

  /**
   * Gets the value of the 'containerType' field.
   */
  public java.lang.CharSequence getContainerType() {
    return containerType;
  }

  /**
   * Sets the value of the 'containerType' field.
   * @param value the value to set.
   */
  public void setContainerType(java.lang.CharSequence value) {
    this.containerType = value;
  }

  /**
   * Gets the value of the 'isVisibleToPartner' field.
   */
  public java.lang.Boolean getIsVisibleToPartner() {
    return isVisibleToPartner;
  }

  /**
   * Sets the value of the 'isVisibleToPartner' field.
   * @param value the value to set.
   */
  public void setIsVisibleToPartner(java.lang.Boolean value) {
    this.isVisibleToPartner = value;
  }

  /**
   * Gets the value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'fullPath' field.
   */
  public java.lang.CharSequence getFullPath() {
    return fullPath;
  }

  /**
   * Sets the value of the 'fullPath' field.
   * @param value the value to set.
   */
  public void setFullPath(java.lang.CharSequence value) {
    this.fullPath = value;
  }

  /**
   * Gets the value of the 'normalizedPath' field.
   */
  public java.lang.CharSequence getNormalizedPath() {
    return normalizedPath;
  }

  /**
   * Sets the value of the 'normalizedPath' field.
   * @param value the value to set.
   */
  public void setNormalizedPath(java.lang.CharSequence value) {
    this.normalizedPath = value;
  }

  /**
   * Gets the value of the 'combinedObjectTypeId' field.
   */
  public java.lang.CharSequence getCombinedObjectTypeId() {
    return combinedObjectTypeId;
  }

  /**
   * Sets the value of the 'combinedObjectTypeId' field.
   * @param value the value to set.
   */
  public void setCombinedObjectTypeId(java.lang.CharSequence value) {
    this.combinedObjectTypeId = value;
  }

  /**
   * Gets the value of the 'contentElements' field.
   */
  public java.lang.Object getContentElements() {
    return contentElements;
  }

  /**
   * Sets the value of the 'contentElements' field.
   * @param value the value to set.
   */
  public void setContentElements(java.lang.Object value) {
    this.contentElements = value;
  }

  /**
   * Creates a new Content RecordBuilder.
   * @return A new Content RecordBuilder
   */
  public static com.jivesoftware.community.cloudalytics.schemata.Content.Builder newBuilder() {
    return new com.jivesoftware.community.cloudalytics.schemata.Content.Builder();
  }
  
  /**
   * Creates a new Content RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Content RecordBuilder
   */
  public static com.jivesoftware.community.cloudalytics.schemata.Content.Builder newBuilder(com.jivesoftware.community.cloudalytics.schemata.Content.Builder other) {
    return new com.jivesoftware.community.cloudalytics.schemata.Content.Builder(other);
  }
  
  /**
   * Creates a new Content RecordBuilder by copying an existing Content instance.
   * @param other The existing instance to copy.
   * @return A new Content RecordBuilder
   */
  public static com.jivesoftware.community.cloudalytics.schemata.Content.Builder newBuilder(com.jivesoftware.community.cloudalytics.schemata.Content other) {
    return new com.jivesoftware.community.cloudalytics.schemata.Content.Builder(other);
  }
  
  /**
   * RecordBuilder for Content instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Content>
    implements org.apache.avro.data.RecordBuilder<Content> {

    private java.lang.CharSequence subject;
    private long creationDate;
    private long modificationDate;
    private long containerId;
    private java.lang.CharSequence containerType;
    private boolean isVisibleToPartner;
    private java.lang.CharSequence status;
    private java.lang.CharSequence url;
    private java.lang.CharSequence fullPath;
    private java.lang.CharSequence normalizedPath;
    private java.lang.CharSequence combinedObjectTypeId;
    private java.lang.Object contentElements;

    /** Creates a new Builder */
    private Builder() {
      super(com.jivesoftware.community.cloudalytics.schemata.Content.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.jivesoftware.community.cloudalytics.schemata.Content.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.subject)) {
        this.subject = data().deepCopy(fields()[0].schema(), other.subject);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.creationDate)) {
        this.creationDate = data().deepCopy(fields()[1].schema(), other.creationDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.modificationDate)) {
        this.modificationDate = data().deepCopy(fields()[2].schema(), other.modificationDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.containerId)) {
        this.containerId = data().deepCopy(fields()[3].schema(), other.containerId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.containerType)) {
        this.containerType = data().deepCopy(fields()[4].schema(), other.containerType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isVisibleToPartner)) {
        this.isVisibleToPartner = data().deepCopy(fields()[5].schema(), other.isVisibleToPartner);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.url)) {
        this.url = data().deepCopy(fields()[7].schema(), other.url);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.fullPath)) {
        this.fullPath = data().deepCopy(fields()[8].schema(), other.fullPath);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.normalizedPath)) {
        this.normalizedPath = data().deepCopy(fields()[9].schema(), other.normalizedPath);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.combinedObjectTypeId)) {
        this.combinedObjectTypeId = data().deepCopy(fields()[10].schema(), other.combinedObjectTypeId);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.contentElements)) {
        this.contentElements = data().deepCopy(fields()[11].schema(), other.contentElements);
        fieldSetFlags()[11] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing Content instance
     * @param other The existing instance to copy.
     */
    private Builder(com.jivesoftware.community.cloudalytics.schemata.Content other) {
            super(com.jivesoftware.community.cloudalytics.schemata.Content.SCHEMA$);
      if (isValidValue(fields()[0], other.subject)) {
        this.subject = data().deepCopy(fields()[0].schema(), other.subject);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.creationDate)) {
        this.creationDate = data().deepCopy(fields()[1].schema(), other.creationDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.modificationDate)) {
        this.modificationDate = data().deepCopy(fields()[2].schema(), other.modificationDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.containerId)) {
        this.containerId = data().deepCopy(fields()[3].schema(), other.containerId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.containerType)) {
        this.containerType = data().deepCopy(fields()[4].schema(), other.containerType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isVisibleToPartner)) {
        this.isVisibleToPartner = data().deepCopy(fields()[5].schema(), other.isVisibleToPartner);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.url)) {
        this.url = data().deepCopy(fields()[7].schema(), other.url);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.fullPath)) {
        this.fullPath = data().deepCopy(fields()[8].schema(), other.fullPath);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.normalizedPath)) {
        this.normalizedPath = data().deepCopy(fields()[9].schema(), other.normalizedPath);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.combinedObjectTypeId)) {
        this.combinedObjectTypeId = data().deepCopy(fields()[10].schema(), other.combinedObjectTypeId);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.contentElements)) {
        this.contentElements = data().deepCopy(fields()[11].schema(), other.contentElements);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'subject' field.
      * @return The value.
      */
    public java.lang.CharSequence getSubject() {
      return subject;
    }

    /**
      * Sets the value of the 'subject' field.
      * @param value The value of 'subject'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setSubject(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.subject = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'subject' field has been set.
      * @return True if the 'subject' field has been set, false otherwise.
      */
    public boolean hasSubject() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'subject' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearSubject() {
      subject = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'creationDate' field.
      * @return The value.
      */
    public java.lang.Long getCreationDate() {
      return creationDate;
    }

    /**
      * Sets the value of the 'creationDate' field.
      * @param value The value of 'creationDate'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setCreationDate(long value) {
      validate(fields()[1], value);
      this.creationDate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'creationDate' field has been set.
      * @return True if the 'creationDate' field has been set, false otherwise.
      */
    public boolean hasCreationDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'creationDate' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearCreationDate() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'modificationDate' field.
      * @return The value.
      */
    public java.lang.Long getModificationDate() {
      return modificationDate;
    }

    /**
      * Sets the value of the 'modificationDate' field.
      * @param value The value of 'modificationDate'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setModificationDate(long value) {
      validate(fields()[2], value);
      this.modificationDate = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'modificationDate' field has been set.
      * @return True if the 'modificationDate' field has been set, false otherwise.
      */
    public boolean hasModificationDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'modificationDate' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearModificationDate() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'containerId' field.
      * @return The value.
      */
    public java.lang.Long getContainerId() {
      return containerId;
    }

    /**
      * Sets the value of the 'containerId' field.
      * @param value The value of 'containerId'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setContainerId(long value) {
      validate(fields()[3], value);
      this.containerId = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'containerId' field has been set.
      * @return True if the 'containerId' field has been set, false otherwise.
      */
    public boolean hasContainerId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'containerId' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearContainerId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'containerType' field.
      * @return The value.
      */
    public java.lang.CharSequence getContainerType() {
      return containerType;
    }

    /**
      * Sets the value of the 'containerType' field.
      * @param value The value of 'containerType'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setContainerType(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.containerType = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'containerType' field has been set.
      * @return True if the 'containerType' field has been set, false otherwise.
      */
    public boolean hasContainerType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'containerType' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearContainerType() {
      containerType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'isVisibleToPartner' field.
      * @return The value.
      */
    public java.lang.Boolean getIsVisibleToPartner() {
      return isVisibleToPartner;
    }

    /**
      * Sets the value of the 'isVisibleToPartner' field.
      * @param value The value of 'isVisibleToPartner'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setIsVisibleToPartner(boolean value) {
      validate(fields()[5], value);
      this.isVisibleToPartner = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'isVisibleToPartner' field has been set.
      * @return True if the 'isVisibleToPartner' field has been set, false otherwise.
      */
    public boolean hasIsVisibleToPartner() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'isVisibleToPartner' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearIsVisibleToPartner() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.status = value;
      fieldSetFlags()[6] = true;
      return this; 
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearStatus() {
      status = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public java.lang.CharSequence getUrl() {
      return url;
    }

    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.url = value;
      fieldSetFlags()[7] = true;
      return this; 
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearUrl() {
      url = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'fullPath' field.
      * @return The value.
      */
    public java.lang.CharSequence getFullPath() {
      return fullPath;
    }

    /**
      * Sets the value of the 'fullPath' field.
      * @param value The value of 'fullPath'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setFullPath(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.fullPath = value;
      fieldSetFlags()[8] = true;
      return this; 
    }

    /**
      * Checks whether the 'fullPath' field has been set.
      * @return True if the 'fullPath' field has been set, false otherwise.
      */
    public boolean hasFullPath() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'fullPath' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearFullPath() {
      fullPath = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'normalizedPath' field.
      * @return The value.
      */
    public java.lang.CharSequence getNormalizedPath() {
      return normalizedPath;
    }

    /**
      * Sets the value of the 'normalizedPath' field.
      * @param value The value of 'normalizedPath'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setNormalizedPath(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.normalizedPath = value;
      fieldSetFlags()[9] = true;
      return this; 
    }

    /**
      * Checks whether the 'normalizedPath' field has been set.
      * @return True if the 'normalizedPath' field has been set, false otherwise.
      */
    public boolean hasNormalizedPath() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'normalizedPath' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearNormalizedPath() {
      normalizedPath = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'combinedObjectTypeId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCombinedObjectTypeId() {
      return combinedObjectTypeId;
    }

    /**
      * Sets the value of the 'combinedObjectTypeId' field.
      * @param value The value of 'combinedObjectTypeId'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setCombinedObjectTypeId(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.combinedObjectTypeId = value;
      fieldSetFlags()[10] = true;
      return this; 
    }

    /**
      * Checks whether the 'combinedObjectTypeId' field has been set.
      * @return True if the 'combinedObjectTypeId' field has been set, false otherwise.
      */
    public boolean hasCombinedObjectTypeId() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'combinedObjectTypeId' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearCombinedObjectTypeId() {
      combinedObjectTypeId = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'contentElements' field.
      * @return The value.
      */
    public java.lang.Object getContentElements() {
      return contentElements;
    }

    /**
      * Sets the value of the 'contentElements' field.
      * @param value The value of 'contentElements'.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder setContentElements(java.lang.Object value) {
      validate(fields()[11], value);
      this.contentElements = value;
      fieldSetFlags()[11] = true;
      return this; 
    }

    /**
      * Checks whether the 'contentElements' field has been set.
      * @return True if the 'contentElements' field has been set, false otherwise.
      */
    public boolean hasContentElements() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'contentElements' field.
      * @return This builder.
      */
    public com.jivesoftware.community.cloudalytics.schemata.Content.Builder clearContentElements() {
      contentElements = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public Content build() {
      try {
        Content record = new Content();
        record.subject = fieldSetFlags()[0] ? this.subject : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.creationDate = fieldSetFlags()[1] ? this.creationDate : (java.lang.Long) defaultValue(fields()[1]);
        record.modificationDate = fieldSetFlags()[2] ? this.modificationDate : (java.lang.Long) defaultValue(fields()[2]);
        record.containerId = fieldSetFlags()[3] ? this.containerId : (java.lang.Long) defaultValue(fields()[3]);
        record.containerType = fieldSetFlags()[4] ? this.containerType : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.isVisibleToPartner = fieldSetFlags()[5] ? this.isVisibleToPartner : (java.lang.Boolean) defaultValue(fields()[5]);
        record.status = fieldSetFlags()[6] ? this.status : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.url = fieldSetFlags()[7] ? this.url : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.fullPath = fieldSetFlags()[8] ? this.fullPath : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.normalizedPath = fieldSetFlags()[9] ? this.normalizedPath : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.combinedObjectTypeId = fieldSetFlags()[10] ? this.combinedObjectTypeId : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.contentElements = fieldSetFlags()[11] ? this.contentElements : (java.lang.Object) defaultValue(fields()[11]);
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