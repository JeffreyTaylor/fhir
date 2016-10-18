package org.hl7.fhir.dstu3.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Oct 18, 2016 15:43+1100 for FHIR v1.7.0

import java.util.*;

import java.math.*;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.dstu3.model.Enumerations.*;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.exceptions.FHIRException;
/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
@ResourceDef(name="Claim", profile="http://hl7.org/fhir/Profile/Claim")
public class Claim extends DomainResource {

    public enum ClaimStatus {
        /**
         * The resource instance is currently in-force.
         */
        ACTIVE, 
        /**
         * The resource instance is withdrawn, rescinded or reversed.
         */
        CANCELLED, 
        /**
         * A new resource instance the contents of which is not complete.
         */
        DRAFT, 
        /**
         * The resource instance was entered in error.
         */
        ENTEREDINERROR, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static ClaimStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown ClaimStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ACTIVE: return "active";
            case CANCELLED: return "cancelled";
            case DRAFT: return "draft";
            case ENTEREDINERROR: return "entered-in-error";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACTIVE: return "http://hl7.org/fhir/claim-status";
            case CANCELLED: return "http://hl7.org/fhir/claim-status";
            case DRAFT: return "http://hl7.org/fhir/claim-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/claim-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACTIVE: return "The resource instance is currently in-force.";
            case CANCELLED: return "The resource instance is withdrawn, rescinded or reversed.";
            case DRAFT: return "A new resource instance the contents of which is not complete.";
            case ENTEREDINERROR: return "The resource instance was entered in error.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACTIVE: return "Active";
            case CANCELLED: return "Cancelled";
            case DRAFT: return "Draft";
            case ENTEREDINERROR: return "Entered In Error";
            default: return "?";
          }
        }
    }

  public static class ClaimStatusEnumFactory implements EnumFactory<ClaimStatus> {
    public ClaimStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ClaimStatus.ACTIVE;
        if ("cancelled".equals(codeString))
          return ClaimStatus.CANCELLED;
        if ("draft".equals(codeString))
          return ClaimStatus.DRAFT;
        if ("entered-in-error".equals(codeString))
          return ClaimStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown ClaimStatus code '"+codeString+"'");
        }
        public Enumeration<ClaimStatus> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
          return new Enumeration<ClaimStatus>(this, ClaimStatus.ACTIVE);
        if ("cancelled".equals(codeString))
          return new Enumeration<ClaimStatus>(this, ClaimStatus.CANCELLED);
        if ("draft".equals(codeString))
          return new Enumeration<ClaimStatus>(this, ClaimStatus.DRAFT);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<ClaimStatus>(this, ClaimStatus.ENTEREDINERROR);
        throw new FHIRException("Unknown ClaimStatus code '"+codeString+"'");
        }
    public String toCode(ClaimStatus code) {
      if (code == ClaimStatus.ACTIVE)
        return "active";
      if (code == ClaimStatus.CANCELLED)
        return "cancelled";
      if (code == ClaimStatus.DRAFT)
        return "draft";
      if (code == ClaimStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
      }
    public String toSystem(ClaimStatus code) {
      return code.getSystem();
      }
    }

    public enum Use {
        /**
         * The treatment is complete and this represents a Claim for the services.
         */
        COMPLETE, 
        /**
         * The treatment is proposed and this represents a Pre-authorization for the services.
         */
        PROPOSED, 
        /**
         * The treatment is proposed and this represents a Pre-determination for the services.
         */
        EXPLORATORY, 
        /**
         * A locally defined or otherwise resolved status.
         */
        OTHER, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static Use fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("proposed".equals(codeString))
          return PROPOSED;
        if ("exploratory".equals(codeString))
          return EXPLORATORY;
        if ("other".equals(codeString))
          return OTHER;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown Use code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case COMPLETE: return "complete";
            case PROPOSED: return "proposed";
            case EXPLORATORY: return "exploratory";
            case OTHER: return "other";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case COMPLETE: return "http://hl7.org/fhir/claim-use";
            case PROPOSED: return "http://hl7.org/fhir/claim-use";
            case EXPLORATORY: return "http://hl7.org/fhir/claim-use";
            case OTHER: return "http://hl7.org/fhir/claim-use";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case COMPLETE: return "The treatment is complete and this represents a Claim for the services.";
            case PROPOSED: return "The treatment is proposed and this represents a Pre-authorization for the services.";
            case EXPLORATORY: return "The treatment is proposed and this represents a Pre-determination for the services.";
            case OTHER: return "A locally defined or otherwise resolved status.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case COMPLETE: return "Complete";
            case PROPOSED: return "Proposed";
            case EXPLORATORY: return "Exploratory";
            case OTHER: return "Other";
            default: return "?";
          }
        }
    }

  public static class UseEnumFactory implements EnumFactory<Use> {
    public Use fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return Use.COMPLETE;
        if ("proposed".equals(codeString))
          return Use.PROPOSED;
        if ("exploratory".equals(codeString))
          return Use.EXPLORATORY;
        if ("other".equals(codeString))
          return Use.OTHER;
        throw new IllegalArgumentException("Unknown Use code '"+codeString+"'");
        }
        public Enumeration<Use> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("complete".equals(codeString))
          return new Enumeration<Use>(this, Use.COMPLETE);
        if ("proposed".equals(codeString))
          return new Enumeration<Use>(this, Use.PROPOSED);
        if ("exploratory".equals(codeString))
          return new Enumeration<Use>(this, Use.EXPLORATORY);
        if ("other".equals(codeString))
          return new Enumeration<Use>(this, Use.OTHER);
        throw new FHIRException("Unknown Use code '"+codeString+"'");
        }
    public String toCode(Use code) {
      if (code == Use.COMPLETE)
        return "complete";
      if (code == Use.PROPOSED)
        return "proposed";
      if (code == Use.EXPLORATORY)
        return "exploratory";
      if (code == Use.OTHER)
        return "other";
      return "?";
      }
    public String toSystem(Use code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class RelatedClaimComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Other claims which are related to this claim such as prior claim versions or for related services.
         */
        @Child(name = "claim", type = {Claim.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Reference to the related claim", formalDefinition="Other claims which are related to this claim such as prior claim versions or for related services." )
        protected Reference claim;

        /**
         * The actual object that is the target of the reference (Other claims which are related to this claim such as prior claim versions or for related services.)
         */
        protected Claim claimTarget;

        /**
         * For example prior or umbrella.
         */
        @Child(name = "relationship", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="How the reference claim is related", formalDefinition="For example prior or umbrella." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/related-claim-relationship")
        protected Coding relationship;

        /**
         * An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .
         */
        @Child(name = "reference", type = {Identifier.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Related file or case reference", formalDefinition="An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # ." )
        protected Identifier reference;

        private static final long serialVersionUID = -515151214L;

    /**
     * Constructor
     */
      public RelatedClaimComponent() {
        super();
      }

        /**
         * @return {@link #claim} (Other claims which are related to this claim such as prior claim versions or for related services.)
         */
        public Reference getClaim() { 
          if (this.claim == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RelatedClaimComponent.claim");
            else if (Configuration.doAutoCreate())
              this.claim = new Reference(); // cc
          return this.claim;
        }

        public boolean hasClaim() { 
          return this.claim != null && !this.claim.isEmpty();
        }

        /**
         * @param value {@link #claim} (Other claims which are related to this claim such as prior claim versions or for related services.)
         */
        public RelatedClaimComponent setClaim(Reference value) { 
          this.claim = value;
          return this;
        }

        /**
         * @return {@link #claim} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Other claims which are related to this claim such as prior claim versions or for related services.)
         */
        public Claim getClaimTarget() { 
          if (this.claimTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RelatedClaimComponent.claim");
            else if (Configuration.doAutoCreate())
              this.claimTarget = new Claim(); // aa
          return this.claimTarget;
        }

        /**
         * @param value {@link #claim} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Other claims which are related to this claim such as prior claim versions or for related services.)
         */
        public RelatedClaimComponent setClaimTarget(Claim value) { 
          this.claimTarget = value;
          return this;
        }

        /**
         * @return {@link #relationship} (For example prior or umbrella.)
         */
        public Coding getRelationship() { 
          if (this.relationship == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RelatedClaimComponent.relationship");
            else if (Configuration.doAutoCreate())
              this.relationship = new Coding(); // cc
          return this.relationship;
        }

        public boolean hasRelationship() { 
          return this.relationship != null && !this.relationship.isEmpty();
        }

        /**
         * @param value {@link #relationship} (For example prior or umbrella.)
         */
        public RelatedClaimComponent setRelationship(Coding value) { 
          this.relationship = value;
          return this;
        }

        /**
         * @return {@link #reference} (An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .)
         */
        public Identifier getReference() { 
          if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create RelatedClaimComponent.reference");
            else if (Configuration.doAutoCreate())
              this.reference = new Identifier(); // cc
          return this.reference;
        }

        public boolean hasReference() { 
          return this.reference != null && !this.reference.isEmpty();
        }

        /**
         * @param value {@link #reference} (An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .)
         */
        public RelatedClaimComponent setReference(Identifier value) { 
          this.reference = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("claim", "Reference(Claim)", "Other claims which are related to this claim such as prior claim versions or for related services.", 0, java.lang.Integer.MAX_VALUE, claim));
          childrenList.add(new Property("relationship", "Coding", "For example prior or umbrella.", 0, java.lang.Integer.MAX_VALUE, relationship));
          childrenList.add(new Property("reference", "Identifier", "An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .", 0, java.lang.Integer.MAX_VALUE, reference));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 94742588: /*claim*/ return this.claim == null ? new Base[0] : new Base[] {this.claim}; // Reference
        case -261851592: /*relationship*/ return this.relationship == null ? new Base[0] : new Base[] {this.relationship}; // Coding
        case -925155509: /*reference*/ return this.reference == null ? new Base[0] : new Base[] {this.reference}; // Identifier
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 94742588: // claim
          this.claim = castToReference(value); // Reference
          break;
        case -261851592: // relationship
          this.relationship = castToCoding(value); // Coding
          break;
        case -925155509: // reference
          this.reference = castToIdentifier(value); // Identifier
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("claim"))
          this.claim = castToReference(value); // Reference
        else if (name.equals("relationship"))
          this.relationship = castToCoding(value); // Coding
        else if (name.equals("reference"))
          this.reference = castToIdentifier(value); // Identifier
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 94742588:  return getClaim(); // Reference
        case -261851592:  return getRelationship(); // Coding
        case -925155509:  return getReference(); // Identifier
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("claim")) {
          this.claim = new Reference();
          return this.claim;
        }
        else if (name.equals("relationship")) {
          this.relationship = new Coding();
          return this.relationship;
        }
        else if (name.equals("reference")) {
          this.reference = new Identifier();
          return this.reference;
        }
        else
          return super.addChild(name);
      }

      public RelatedClaimComponent copy() {
        RelatedClaimComponent dst = new RelatedClaimComponent();
        copyValues(dst);
        dst.claim = claim == null ? null : claim.copy();
        dst.relationship = relationship == null ? null : relationship.copy();
        dst.reference = reference == null ? null : reference.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof RelatedClaimComponent))
          return false;
        RelatedClaimComponent o = (RelatedClaimComponent) other;
        return compareDeep(claim, o.claim, true) && compareDeep(relationship, o.relationship, true) && compareDeep(reference, o.reference, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof RelatedClaimComponent))
          return false;
        RelatedClaimComponent o = (RelatedClaimComponent) other;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(claim, relationship, reference
          );
      }

  public String fhirType() {
    return "Claim.related";

  }

  }

    @Block()
    public static class PayeeComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Type of Party to be reimbursed: Subscriber, provider, other.
         */
        @Child(name = "type", type = {Coding.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of party: Subscriber, Provider, other", formalDefinition="Type of Party to be reimbursed: Subscriber, provider, other." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/payeetype")
        protected Coding type;

        /**
         * organization | patient | practitioner | relatedperson.
         */
        @Child(name = "resourceType", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="organization | patient | practitioner | relatedperson", formalDefinition="organization | patient | practitioner | relatedperson." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-payee-resource-type")
        protected Coding resourceType;

        /**
         * Party to be reimbursed: Subscriber, provider, other.
         */
        @Child(name = "party", type = {Practitioner.class, Organization.class, Patient.class, RelatedPerson.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Party to receive the payable", formalDefinition="Party to be reimbursed: Subscriber, provider, other." )
        protected Reference party;

        /**
         * The actual object that is the target of the reference (Party to be reimbursed: Subscriber, provider, other.)
         */
        protected Resource partyTarget;

        private static final long serialVersionUID = 140598850L;

    /**
     * Constructor
     */
      public PayeeComponent() {
        super();
      }

    /**
     * Constructor
     */
      public PayeeComponent(Coding type) {
        super();
        this.type = type;
      }

        /**
         * @return {@link #type} (Type of Party to be reimbursed: Subscriber, provider, other.)
         */
        public Coding getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PayeeComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Coding(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of Party to be reimbursed: Subscriber, provider, other.)
         */
        public PayeeComponent setType(Coding value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #resourceType} (organization | patient | practitioner | relatedperson.)
         */
        public Coding getResourceType() { 
          if (this.resourceType == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PayeeComponent.resourceType");
            else if (Configuration.doAutoCreate())
              this.resourceType = new Coding(); // cc
          return this.resourceType;
        }

        public boolean hasResourceType() { 
          return this.resourceType != null && !this.resourceType.isEmpty();
        }

        /**
         * @param value {@link #resourceType} (organization | patient | practitioner | relatedperson.)
         */
        public PayeeComponent setResourceType(Coding value) { 
          this.resourceType = value;
          return this;
        }

        /**
         * @return {@link #party} (Party to be reimbursed: Subscriber, provider, other.)
         */
        public Reference getParty() { 
          if (this.party == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PayeeComponent.party");
            else if (Configuration.doAutoCreate())
              this.party = new Reference(); // cc
          return this.party;
        }

        public boolean hasParty() { 
          return this.party != null && !this.party.isEmpty();
        }

        /**
         * @param value {@link #party} (Party to be reimbursed: Subscriber, provider, other.)
         */
        public PayeeComponent setParty(Reference value) { 
          this.party = value;
          return this;
        }

        /**
         * @return {@link #party} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Party to be reimbursed: Subscriber, provider, other.)
         */
        public Resource getPartyTarget() { 
          return this.partyTarget;
        }

        /**
         * @param value {@link #party} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Party to be reimbursed: Subscriber, provider, other.)
         */
        public PayeeComponent setPartyTarget(Resource value) { 
          this.partyTarget = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("type", "Coding", "Type of Party to be reimbursed: Subscriber, provider, other.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("resourceType", "Coding", "organization | patient | practitioner | relatedperson.", 0, java.lang.Integer.MAX_VALUE, resourceType));
          childrenList.add(new Property("party", "Reference(Practitioner|Organization|Patient|RelatedPerson)", "Party to be reimbursed: Subscriber, provider, other.", 0, java.lang.Integer.MAX_VALUE, party));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Coding
        case -384364440: /*resourceType*/ return this.resourceType == null ? new Base[0] : new Base[] {this.resourceType}; // Coding
        case 106437350: /*party*/ return this.party == null ? new Base[0] : new Base[] {this.party}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = castToCoding(value); // Coding
          break;
        case -384364440: // resourceType
          this.resourceType = castToCoding(value); // Coding
          break;
        case 106437350: // party
          this.party = castToReference(value); // Reference
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type"))
          this.type = castToCoding(value); // Coding
        else if (name.equals("resourceType"))
          this.resourceType = castToCoding(value); // Coding
        else if (name.equals("party"))
          this.party = castToReference(value); // Reference
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType(); // Coding
        case -384364440:  return getResourceType(); // Coding
        case 106437350:  return getParty(); // Reference
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new Coding();
          return this.type;
        }
        else if (name.equals("resourceType")) {
          this.resourceType = new Coding();
          return this.resourceType;
        }
        else if (name.equals("party")) {
          this.party = new Reference();
          return this.party;
        }
        else
          return super.addChild(name);
      }

      public PayeeComponent copy() {
        PayeeComponent dst = new PayeeComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.resourceType = resourceType == null ? null : resourceType.copy();
        dst.party = party == null ? null : party.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof PayeeComponent))
          return false;
        PayeeComponent o = (PayeeComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(resourceType, o.resourceType, true) && compareDeep(party, o.party, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof PayeeComponent))
          return false;
        PayeeComponent o = (PayeeComponent) other;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, resourceType, party
          );
      }

  public String fhirType() {
    return "Claim.payee";

  }

  }

    @Block()
    public static class SpecialConditionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The general class of the information supplied: information; exception; accident, employment; onset, etc.
         */
        @Child(name = "category", type = {Coding.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Category of information", formalDefinition="The general class of the information supplied: information; exception; accident, employment; onset, etc." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-informationcategory")
        protected Coding category;

        /**
         * System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication.
         */
        @Child(name = "code", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of information", formalDefinition="System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-exception")
        protected Coding code;

        /**
         * The date when or period to which this information refers.
         */
        @Child(name = "timing", type = {DateType.class, Period.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="When it occurred", formalDefinition="The date when or period to which this information refers." )
        protected Type timing;

        /**
         * Additional data.
         */
        @Child(name = "value", type = {StringType.class, Quantity.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Additional Data", formalDefinition="Additional data." )
        protected Type value;

        private static final long serialVersionUID = 1771573412L;

    /**
     * Constructor
     */
      public SpecialConditionComponent() {
        super();
      }

    /**
     * Constructor
     */
      public SpecialConditionComponent(Coding category) {
        super();
        this.category = category;
      }

        /**
         * @return {@link #category} (The general class of the information supplied: information; exception; accident, employment; onset, etc.)
         */
        public Coding getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SpecialConditionComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new Coding(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (The general class of the information supplied: information; exception; accident, employment; onset, etc.)
         */
        public SpecialConditionComponent setCategory(Coding value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #code} (System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication.)
         */
        public Coding getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SpecialConditionComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new Coding(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication.)
         */
        public SpecialConditionComponent setCode(Coding value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #timing} (The date when or period to which this information refers.)
         */
        public Type getTiming() { 
          return this.timing;
        }

        /**
         * @return {@link #timing} (The date when or period to which this information refers.)
         */
        public DateType getTimingDateType() throws FHIRException { 
          if (!(this.timing instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but "+this.timing.getClass().getName()+" was encountered");
          return (DateType) this.timing;
        }

        public boolean hasTimingDateType() { 
          return this.timing instanceof DateType;
        }

        /**
         * @return {@link #timing} (The date when or period to which this information refers.)
         */
        public Period getTimingPeriod() throws FHIRException { 
          if (!(this.timing instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but "+this.timing.getClass().getName()+" was encountered");
          return (Period) this.timing;
        }

        public boolean hasTimingPeriod() { 
          return this.timing instanceof Period;
        }

        public boolean hasTiming() { 
          return this.timing != null && !this.timing.isEmpty();
        }

        /**
         * @param value {@link #timing} (The date when or period to which this information refers.)
         */
        public SpecialConditionComponent setTiming(Type value) { 
          this.timing = value;
          return this;
        }

        /**
         * @return {@link #value} (Additional data.)
         */
        public Type getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (Additional data.)
         */
        public StringType getValueStringType() throws FHIRException { 
          if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (StringType) this.value;
        }

        public boolean hasValueStringType() { 
          return this.value instanceof StringType;
        }

        /**
         * @return {@link #value} (Additional data.)
         */
        public Quantity getValueQuantity() throws FHIRException { 
          if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Quantity) this.value;
        }

        public boolean hasValueQuantity() { 
          return this.value instanceof Quantity;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (Additional data.)
         */
        public SpecialConditionComponent setValue(Type value) { 
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("category", "Coding", "The general class of the information supplied: information; exception; accident, employment; onset, etc.", 0, java.lang.Integer.MAX_VALUE, category));
          childrenList.add(new Property("code", "Coding", "System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication.", 0, java.lang.Integer.MAX_VALUE, code));
          childrenList.add(new Property("timing[x]", "date|Period", "The date when or period to which this information refers.", 0, java.lang.Integer.MAX_VALUE, timing));
          childrenList.add(new Property("value[x]", "string|Quantity", "Additional data.", 0, java.lang.Integer.MAX_VALUE, value));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // Coding
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // Coding
        case -873664438: /*timing*/ return this.timing == null ? new Base[0] : new Base[] {this.timing}; // Type
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 50511102: // category
          this.category = castToCoding(value); // Coding
          break;
        case 3059181: // code
          this.code = castToCoding(value); // Coding
          break;
        case -873664438: // timing
          this.timing = castToType(value); // Type
          break;
        case 111972721: // value
          this.value = castToType(value); // Type
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("category"))
          this.category = castToCoding(value); // Coding
        else if (name.equals("code"))
          this.code = castToCoding(value); // Coding
        else if (name.equals("timing[x]"))
          this.timing = castToType(value); // Type
        else if (name.equals("value[x]"))
          this.value = castToType(value); // Type
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102:  return getCategory(); // Coding
        case 3059181:  return getCode(); // Coding
        case 164632566:  return getTiming(); // Type
        case -1410166417:  return getValue(); // Type
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("category")) {
          this.category = new Coding();
          return this.category;
        }
        else if (name.equals("code")) {
          this.code = new Coding();
          return this.code;
        }
        else if (name.equals("timingDate")) {
          this.timing = new DateType();
          return this.timing;
        }
        else if (name.equals("timingPeriod")) {
          this.timing = new Period();
          return this.timing;
        }
        else if (name.equals("valueString")) {
          this.value = new StringType();
          return this.value;
        }
        else if (name.equals("valueQuantity")) {
          this.value = new Quantity();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public SpecialConditionComponent copy() {
        SpecialConditionComponent dst = new SpecialConditionComponent();
        copyValues(dst);
        dst.category = category == null ? null : category.copy();
        dst.code = code == null ? null : code.copy();
        dst.timing = timing == null ? null : timing.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof SpecialConditionComponent))
          return false;
        SpecialConditionComponent o = (SpecialConditionComponent) other;
        return compareDeep(category, o.category, true) && compareDeep(code, o.code, true) && compareDeep(timing, o.timing, true)
           && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof SpecialConditionComponent))
          return false;
        SpecialConditionComponent o = (SpecialConditionComponent) other;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(category, code, timing, value
          );
      }

  public String fhirType() {
    return "Claim.information";

  }

  }

    @Block()
    public static class DiagnosisComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Sequence of diagnosis which serves to order and provide a link.
         */
        @Child(name = "sequence", type = {PositiveIntType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number to covey order of diagnosis", formalDefinition="Sequence of diagnosis which serves to order and provide a link." )
        protected PositiveIntType sequence;

        /**
         * The diagnosis.
         */
        @Child(name = "diagnosis", type = {Coding.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Patient's diagnosis", formalDefinition="The diagnosis." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/icd-10")
        protected Coding diagnosis;

        /**
         * The type of the Diagnosis, for example: admitting,.
         */
        @Child(name = "type", type = {Coding.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Type of Diagnosis", formalDefinition="The type of the Diagnosis, for example: admitting,." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-diagnosistype")
        protected List<Coding> type;

        /**
         * The Diagnosis Related Group (DRG) code based on the assigned grouping code system.
         */
        @Child(name = "drg", type = {Coding.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Diagnosis Related Group", formalDefinition="The Diagnosis Related Group (DRG) code based on the assigned grouping code system." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-diagnosisrelatedgroup")
        protected Coding drg;

        private static final long serialVersionUID = 135693095L;

    /**
     * Constructor
     */
      public DiagnosisComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DiagnosisComponent(PositiveIntType sequence, Coding diagnosis) {
        super();
        this.sequence = sequence;
        this.diagnosis = diagnosis;
      }

        /**
         * @return {@link #sequence} (Sequence of diagnosis which serves to order and provide a link.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public PositiveIntType getSequenceElement() { 
          if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DiagnosisComponent.sequence");
            else if (Configuration.doAutoCreate())
              this.sequence = new PositiveIntType(); // bb
          return this.sequence;
        }

        public boolean hasSequenceElement() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasSequence() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        /**
         * @param value {@link #sequence} (Sequence of diagnosis which serves to order and provide a link.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public DiagnosisComponent setSequenceElement(PositiveIntType value) { 
          this.sequence = value;
          return this;
        }

        /**
         * @return Sequence of diagnosis which serves to order and provide a link.
         */
        public int getSequence() { 
          return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
        }

        /**
         * @param value Sequence of diagnosis which serves to order and provide a link.
         */
        public DiagnosisComponent setSequence(int value) { 
            if (this.sequence == null)
              this.sequence = new PositiveIntType();
            this.sequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #diagnosis} (The diagnosis.)
         */
        public Coding getDiagnosis() { 
          if (this.diagnosis == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DiagnosisComponent.diagnosis");
            else if (Configuration.doAutoCreate())
              this.diagnosis = new Coding(); // cc
          return this.diagnosis;
        }

        public boolean hasDiagnosis() { 
          return this.diagnosis != null && !this.diagnosis.isEmpty();
        }

        /**
         * @param value {@link #diagnosis} (The diagnosis.)
         */
        public DiagnosisComponent setDiagnosis(Coding value) { 
          this.diagnosis = value;
          return this;
        }

        /**
         * @return {@link #type} (The type of the Diagnosis, for example: admitting,.)
         */
        public List<Coding> getType() { 
          if (this.type == null)
            this.type = new ArrayList<Coding>();
          return this.type;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DiagnosisComponent setType(List<Coding> theType) { 
          this.type = theType;
          return this;
        }

        public boolean hasType() { 
          if (this.type == null)
            return false;
          for (Coding item : this.type)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addType() { //3
          Coding t = new Coding();
          if (this.type == null)
            this.type = new ArrayList<Coding>();
          this.type.add(t);
          return t;
        }

        public DiagnosisComponent addType(Coding t) { //3
          if (t == null)
            return this;
          if (this.type == null)
            this.type = new ArrayList<Coding>();
          this.type.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #type}, creating it if it does not already exist
         */
        public Coding getTypeFirstRep() { 
          if (getType().isEmpty()) {
            addType();
          }
          return getType().get(0);
        }

        /**
         * @return {@link #drg} (The Diagnosis Related Group (DRG) code based on the assigned grouping code system.)
         */
        public Coding getDrg() { 
          if (this.drg == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DiagnosisComponent.drg");
            else if (Configuration.doAutoCreate())
              this.drg = new Coding(); // cc
          return this.drg;
        }

        public boolean hasDrg() { 
          return this.drg != null && !this.drg.isEmpty();
        }

        /**
         * @param value {@link #drg} (The Diagnosis Related Group (DRG) code based on the assigned grouping code system.)
         */
        public DiagnosisComponent setDrg(Coding value) { 
          this.drg = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("sequence", "positiveInt", "Sequence of diagnosis which serves to order and provide a link.", 0, java.lang.Integer.MAX_VALUE, sequence));
          childrenList.add(new Property("diagnosis", "Coding", "The diagnosis.", 0, java.lang.Integer.MAX_VALUE, diagnosis));
          childrenList.add(new Property("type", "Coding", "The type of the Diagnosis, for example: admitting,.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("drg", "Coding", "The Diagnosis Related Group (DRG) code based on the assigned grouping code system.", 0, java.lang.Integer.MAX_VALUE, drg));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return this.sequence == null ? new Base[0] : new Base[] {this.sequence}; // PositiveIntType
        case 1196993265: /*diagnosis*/ return this.diagnosis == null ? new Base[0] : new Base[] {this.diagnosis}; // Coding
        case 3575610: /*type*/ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // Coding
        case 99737: /*drg*/ return this.drg == null ? new Base[0] : new Base[] {this.drg}; // Coding
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1349547969: // sequence
          this.sequence = castToPositiveInt(value); // PositiveIntType
          break;
        case 1196993265: // diagnosis
          this.diagnosis = castToCoding(value); // Coding
          break;
        case 3575610: // type
          this.getType().add(castToCoding(value)); // Coding
          break;
        case 99737: // drg
          this.drg = castToCoding(value); // Coding
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
          this.sequence = castToPositiveInt(value); // PositiveIntType
        else if (name.equals("diagnosis"))
          this.diagnosis = castToCoding(value); // Coding
        else if (name.equals("type"))
          this.getType().add(castToCoding(value));
        else if (name.equals("drg"))
          this.drg = castToCoding(value); // Coding
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969: throw new FHIRException("Cannot make property sequence as it is not a complex type"); // PositiveIntType
        case 1196993265:  return getDiagnosis(); // Coding
        case 3575610:  return addType(); // Coding
        case 99737:  return getDrg(); // Coding
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        }
        else if (name.equals("diagnosis")) {
          this.diagnosis = new Coding();
          return this.diagnosis;
        }
        else if (name.equals("type")) {
          return addType();
        }
        else if (name.equals("drg")) {
          this.drg = new Coding();
          return this.drg;
        }
        else
          return super.addChild(name);
      }

      public DiagnosisComponent copy() {
        DiagnosisComponent dst = new DiagnosisComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.diagnosis = diagnosis == null ? null : diagnosis.copy();
        if (type != null) {
          dst.type = new ArrayList<Coding>();
          for (Coding i : type)
            dst.type.add(i.copy());
        };
        dst.drg = drg == null ? null : drg.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof DiagnosisComponent))
          return false;
        DiagnosisComponent o = (DiagnosisComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(diagnosis, o.diagnosis, true) && compareDeep(type, o.type, true)
           && compareDeep(drg, o.drg, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof DiagnosisComponent))
          return false;
        DiagnosisComponent o = (DiagnosisComponent) other;
        return compareValues(sequence, o.sequence, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(sequence, diagnosis, type
          , drg);
      }

  public String fhirType() {
    return "Claim.diagnosis";

  }

  }

    @Block()
    public static class ProcedureComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Sequence of procedures which serves to order and provide a link.
         */
        @Child(name = "sequence", type = {PositiveIntType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Procedure sequence for reference", formalDefinition="Sequence of procedures which serves to order and provide a link." )
        protected PositiveIntType sequence;

        /**
         * Date and optionally time the procedure was performed .
         */
        @Child(name = "date", type = {DateTimeType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="When the procedure was performed", formalDefinition="Date and optionally time the procedure was performed ." )
        protected DateTimeType date;

        /**
         * The procedure code.
         */
        @Child(name = "procedure", type = {Coding.class, Procedure.class}, order=3, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Patient's list of procedures performed", formalDefinition="The procedure code." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/icd-10-procedures")
        protected Type procedure;

        private static final long serialVersionUID = 864307347L;

    /**
     * Constructor
     */
      public ProcedureComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ProcedureComponent(PositiveIntType sequence, Type procedure) {
        super();
        this.sequence = sequence;
        this.procedure = procedure;
      }

        /**
         * @return {@link #sequence} (Sequence of procedures which serves to order and provide a link.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public PositiveIntType getSequenceElement() { 
          if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ProcedureComponent.sequence");
            else if (Configuration.doAutoCreate())
              this.sequence = new PositiveIntType(); // bb
          return this.sequence;
        }

        public boolean hasSequenceElement() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasSequence() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        /**
         * @param value {@link #sequence} (Sequence of procedures which serves to order and provide a link.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public ProcedureComponent setSequenceElement(PositiveIntType value) { 
          this.sequence = value;
          return this;
        }

        /**
         * @return Sequence of procedures which serves to order and provide a link.
         */
        public int getSequence() { 
          return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
        }

        /**
         * @param value Sequence of procedures which serves to order and provide a link.
         */
        public ProcedureComponent setSequence(int value) { 
            if (this.sequence == null)
              this.sequence = new PositiveIntType();
            this.sequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #date} (Date and optionally time the procedure was performed .). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public DateTimeType getDateElement() { 
          if (this.date == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ProcedureComponent.date");
            else if (Configuration.doAutoCreate())
              this.date = new DateTimeType(); // bb
          return this.date;
        }

        public boolean hasDateElement() { 
          return this.date != null && !this.date.isEmpty();
        }

        public boolean hasDate() { 
          return this.date != null && !this.date.isEmpty();
        }

        /**
         * @param value {@link #date} (Date and optionally time the procedure was performed .). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public ProcedureComponent setDateElement(DateTimeType value) { 
          this.date = value;
          return this;
        }

        /**
         * @return Date and optionally time the procedure was performed .
         */
        public Date getDate() { 
          return this.date == null ? null : this.date.getValue();
        }

        /**
         * @param value Date and optionally time the procedure was performed .
         */
        public ProcedureComponent setDate(Date value) { 
          if (value == null)
            this.date = null;
          else {
            if (this.date == null)
              this.date = new DateTimeType();
            this.date.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #procedure} (The procedure code.)
         */
        public Type getProcedure() { 
          return this.procedure;
        }

        /**
         * @return {@link #procedure} (The procedure code.)
         */
        public Coding getProcedureCoding() throws FHIRException { 
          if (!(this.procedure instanceof Coding))
            throw new FHIRException("Type mismatch: the type Coding was expected, but "+this.procedure.getClass().getName()+" was encountered");
          return (Coding) this.procedure;
        }

        public boolean hasProcedureCoding() { 
          return this.procedure instanceof Coding;
        }

        /**
         * @return {@link #procedure} (The procedure code.)
         */
        public Reference getProcedureReference() throws FHIRException { 
          if (!(this.procedure instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.procedure.getClass().getName()+" was encountered");
          return (Reference) this.procedure;
        }

        public boolean hasProcedureReference() { 
          return this.procedure instanceof Reference;
        }

        public boolean hasProcedure() { 
          return this.procedure != null && !this.procedure.isEmpty();
        }

        /**
         * @param value {@link #procedure} (The procedure code.)
         */
        public ProcedureComponent setProcedure(Type value) { 
          this.procedure = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("sequence", "positiveInt", "Sequence of procedures which serves to order and provide a link.", 0, java.lang.Integer.MAX_VALUE, sequence));
          childrenList.add(new Property("date", "dateTime", "Date and optionally time the procedure was performed .", 0, java.lang.Integer.MAX_VALUE, date));
          childrenList.add(new Property("procedure[x]", "Coding|Reference(Procedure)", "The procedure code.", 0, java.lang.Integer.MAX_VALUE, procedure));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return this.sequence == null ? new Base[0] : new Base[] {this.sequence}; // PositiveIntType
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -1095204141: /*procedure*/ return this.procedure == null ? new Base[0] : new Base[] {this.procedure}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1349547969: // sequence
          this.sequence = castToPositiveInt(value); // PositiveIntType
          break;
        case 3076014: // date
          this.date = castToDateTime(value); // DateTimeType
          break;
        case -1095204141: // procedure
          this.procedure = castToType(value); // Type
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
          this.sequence = castToPositiveInt(value); // PositiveIntType
        else if (name.equals("date"))
          this.date = castToDateTime(value); // DateTimeType
        else if (name.equals("procedure[x]"))
          this.procedure = castToType(value); // Type
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969: throw new FHIRException("Cannot make property sequence as it is not a complex type"); // PositiveIntType
        case 3076014: throw new FHIRException("Cannot make property date as it is not a complex type"); // DateTimeType
        case 1640074445:  return getProcedure(); // Type
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.date");
        }
        else if (name.equals("procedureCoding")) {
          this.procedure = new Coding();
          return this.procedure;
        }
        else if (name.equals("procedureReference")) {
          this.procedure = new Reference();
          return this.procedure;
        }
        else
          return super.addChild(name);
      }

      public ProcedureComponent copy() {
        ProcedureComponent dst = new ProcedureComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.date = date == null ? null : date.copy();
        dst.procedure = procedure == null ? null : procedure.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ProcedureComponent))
          return false;
        ProcedureComponent o = (ProcedureComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(date, o.date, true) && compareDeep(procedure, o.procedure, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ProcedureComponent))
          return false;
        ProcedureComponent o = (ProcedureComponent) other;
        return compareValues(sequence, o.sequence, true) && compareValues(date, o.date, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(sequence, date, procedure
          );
      }

  public String fhirType() {
    return "Claim.procedure";

  }

  }

    @Block()
    public static class CoverageComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A service line item.
         */
        @Child(name = "sequence", type = {PositiveIntType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Service instance identifier", formalDefinition="A service line item." )
        protected PositiveIntType sequence;

        /**
         * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
         */
        @Child(name = "focal", type = {BooleanType.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Is the focal Coverage", formalDefinition="The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated." )
        protected BooleanType focal;

        /**
         * Reference to the program or plan identification, underwriter or payor.
         */
        @Child(name = "coverage", type = {Coverage.class}, order=3, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Insurance information", formalDefinition="Reference to the program or plan identification, underwriter or payor." )
        protected Reference coverage;

        /**
         * The actual object that is the target of the reference (Reference to the program or plan identification, underwriter or payor.)
         */
        protected Coverage coverageTarget;

        /**
         * The contract number of a business agreement which describes the terms and conditions.
         */
        @Child(name = "businessArrangement", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Business agreement", formalDefinition="The contract number of a business agreement which describes the terms and conditions." )
        protected StringType businessArrangement;

        /**
         * A list of references from the Insurer to which these services pertain.
         */
        @Child(name = "preAuthRef", type = {StringType.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Pre-Authorization/Determination Reference", formalDefinition="A list of references from the Insurer to which these services pertain." )
        protected List<StringType> preAuthRef;

        /**
         * The Coverages adjudication details.
         */
        @Child(name = "claimResponse", type = {ClaimResponse.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Adjudication results", formalDefinition="The Coverages adjudication details." )
        protected Reference claimResponse;

        /**
         * The actual object that is the target of the reference (The Coverages adjudication details.)
         */
        protected ClaimResponse claimResponseTarget;

        /**
         * The style (standard) and version of the original material which was converted into this resource.
         */
        @Child(name = "originalRuleset", type = {Coding.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Original version", formalDefinition="The style (standard) and version of the original material which was converted into this resource." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ruleset")
        protected Coding originalRuleset;

        private static final long serialVersionUID = -1003564312L;

    /**
     * Constructor
     */
      public CoverageComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CoverageComponent(PositiveIntType sequence, BooleanType focal, Reference coverage) {
        super();
        this.sequence = sequence;
        this.focal = focal;
        this.coverage = coverage;
      }

        /**
         * @return {@link #sequence} (A service line item.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public PositiveIntType getSequenceElement() { 
          if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.sequence");
            else if (Configuration.doAutoCreate())
              this.sequence = new PositiveIntType(); // bb
          return this.sequence;
        }

        public boolean hasSequenceElement() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasSequence() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        /**
         * @param value {@link #sequence} (A service line item.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public CoverageComponent setSequenceElement(PositiveIntType value) { 
          this.sequence = value;
          return this;
        }

        /**
         * @return A service line item.
         */
        public int getSequence() { 
          return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
        }

        /**
         * @param value A service line item.
         */
        public CoverageComponent setSequence(int value) { 
            if (this.sequence == null)
              this.sequence = new PositiveIntType();
            this.sequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #focal} (The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.). This is the underlying object with id, value and extensions. The accessor "getFocal" gives direct access to the value
         */
        public BooleanType getFocalElement() { 
          if (this.focal == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.focal");
            else if (Configuration.doAutoCreate())
              this.focal = new BooleanType(); // bb
          return this.focal;
        }

        public boolean hasFocalElement() { 
          return this.focal != null && !this.focal.isEmpty();
        }

        public boolean hasFocal() { 
          return this.focal != null && !this.focal.isEmpty();
        }

        /**
         * @param value {@link #focal} (The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.). This is the underlying object with id, value and extensions. The accessor "getFocal" gives direct access to the value
         */
        public CoverageComponent setFocalElement(BooleanType value) { 
          this.focal = value;
          return this;
        }

        /**
         * @return The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
         */
        public boolean getFocal() { 
          return this.focal == null || this.focal.isEmpty() ? false : this.focal.getValue();
        }

        /**
         * @param value The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
         */
        public CoverageComponent setFocal(boolean value) { 
            if (this.focal == null)
              this.focal = new BooleanType();
            this.focal.setValue(value);
          return this;
        }

        /**
         * @return {@link #coverage} (Reference to the program or plan identification, underwriter or payor.)
         */
        public Reference getCoverage() { 
          if (this.coverage == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.coverage");
            else if (Configuration.doAutoCreate())
              this.coverage = new Reference(); // cc
          return this.coverage;
        }

        public boolean hasCoverage() { 
          return this.coverage != null && !this.coverage.isEmpty();
        }

        /**
         * @param value {@link #coverage} (Reference to the program or plan identification, underwriter or payor.)
         */
        public CoverageComponent setCoverage(Reference value) { 
          this.coverage = value;
          return this;
        }

        /**
         * @return {@link #coverage} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to the program or plan identification, underwriter or payor.)
         */
        public Coverage getCoverageTarget() { 
          if (this.coverageTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.coverage");
            else if (Configuration.doAutoCreate())
              this.coverageTarget = new Coverage(); // aa
          return this.coverageTarget;
        }

        /**
         * @param value {@link #coverage} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to the program or plan identification, underwriter or payor.)
         */
        public CoverageComponent setCoverageTarget(Coverage value) { 
          this.coverageTarget = value;
          return this;
        }

        /**
         * @return {@link #businessArrangement} (The contract number of a business agreement which describes the terms and conditions.). This is the underlying object with id, value and extensions. The accessor "getBusinessArrangement" gives direct access to the value
         */
        public StringType getBusinessArrangementElement() { 
          if (this.businessArrangement == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.businessArrangement");
            else if (Configuration.doAutoCreate())
              this.businessArrangement = new StringType(); // bb
          return this.businessArrangement;
        }

        public boolean hasBusinessArrangementElement() { 
          return this.businessArrangement != null && !this.businessArrangement.isEmpty();
        }

        public boolean hasBusinessArrangement() { 
          return this.businessArrangement != null && !this.businessArrangement.isEmpty();
        }

        /**
         * @param value {@link #businessArrangement} (The contract number of a business agreement which describes the terms and conditions.). This is the underlying object with id, value and extensions. The accessor "getBusinessArrangement" gives direct access to the value
         */
        public CoverageComponent setBusinessArrangementElement(StringType value) { 
          this.businessArrangement = value;
          return this;
        }

        /**
         * @return The contract number of a business agreement which describes the terms and conditions.
         */
        public String getBusinessArrangement() { 
          return this.businessArrangement == null ? null : this.businessArrangement.getValue();
        }

        /**
         * @param value The contract number of a business agreement which describes the terms and conditions.
         */
        public CoverageComponent setBusinessArrangement(String value) { 
          if (Utilities.noString(value))
            this.businessArrangement = null;
          else {
            if (this.businessArrangement == null)
              this.businessArrangement = new StringType();
            this.businessArrangement.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #preAuthRef} (A list of references from the Insurer to which these services pertain.)
         */
        public List<StringType> getPreAuthRef() { 
          if (this.preAuthRef == null)
            this.preAuthRef = new ArrayList<StringType>();
          return this.preAuthRef;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public CoverageComponent setPreAuthRef(List<StringType> thePreAuthRef) { 
          this.preAuthRef = thePreAuthRef;
          return this;
        }

        public boolean hasPreAuthRef() { 
          if (this.preAuthRef == null)
            return false;
          for (StringType item : this.preAuthRef)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #preAuthRef} (A list of references from the Insurer to which these services pertain.)
         */
        public StringType addPreAuthRefElement() {//2 
          StringType t = new StringType();
          if (this.preAuthRef == null)
            this.preAuthRef = new ArrayList<StringType>();
          this.preAuthRef.add(t);
          return t;
        }

        /**
         * @param value {@link #preAuthRef} (A list of references from the Insurer to which these services pertain.)
         */
        public CoverageComponent addPreAuthRef(String value) { //1
          StringType t = new StringType();
          t.setValue(value);
          if (this.preAuthRef == null)
            this.preAuthRef = new ArrayList<StringType>();
          this.preAuthRef.add(t);
          return this;
        }

        /**
         * @param value {@link #preAuthRef} (A list of references from the Insurer to which these services pertain.)
         */
        public boolean hasPreAuthRef(String value) { 
          if (this.preAuthRef == null)
            return false;
          for (StringType v : this.preAuthRef)
            if (v.equals(value)) // string
              return true;
          return false;
        }

        /**
         * @return {@link #claimResponse} (The Coverages adjudication details.)
         */
        public Reference getClaimResponse() { 
          if (this.claimResponse == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.claimResponse");
            else if (Configuration.doAutoCreate())
              this.claimResponse = new Reference(); // cc
          return this.claimResponse;
        }

        public boolean hasClaimResponse() { 
          return this.claimResponse != null && !this.claimResponse.isEmpty();
        }

        /**
         * @param value {@link #claimResponse} (The Coverages adjudication details.)
         */
        public CoverageComponent setClaimResponse(Reference value) { 
          this.claimResponse = value;
          return this;
        }

        /**
         * @return {@link #claimResponse} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Coverages adjudication details.)
         */
        public ClaimResponse getClaimResponseTarget() { 
          if (this.claimResponseTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.claimResponse");
            else if (Configuration.doAutoCreate())
              this.claimResponseTarget = new ClaimResponse(); // aa
          return this.claimResponseTarget;
        }

        /**
         * @param value {@link #claimResponse} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Coverages adjudication details.)
         */
        public CoverageComponent setClaimResponseTarget(ClaimResponse value) { 
          this.claimResponseTarget = value;
          return this;
        }

        /**
         * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
         */
        public Coding getOriginalRuleset() { 
          if (this.originalRuleset == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageComponent.originalRuleset");
            else if (Configuration.doAutoCreate())
              this.originalRuleset = new Coding(); // cc
          return this.originalRuleset;
        }

        public boolean hasOriginalRuleset() { 
          return this.originalRuleset != null && !this.originalRuleset.isEmpty();
        }

        /**
         * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
         */
        public CoverageComponent setOriginalRuleset(Coding value) { 
          this.originalRuleset = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("sequence", "positiveInt", "A service line item.", 0, java.lang.Integer.MAX_VALUE, sequence));
          childrenList.add(new Property("focal", "boolean", "The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.", 0, java.lang.Integer.MAX_VALUE, focal));
          childrenList.add(new Property("coverage", "Reference(Coverage)", "Reference to the program or plan identification, underwriter or payor.", 0, java.lang.Integer.MAX_VALUE, coverage));
          childrenList.add(new Property("businessArrangement", "string", "The contract number of a business agreement which describes the terms and conditions.", 0, java.lang.Integer.MAX_VALUE, businessArrangement));
          childrenList.add(new Property("preAuthRef", "string", "A list of references from the Insurer to which these services pertain.", 0, java.lang.Integer.MAX_VALUE, preAuthRef));
          childrenList.add(new Property("claimResponse", "Reference(ClaimResponse)", "The Coverages adjudication details.", 0, java.lang.Integer.MAX_VALUE, claimResponse));
          childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return this.sequence == null ? new Base[0] : new Base[] {this.sequence}; // PositiveIntType
        case 97604197: /*focal*/ return this.focal == null ? new Base[0] : new Base[] {this.focal}; // BooleanType
        case -351767064: /*coverage*/ return this.coverage == null ? new Base[0] : new Base[] {this.coverage}; // Reference
        case 259920682: /*businessArrangement*/ return this.businessArrangement == null ? new Base[0] : new Base[] {this.businessArrangement}; // StringType
        case 522246568: /*preAuthRef*/ return this.preAuthRef == null ? new Base[0] : this.preAuthRef.toArray(new Base[this.preAuthRef.size()]); // StringType
        case 689513629: /*claimResponse*/ return this.claimResponse == null ? new Base[0] : new Base[] {this.claimResponse}; // Reference
        case 1089373397: /*originalRuleset*/ return this.originalRuleset == null ? new Base[0] : new Base[] {this.originalRuleset}; // Coding
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1349547969: // sequence
          this.sequence = castToPositiveInt(value); // PositiveIntType
          break;
        case 97604197: // focal
          this.focal = castToBoolean(value); // BooleanType
          break;
        case -351767064: // coverage
          this.coverage = castToReference(value); // Reference
          break;
        case 259920682: // businessArrangement
          this.businessArrangement = castToString(value); // StringType
          break;
        case 522246568: // preAuthRef
          this.getPreAuthRef().add(castToString(value)); // StringType
          break;
        case 689513629: // claimResponse
          this.claimResponse = castToReference(value); // Reference
          break;
        case 1089373397: // originalRuleset
          this.originalRuleset = castToCoding(value); // Coding
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
          this.sequence = castToPositiveInt(value); // PositiveIntType
        else if (name.equals("focal"))
          this.focal = castToBoolean(value); // BooleanType
        else if (name.equals("coverage"))
          this.coverage = castToReference(value); // Reference
        else if (name.equals("businessArrangement"))
          this.businessArrangement = castToString(value); // StringType
        else if (name.equals("preAuthRef"))
          this.getPreAuthRef().add(castToString(value));
        else if (name.equals("claimResponse"))
          this.claimResponse = castToReference(value); // Reference
        else if (name.equals("originalRuleset"))
          this.originalRuleset = castToCoding(value); // Coding
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969: throw new FHIRException("Cannot make property sequence as it is not a complex type"); // PositiveIntType
        case 97604197: throw new FHIRException("Cannot make property focal as it is not a complex type"); // BooleanType
        case -351767064:  return getCoverage(); // Reference
        case 259920682: throw new FHIRException("Cannot make property businessArrangement as it is not a complex type"); // StringType
        case 522246568: throw new FHIRException("Cannot make property preAuthRef as it is not a complex type"); // StringType
        case 689513629:  return getClaimResponse(); // Reference
        case 1089373397:  return getOriginalRuleset(); // Coding
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        }
        else if (name.equals("focal")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.focal");
        }
        else if (name.equals("coverage")) {
          this.coverage = new Reference();
          return this.coverage;
        }
        else if (name.equals("businessArrangement")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.businessArrangement");
        }
        else if (name.equals("preAuthRef")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.preAuthRef");
        }
        else if (name.equals("claimResponse")) {
          this.claimResponse = new Reference();
          return this.claimResponse;
        }
        else if (name.equals("originalRuleset")) {
          this.originalRuleset = new Coding();
          return this.originalRuleset;
        }
        else
          return super.addChild(name);
      }

      public CoverageComponent copy() {
        CoverageComponent dst = new CoverageComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.focal = focal == null ? null : focal.copy();
        dst.coverage = coverage == null ? null : coverage.copy();
        dst.businessArrangement = businessArrangement == null ? null : businessArrangement.copy();
        if (preAuthRef != null) {
          dst.preAuthRef = new ArrayList<StringType>();
          for (StringType i : preAuthRef)
            dst.preAuthRef.add(i.copy());
        };
        dst.claimResponse = claimResponse == null ? null : claimResponse.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof CoverageComponent))
          return false;
        CoverageComponent o = (CoverageComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(focal, o.focal, true) && compareDeep(coverage, o.coverage, true)
           && compareDeep(businessArrangement, o.businessArrangement, true) && compareDeep(preAuthRef, o.preAuthRef, true)
           && compareDeep(claimResponse, o.claimResponse, true) && compareDeep(originalRuleset, o.originalRuleset, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof CoverageComponent))
          return false;
        CoverageComponent o = (CoverageComponent) other;
        return compareValues(sequence, o.sequence, true) && compareValues(focal, o.focal, true) && compareValues(businessArrangement, o.businessArrangement, true)
           && compareValues(preAuthRef, o.preAuthRef, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(sequence, focal, coverage
          , businessArrangement, preAuthRef, claimResponse, originalRuleset);
      }

  public String fhirType() {
    return "Claim.coverage";

  }

  }

    @Block()
    public static class AccidentComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Date of an accident which these services are addressing.
         */
        @Child(name = "date", type = {DateType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="When the accident occurred\nsee information codes\nsee information codes", formalDefinition="Date of an accident which these services are addressing." )
        protected DateType date;

        /**
         * Type of accident: work, auto, etc.
         */
        @Child(name = "type", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The nature of the accident", formalDefinition="Type of accident: work, auto, etc." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/v3-ActIncidentCode")
        protected Coding type;

        /**
         * Accident Place.
         */
        @Child(name = "location", type = {Address.class, Location.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Accident Place", formalDefinition="Accident Place." )
        protected Type location;

        private static final long serialVersionUID = -242365747L;

    /**
     * Constructor
     */
      public AccidentComponent() {
        super();
      }

    /**
     * Constructor
     */
      public AccidentComponent(DateType date) {
        super();
        this.date = date;
      }

        /**
         * @return {@link #date} (Date of an accident which these services are addressing.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public DateType getDateElement() { 
          if (this.date == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create AccidentComponent.date");
            else if (Configuration.doAutoCreate())
              this.date = new DateType(); // bb
          return this.date;
        }

        public boolean hasDateElement() { 
          return this.date != null && !this.date.isEmpty();
        }

        public boolean hasDate() { 
          return this.date != null && !this.date.isEmpty();
        }

        /**
         * @param value {@link #date} (Date of an accident which these services are addressing.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public AccidentComponent setDateElement(DateType value) { 
          this.date = value;
          return this;
        }

        /**
         * @return Date of an accident which these services are addressing.
         */
        public Date getDate() { 
          return this.date == null ? null : this.date.getValue();
        }

        /**
         * @param value Date of an accident which these services are addressing.
         */
        public AccidentComponent setDate(Date value) { 
            if (this.date == null)
              this.date = new DateType();
            this.date.setValue(value);
          return this;
        }

        /**
         * @return {@link #type} (Type of accident: work, auto, etc.)
         */
        public Coding getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create AccidentComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Coding(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of accident: work, auto, etc.)
         */
        public AccidentComponent setType(Coding value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #location} (Accident Place.)
         */
        public Type getLocation() { 
          return this.location;
        }

        /**
         * @return {@link #location} (Accident Place.)
         */
        public Address getLocationAddress() throws FHIRException { 
          if (!(this.location instanceof Address))
            throw new FHIRException("Type mismatch: the type Address was expected, but "+this.location.getClass().getName()+" was encountered");
          return (Address) this.location;
        }

        public boolean hasLocationAddress() { 
          return this.location instanceof Address;
        }

        /**
         * @return {@link #location} (Accident Place.)
         */
        public Reference getLocationReference() throws FHIRException { 
          if (!(this.location instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.location.getClass().getName()+" was encountered");
          return (Reference) this.location;
        }

        public boolean hasLocationReference() { 
          return this.location instanceof Reference;
        }

        public boolean hasLocation() { 
          return this.location != null && !this.location.isEmpty();
        }

        /**
         * @param value {@link #location} (Accident Place.)
         */
        public AccidentComponent setLocation(Type value) { 
          this.location = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("date", "date", "Date of an accident which these services are addressing.", 0, java.lang.Integer.MAX_VALUE, date));
          childrenList.add(new Property("type", "Coding", "Type of accident: work, auto, etc.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("location[x]", "Address|Reference(Location)", "Accident Place.", 0, java.lang.Integer.MAX_VALUE, location));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Coding
        case 1901043637: /*location*/ return this.location == null ? new Base[0] : new Base[] {this.location}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3076014: // date
          this.date = castToDate(value); // DateType
          break;
        case 3575610: // type
          this.type = castToCoding(value); // Coding
          break;
        case 1901043637: // location
          this.location = castToType(value); // Type
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("date"))
          this.date = castToDate(value); // DateType
        else if (name.equals("type"))
          this.type = castToCoding(value); // Coding
        else if (name.equals("location[x]"))
          this.location = castToType(value); // Type
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3076014: throw new FHIRException("Cannot make property date as it is not a complex type"); // DateType
        case 3575610:  return getType(); // Coding
        case 552316075:  return getLocation(); // Type
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.date");
        }
        else if (name.equals("type")) {
          this.type = new Coding();
          return this.type;
        }
        else if (name.equals("locationAddress")) {
          this.location = new Address();
          return this.location;
        }
        else if (name.equals("locationReference")) {
          this.location = new Reference();
          return this.location;
        }
        else
          return super.addChild(name);
      }

      public AccidentComponent copy() {
        AccidentComponent dst = new AccidentComponent();
        copyValues(dst);
        dst.date = date == null ? null : date.copy();
        dst.type = type == null ? null : type.copy();
        dst.location = location == null ? null : location.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof AccidentComponent))
          return false;
        AccidentComponent o = (AccidentComponent) other;
        return compareDeep(date, o.date, true) && compareDeep(type, o.type, true) && compareDeep(location, o.location, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof AccidentComponent))
          return false;
        AccidentComponent o = (AccidentComponent) other;
        return compareValues(date, o.date, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(date, type, location);
      }

  public String fhirType() {
    return "Claim.accident";

  }

  }

    @Block()
    public static class ItemComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A service line number.
         */
        @Child(name = "sequence", type = {PositiveIntType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Service instance", formalDefinition="A service line number." )
        protected PositiveIntType sequence;

        /**
         * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
         */
        @Child(name = "careTeam", type = {}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="(todo", formalDefinition="The members of the team who provided the overall service as well as their role and whether responsible and qualifications." )
        protected List<CareTeamComponent> careTeam;

        /**
         * Diagnosis applicable for this service or product line.
         */
        @Child(name = "diagnosisLinkId", type = {PositiveIntType.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Applicable diagnoses", formalDefinition="Diagnosis applicable for this service or product line." )
        protected List<PositiveIntType> diagnosisLinkId;

        /**
         * The type of reveneu or cost center providing the product and/or service.
         */
        @Child(name = "revenue", type = {Coding.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Revenue or cost center code", formalDefinition="The type of reveneu or cost center providing the product and/or service." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-revenue-center")
        protected Coding revenue;

        /**
         * Health Care Service Type Codes  to identify the classification of service or benefits.
         */
        @Child(name = "category", type = {Coding.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of service or product", formalDefinition="Health Care Service Type Codes  to identify the classification of service or benefits." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-subcategory")
        protected Coding category;

        /**
         * If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
         */
        @Child(name = "service", type = {Coding.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Billing Code", formalDefinition="If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/service-uscls")
        protected Coding service;

        /**
         * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
         */
        @Child(name = "modifier", type = {Coding.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Service/Product billing modifiers", formalDefinition="Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-modifiers")
        protected List<Coding> modifier;

        /**
         * For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program.
         */
        @Child(name = "programCode", type = {Coding.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Program specific reason for item inclusion", formalDefinition="For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-program-code")
        protected List<Coding> programCode;

        /**
         * The date or dates when the enclosed suite of services were performed or completed.
         */
        @Child(name = "serviced", type = {DateType.class, Period.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Date or dates of Service", formalDefinition="The date or dates when the enclosed suite of services were performed or completed." )
        protected Type serviced;

        /**
         * Where the service was provided.
         */
        @Child(name = "location", type = {Coding.class, Address.class, Location.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Place of service", formalDefinition="Where the service was provided." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/service-place")
        protected Type location;

        /**
         * The number of repetitions of a service or product.
         */
        @Child(name = "quantity", type = {SimpleQuantity.class}, order=11, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Count of Products or Services", formalDefinition="The number of repetitions of a service or product." )
        protected SimpleQuantity quantity;

        /**
         * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
         */
        @Child(name = "unitPrice", type = {Money.class}, order=12, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fee, charge or cost per point", formalDefinition="If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group." )
        protected Money unitPrice;

        /**
         * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        @Child(name = "factor", type = {DecimalType.class}, order=13, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Price scaling factor", formalDefinition="A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount." )
        protected DecimalType factor;

        /**
         * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        @Child(name = "points", type = {DecimalType.class}, order=14, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Difficulty scaling factor", formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point." )
        protected DecimalType points;

        /**
         * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
         */
        @Child(name = "net", type = {Money.class}, order=15, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Total item cost", formalDefinition="The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied." )
        protected Money net;

        /**
         * List of Unique Device Identifiers associated with this line item.
         */
        @Child(name = "udi", type = {Device.class}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Unique Device Identifier", formalDefinition="List of Unique Device Identifiers associated with this line item." )
        protected List<Reference> udi;
        /**
         * The actual objects that are the target of the reference (List of Unique Device Identifiers associated with this line item.)
         */
        protected List<Device> udiTarget;


        /**
         * Physical service site on the patient (limb, tooth, etc).
         */
        @Child(name = "bodySite", type = {Coding.class}, order=17, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Service Location", formalDefinition="Physical service site on the patient (limb, tooth, etc)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/tooth")
        protected Coding bodySite;

        /**
         * A region or surface of the site, eg. limb region or tooth surface(s).
         */
        @Child(name = "subSite", type = {Coding.class}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Service Sub-location", formalDefinition="A region or surface of the site, eg. limb region or tooth surface(s)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/surface")
        protected List<Coding> subSite;

        /**
         * Second tier of goods and services.
         */
        @Child(name = "detail", type = {}, order=19, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Additional items", formalDefinition="Second tier of goods and services." )
        protected List<DetailComponent> detail;

        /**
         * The materials and placement date of prior fixed prosthesis.
         */
        @Child(name = "prosthesis", type = {}, order=20, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Prosthetic details", formalDefinition="The materials and placement date of prior fixed prosthesis." )
        protected ProsthesisComponent prosthesis;

        private static final long serialVersionUID = 749339585L;

    /**
     * Constructor
     */
      public ItemComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ItemComponent(PositiveIntType sequence) {
        super();
        this.sequence = sequence;
      }

        /**
         * @return {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public PositiveIntType getSequenceElement() { 
          if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.sequence");
            else if (Configuration.doAutoCreate())
              this.sequence = new PositiveIntType(); // bb
          return this.sequence;
        }

        public boolean hasSequenceElement() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasSequence() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        /**
         * @param value {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public ItemComponent setSequenceElement(PositiveIntType value) { 
          this.sequence = value;
          return this;
        }

        /**
         * @return A service line number.
         */
        public int getSequence() { 
          return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
        }

        /**
         * @param value A service line number.
         */
        public ItemComponent setSequence(int value) { 
            if (this.sequence == null)
              this.sequence = new PositiveIntType();
            this.sequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #careTeam} (The members of the team who provided the overall service as well as their role and whether responsible and qualifications.)
         */
        public List<CareTeamComponent> getCareTeam() { 
          if (this.careTeam == null)
            this.careTeam = new ArrayList<CareTeamComponent>();
          return this.careTeam;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ItemComponent setCareTeam(List<CareTeamComponent> theCareTeam) { 
          this.careTeam = theCareTeam;
          return this;
        }

        public boolean hasCareTeam() { 
          if (this.careTeam == null)
            return false;
          for (CareTeamComponent item : this.careTeam)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CareTeamComponent addCareTeam() { //3
          CareTeamComponent t = new CareTeamComponent();
          if (this.careTeam == null)
            this.careTeam = new ArrayList<CareTeamComponent>();
          this.careTeam.add(t);
          return t;
        }

        public ItemComponent addCareTeam(CareTeamComponent t) { //3
          if (t == null)
            return this;
          if (this.careTeam == null)
            this.careTeam = new ArrayList<CareTeamComponent>();
          this.careTeam.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #careTeam}, creating it if it does not already exist
         */
        public CareTeamComponent getCareTeamFirstRep() { 
          if (getCareTeam().isEmpty()) {
            addCareTeam();
          }
          return getCareTeam().get(0);
        }

        /**
         * @return {@link #diagnosisLinkId} (Diagnosis applicable for this service or product line.)
         */
        public List<PositiveIntType> getDiagnosisLinkId() { 
          if (this.diagnosisLinkId == null)
            this.diagnosisLinkId = new ArrayList<PositiveIntType>();
          return this.diagnosisLinkId;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ItemComponent setDiagnosisLinkId(List<PositiveIntType> theDiagnosisLinkId) { 
          this.diagnosisLinkId = theDiagnosisLinkId;
          return this;
        }

        public boolean hasDiagnosisLinkId() { 
          if (this.diagnosisLinkId == null)
            return false;
          for (PositiveIntType item : this.diagnosisLinkId)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #diagnosisLinkId} (Diagnosis applicable for this service or product line.)
         */
        public PositiveIntType addDiagnosisLinkIdElement() {//2 
          PositiveIntType t = new PositiveIntType();
          if (this.diagnosisLinkId == null)
            this.diagnosisLinkId = new ArrayList<PositiveIntType>();
          this.diagnosisLinkId.add(t);
          return t;
        }

        /**
         * @param value {@link #diagnosisLinkId} (Diagnosis applicable for this service or product line.)
         */
        public ItemComponent addDiagnosisLinkId(int value) { //1
          PositiveIntType t = new PositiveIntType();
          t.setValue(value);
          if (this.diagnosisLinkId == null)
            this.diagnosisLinkId = new ArrayList<PositiveIntType>();
          this.diagnosisLinkId.add(t);
          return this;
        }

        /**
         * @param value {@link #diagnosisLinkId} (Diagnosis applicable for this service or product line.)
         */
        public boolean hasDiagnosisLinkId(int value) { 
          if (this.diagnosisLinkId == null)
            return false;
          for (PositiveIntType v : this.diagnosisLinkId)
            if (v.equals(value)) // positiveInt
              return true;
          return false;
        }

        /**
         * @return {@link #revenue} (The type of reveneu or cost center providing the product and/or service.)
         */
        public Coding getRevenue() { 
          if (this.revenue == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.revenue");
            else if (Configuration.doAutoCreate())
              this.revenue = new Coding(); // cc
          return this.revenue;
        }

        public boolean hasRevenue() { 
          return this.revenue != null && !this.revenue.isEmpty();
        }

        /**
         * @param value {@link #revenue} (The type of reveneu or cost center providing the product and/or service.)
         */
        public ItemComponent setRevenue(Coding value) { 
          this.revenue = value;
          return this;
        }

        /**
         * @return {@link #category} (Health Care Service Type Codes  to identify the classification of service or benefits.)
         */
        public Coding getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new Coding(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (Health Care Service Type Codes  to identify the classification of service or benefits.)
         */
        public ItemComponent setCategory(Coding value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #service} (If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.)
         */
        public Coding getService() { 
          if (this.service == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.service");
            else if (Configuration.doAutoCreate())
              this.service = new Coding(); // cc
          return this.service;
        }

        public boolean hasService() { 
          return this.service != null && !this.service.isEmpty();
        }

        /**
         * @param value {@link #service} (If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.)
         */
        public ItemComponent setService(Coding value) { 
          this.service = value;
          return this;
        }

        /**
         * @return {@link #modifier} (Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.)
         */
        public List<Coding> getModifier() { 
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          return this.modifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ItemComponent setModifier(List<Coding> theModifier) { 
          this.modifier = theModifier;
          return this;
        }

        public boolean hasModifier() { 
          if (this.modifier == null)
            return false;
          for (Coding item : this.modifier)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addModifier() { //3
          Coding t = new Coding();
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          this.modifier.add(t);
          return t;
        }

        public ItemComponent addModifier(Coding t) { //3
          if (t == null)
            return this;
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          this.modifier.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #modifier}, creating it if it does not already exist
         */
        public Coding getModifierFirstRep() { 
          if (getModifier().isEmpty()) {
            addModifier();
          }
          return getModifier().get(0);
        }

        /**
         * @return {@link #programCode} (For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program.)
         */
        public List<Coding> getProgramCode() { 
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          return this.programCode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ItemComponent setProgramCode(List<Coding> theProgramCode) { 
          this.programCode = theProgramCode;
          return this;
        }

        public boolean hasProgramCode() { 
          if (this.programCode == null)
            return false;
          for (Coding item : this.programCode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addProgramCode() { //3
          Coding t = new Coding();
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          this.programCode.add(t);
          return t;
        }

        public ItemComponent addProgramCode(Coding t) { //3
          if (t == null)
            return this;
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          this.programCode.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #programCode}, creating it if it does not already exist
         */
        public Coding getProgramCodeFirstRep() { 
          if (getProgramCode().isEmpty()) {
            addProgramCode();
          }
          return getProgramCode().get(0);
        }

        /**
         * @return {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
         */
        public Type getServiced() { 
          return this.serviced;
        }

        /**
         * @return {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
         */
        public DateType getServicedDateType() throws FHIRException { 
          if (!(this.serviced instanceof DateType))
            throw new FHIRException("Type mismatch: the type DateType was expected, but "+this.serviced.getClass().getName()+" was encountered");
          return (DateType) this.serviced;
        }

        public boolean hasServicedDateType() { 
          return this.serviced instanceof DateType;
        }

        /**
         * @return {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
         */
        public Period getServicedPeriod() throws FHIRException { 
          if (!(this.serviced instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but "+this.serviced.getClass().getName()+" was encountered");
          return (Period) this.serviced;
        }

        public boolean hasServicedPeriod() { 
          return this.serviced instanceof Period;
        }

        public boolean hasServiced() { 
          return this.serviced != null && !this.serviced.isEmpty();
        }

        /**
         * @param value {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
         */
        public ItemComponent setServiced(Type value) { 
          this.serviced = value;
          return this;
        }

        /**
         * @return {@link #location} (Where the service was provided.)
         */
        public Type getLocation() { 
          return this.location;
        }

        /**
         * @return {@link #location} (Where the service was provided.)
         */
        public Coding getLocationCoding() throws FHIRException { 
          if (!(this.location instanceof Coding))
            throw new FHIRException("Type mismatch: the type Coding was expected, but "+this.location.getClass().getName()+" was encountered");
          return (Coding) this.location;
        }

        public boolean hasLocationCoding() { 
          return this.location instanceof Coding;
        }

        /**
         * @return {@link #location} (Where the service was provided.)
         */
        public Address getLocationAddress() throws FHIRException { 
          if (!(this.location instanceof Address))
            throw new FHIRException("Type mismatch: the type Address was expected, but "+this.location.getClass().getName()+" was encountered");
          return (Address) this.location;
        }

        public boolean hasLocationAddress() { 
          return this.location instanceof Address;
        }

        /**
         * @return {@link #location} (Where the service was provided.)
         */
        public Reference getLocationReference() throws FHIRException { 
          if (!(this.location instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.location.getClass().getName()+" was encountered");
          return (Reference) this.location;
        }

        public boolean hasLocationReference() { 
          return this.location instanceof Reference;
        }

        public boolean hasLocation() { 
          return this.location != null && !this.location.isEmpty();
        }

        /**
         * @param value {@link #location} (Where the service was provided.)
         */
        public ItemComponent setLocation(Type value) { 
          this.location = value;
          return this;
        }

        /**
         * @return {@link #quantity} (The number of repetitions of a service or product.)
         */
        public SimpleQuantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new SimpleQuantity(); // cc
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (The number of repetitions of a service or product.)
         */
        public ItemComponent setQuantity(SimpleQuantity value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #unitPrice} (If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.)
         */
        public Money getUnitPrice() { 
          if (this.unitPrice == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.unitPrice");
            else if (Configuration.doAutoCreate())
              this.unitPrice = new Money(); // cc
          return this.unitPrice;
        }

        public boolean hasUnitPrice() { 
          return this.unitPrice != null && !this.unitPrice.isEmpty();
        }

        /**
         * @param value {@link #unitPrice} (If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.)
         */
        public ItemComponent setUnitPrice(Money value) { 
          this.unitPrice = value;
          return this;
        }

        /**
         * @return {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
         */
        public DecimalType getFactorElement() { 
          if (this.factor == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.factor");
            else if (Configuration.doAutoCreate())
              this.factor = new DecimalType(); // bb
          return this.factor;
        }

        public boolean hasFactorElement() { 
          return this.factor != null && !this.factor.isEmpty();
        }

        public boolean hasFactor() { 
          return this.factor != null && !this.factor.isEmpty();
        }

        /**
         * @param value {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
         */
        public ItemComponent setFactorElement(DecimalType value) { 
          this.factor = value;
          return this;
        }

        /**
         * @return A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public BigDecimal getFactor() { 
          return this.factor == null ? null : this.factor.getValue();
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public ItemComponent setFactor(BigDecimal value) { 
          if (value == null)
            this.factor = null;
          else {
            if (this.factor == null)
              this.factor = new DecimalType();
            this.factor.setValue(value);
          }
          return this;
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public ItemComponent setFactor(long value) { 
              this.factor = new DecimalType();
            this.factor.setValue(value);
          return this;
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public ItemComponent setFactor(double value) { 
              this.factor = new DecimalType();
            this.factor.setValue(value);
          return this;
        }

        /**
         * @return {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
         */
        public DecimalType getPointsElement() { 
          if (this.points == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.points");
            else if (Configuration.doAutoCreate())
              this.points = new DecimalType(); // bb
          return this.points;
        }

        public boolean hasPointsElement() { 
          return this.points != null && !this.points.isEmpty();
        }

        public boolean hasPoints() { 
          return this.points != null && !this.points.isEmpty();
        }

        /**
         * @param value {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
         */
        public ItemComponent setPointsElement(DecimalType value) { 
          this.points = value;
          return this;
        }

        /**
         * @return An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public BigDecimal getPoints() { 
          return this.points == null ? null : this.points.getValue();
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public ItemComponent setPoints(BigDecimal value) { 
          if (value == null)
            this.points = null;
          else {
            if (this.points == null)
              this.points = new DecimalType();
            this.points.setValue(value);
          }
          return this;
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public ItemComponent setPoints(long value) { 
              this.points = new DecimalType();
            this.points.setValue(value);
          return this;
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public ItemComponent setPoints(double value) { 
              this.points = new DecimalType();
            this.points.setValue(value);
          return this;
        }

        /**
         * @return {@link #net} (The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
         */
        public Money getNet() { 
          if (this.net == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.net");
            else if (Configuration.doAutoCreate())
              this.net = new Money(); // cc
          return this.net;
        }

        public boolean hasNet() { 
          return this.net != null && !this.net.isEmpty();
        }

        /**
         * @param value {@link #net} (The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
         */
        public ItemComponent setNet(Money value) { 
          this.net = value;
          return this;
        }

        /**
         * @return {@link #udi} (List of Unique Device Identifiers associated with this line item.)
         */
        public List<Reference> getUdi() { 
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          return this.udi;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ItemComponent setUdi(List<Reference> theUdi) { 
          this.udi = theUdi;
          return this;
        }

        public boolean hasUdi() { 
          if (this.udi == null)
            return false;
          for (Reference item : this.udi)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addUdi() { //3
          Reference t = new Reference();
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          this.udi.add(t);
          return t;
        }

        public ItemComponent addUdi(Reference t) { //3
          if (t == null)
            return this;
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          this.udi.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #udi}, creating it if it does not already exist
         */
        public Reference getUdiFirstRep() { 
          if (getUdi().isEmpty()) {
            addUdi();
          }
          return getUdi().get(0);
        }

        /**
         * @deprecated Use Reference#setResource(IBaseResource) instead
         */
        @Deprecated
        public List<Device> getUdiTarget() { 
          if (this.udiTarget == null)
            this.udiTarget = new ArrayList<Device>();
          return this.udiTarget;
        }

        /**
         * @deprecated Use Reference#setResource(IBaseResource) instead
         */
        @Deprecated
        public Device addUdiTarget() { 
          Device r = new Device();
          if (this.udiTarget == null)
            this.udiTarget = new ArrayList<Device>();
          this.udiTarget.add(r);
          return r;
        }

        /**
         * @return {@link #bodySite} (Physical service site on the patient (limb, tooth, etc).)
         */
        public Coding getBodySite() { 
          if (this.bodySite == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.bodySite");
            else if (Configuration.doAutoCreate())
              this.bodySite = new Coding(); // cc
          return this.bodySite;
        }

        public boolean hasBodySite() { 
          return this.bodySite != null && !this.bodySite.isEmpty();
        }

        /**
         * @param value {@link #bodySite} (Physical service site on the patient (limb, tooth, etc).)
         */
        public ItemComponent setBodySite(Coding value) { 
          this.bodySite = value;
          return this;
        }

        /**
         * @return {@link #subSite} (A region or surface of the site, eg. limb region or tooth surface(s).)
         */
        public List<Coding> getSubSite() { 
          if (this.subSite == null)
            this.subSite = new ArrayList<Coding>();
          return this.subSite;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ItemComponent setSubSite(List<Coding> theSubSite) { 
          this.subSite = theSubSite;
          return this;
        }

        public boolean hasSubSite() { 
          if (this.subSite == null)
            return false;
          for (Coding item : this.subSite)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addSubSite() { //3
          Coding t = new Coding();
          if (this.subSite == null)
            this.subSite = new ArrayList<Coding>();
          this.subSite.add(t);
          return t;
        }

        public ItemComponent addSubSite(Coding t) { //3
          if (t == null)
            return this;
          if (this.subSite == null)
            this.subSite = new ArrayList<Coding>();
          this.subSite.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #subSite}, creating it if it does not already exist
         */
        public Coding getSubSiteFirstRep() { 
          if (getSubSite().isEmpty()) {
            addSubSite();
          }
          return getSubSite().get(0);
        }

        /**
         * @return {@link #detail} (Second tier of goods and services.)
         */
        public List<DetailComponent> getDetail() { 
          if (this.detail == null)
            this.detail = new ArrayList<DetailComponent>();
          return this.detail;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ItemComponent setDetail(List<DetailComponent> theDetail) { 
          this.detail = theDetail;
          return this;
        }

        public boolean hasDetail() { 
          if (this.detail == null)
            return false;
          for (DetailComponent item : this.detail)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public DetailComponent addDetail() { //3
          DetailComponent t = new DetailComponent();
          if (this.detail == null)
            this.detail = new ArrayList<DetailComponent>();
          this.detail.add(t);
          return t;
        }

        public ItemComponent addDetail(DetailComponent t) { //3
          if (t == null)
            return this;
          if (this.detail == null)
            this.detail = new ArrayList<DetailComponent>();
          this.detail.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #detail}, creating it if it does not already exist
         */
        public DetailComponent getDetailFirstRep() { 
          if (getDetail().isEmpty()) {
            addDetail();
          }
          return getDetail().get(0);
        }

        /**
         * @return {@link #prosthesis} (The materials and placement date of prior fixed prosthesis.)
         */
        public ProsthesisComponent getProsthesis() { 
          if (this.prosthesis == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ItemComponent.prosthesis");
            else if (Configuration.doAutoCreate())
              this.prosthesis = new ProsthesisComponent(); // cc
          return this.prosthesis;
        }

        public boolean hasProsthesis() { 
          return this.prosthesis != null && !this.prosthesis.isEmpty();
        }

        /**
         * @param value {@link #prosthesis} (The materials and placement date of prior fixed prosthesis.)
         */
        public ItemComponent setProsthesis(ProsthesisComponent value) { 
          this.prosthesis = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("sequence", "positiveInt", "A service line number.", 0, java.lang.Integer.MAX_VALUE, sequence));
          childrenList.add(new Property("careTeam", "", "The members of the team who provided the overall service as well as their role and whether responsible and qualifications.", 0, java.lang.Integer.MAX_VALUE, careTeam));
          childrenList.add(new Property("diagnosisLinkId", "positiveInt", "Diagnosis applicable for this service or product line.", 0, java.lang.Integer.MAX_VALUE, diagnosisLinkId));
          childrenList.add(new Property("revenue", "Coding", "The type of reveneu or cost center providing the product and/or service.", 0, java.lang.Integer.MAX_VALUE, revenue));
          childrenList.add(new Property("category", "Coding", "Health Care Service Type Codes  to identify the classification of service or benefits.", 0, java.lang.Integer.MAX_VALUE, category));
          childrenList.add(new Property("service", "Coding", "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.", 0, java.lang.Integer.MAX_VALUE, service));
          childrenList.add(new Property("modifier", "Coding", "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.", 0, java.lang.Integer.MAX_VALUE, modifier));
          childrenList.add(new Property("programCode", "Coding", "For programs which require reason codes for the inclusion or covering of this billed item under the program or sub-program.", 0, java.lang.Integer.MAX_VALUE, programCode));
          childrenList.add(new Property("serviced[x]", "date|Period", "The date or dates when the enclosed suite of services were performed or completed.", 0, java.lang.Integer.MAX_VALUE, serviced));
          childrenList.add(new Property("location[x]", "Coding|Address|Reference(Location)", "Where the service was provided.", 0, java.lang.Integer.MAX_VALUE, location));
          childrenList.add(new Property("quantity", "SimpleQuantity", "The number of repetitions of a service or product.", 0, java.lang.Integer.MAX_VALUE, quantity));
          childrenList.add(new Property("unitPrice", "Money", "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.", 0, java.lang.Integer.MAX_VALUE, unitPrice));
          childrenList.add(new Property("factor", "decimal", "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.", 0, java.lang.Integer.MAX_VALUE, factor));
          childrenList.add(new Property("points", "decimal", "An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.", 0, java.lang.Integer.MAX_VALUE, points));
          childrenList.add(new Property("net", "Money", "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.", 0, java.lang.Integer.MAX_VALUE, net));
          childrenList.add(new Property("udi", "Reference(Device)", "List of Unique Device Identifiers associated with this line item.", 0, java.lang.Integer.MAX_VALUE, udi));
          childrenList.add(new Property("bodySite", "Coding", "Physical service site on the patient (limb, tooth, etc).", 0, java.lang.Integer.MAX_VALUE, bodySite));
          childrenList.add(new Property("subSite", "Coding", "A region or surface of the site, eg. limb region or tooth surface(s).", 0, java.lang.Integer.MAX_VALUE, subSite));
          childrenList.add(new Property("detail", "", "Second tier of goods and services.", 0, java.lang.Integer.MAX_VALUE, detail));
          childrenList.add(new Property("prosthesis", "", "The materials and placement date of prior fixed prosthesis.", 0, java.lang.Integer.MAX_VALUE, prosthesis));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return this.sequence == null ? new Base[0] : new Base[] {this.sequence}; // PositiveIntType
        case -7323378: /*careTeam*/ return this.careTeam == null ? new Base[0] : this.careTeam.toArray(new Base[this.careTeam.size()]); // CareTeamComponent
        case -1659207418: /*diagnosisLinkId*/ return this.diagnosisLinkId == null ? new Base[0] : this.diagnosisLinkId.toArray(new Base[this.diagnosisLinkId.size()]); // PositiveIntType
        case 1099842588: /*revenue*/ return this.revenue == null ? new Base[0] : new Base[] {this.revenue}; // Coding
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // Coding
        case 1984153269: /*service*/ return this.service == null ? new Base[0] : new Base[] {this.service}; // Coding
        case -615513385: /*modifier*/ return this.modifier == null ? new Base[0] : this.modifier.toArray(new Base[this.modifier.size()]); // Coding
        case 1010065041: /*programCode*/ return this.programCode == null ? new Base[0] : this.programCode.toArray(new Base[this.programCode.size()]); // Coding
        case 1379209295: /*serviced*/ return this.serviced == null ? new Base[0] : new Base[] {this.serviced}; // Type
        case 1901043637: /*location*/ return this.location == null ? new Base[0] : new Base[] {this.location}; // Type
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // SimpleQuantity
        case -486196699: /*unitPrice*/ return this.unitPrice == null ? new Base[0] : new Base[] {this.unitPrice}; // Money
        case -1282148017: /*factor*/ return this.factor == null ? new Base[0] : new Base[] {this.factor}; // DecimalType
        case -982754077: /*points*/ return this.points == null ? new Base[0] : new Base[] {this.points}; // DecimalType
        case 108957: /*net*/ return this.net == null ? new Base[0] : new Base[] {this.net}; // Money
        case 115642: /*udi*/ return this.udi == null ? new Base[0] : this.udi.toArray(new Base[this.udi.size()]); // Reference
        case 1702620169: /*bodySite*/ return this.bodySite == null ? new Base[0] : new Base[] {this.bodySite}; // Coding
        case -1868566105: /*subSite*/ return this.subSite == null ? new Base[0] : this.subSite.toArray(new Base[this.subSite.size()]); // Coding
        case -1335224239: /*detail*/ return this.detail == null ? new Base[0] : this.detail.toArray(new Base[this.detail.size()]); // DetailComponent
        case -2138744398: /*prosthesis*/ return this.prosthesis == null ? new Base[0] : new Base[] {this.prosthesis}; // ProsthesisComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1349547969: // sequence
          this.sequence = castToPositiveInt(value); // PositiveIntType
          break;
        case -7323378: // careTeam
          this.getCareTeam().add((CareTeamComponent) value); // CareTeamComponent
          break;
        case -1659207418: // diagnosisLinkId
          this.getDiagnosisLinkId().add(castToPositiveInt(value)); // PositiveIntType
          break;
        case 1099842588: // revenue
          this.revenue = castToCoding(value); // Coding
          break;
        case 50511102: // category
          this.category = castToCoding(value); // Coding
          break;
        case 1984153269: // service
          this.service = castToCoding(value); // Coding
          break;
        case -615513385: // modifier
          this.getModifier().add(castToCoding(value)); // Coding
          break;
        case 1010065041: // programCode
          this.getProgramCode().add(castToCoding(value)); // Coding
          break;
        case 1379209295: // serviced
          this.serviced = castToType(value); // Type
          break;
        case 1901043637: // location
          this.location = castToType(value); // Type
          break;
        case -1285004149: // quantity
          this.quantity = castToSimpleQuantity(value); // SimpleQuantity
          break;
        case -486196699: // unitPrice
          this.unitPrice = castToMoney(value); // Money
          break;
        case -1282148017: // factor
          this.factor = castToDecimal(value); // DecimalType
          break;
        case -982754077: // points
          this.points = castToDecimal(value); // DecimalType
          break;
        case 108957: // net
          this.net = castToMoney(value); // Money
          break;
        case 115642: // udi
          this.getUdi().add(castToReference(value)); // Reference
          break;
        case 1702620169: // bodySite
          this.bodySite = castToCoding(value); // Coding
          break;
        case -1868566105: // subSite
          this.getSubSite().add(castToCoding(value)); // Coding
          break;
        case -1335224239: // detail
          this.getDetail().add((DetailComponent) value); // DetailComponent
          break;
        case -2138744398: // prosthesis
          this.prosthesis = (ProsthesisComponent) value; // ProsthesisComponent
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
          this.sequence = castToPositiveInt(value); // PositiveIntType
        else if (name.equals("careTeam"))
          this.getCareTeam().add((CareTeamComponent) value);
        else if (name.equals("diagnosisLinkId"))
          this.getDiagnosisLinkId().add(castToPositiveInt(value));
        else if (name.equals("revenue"))
          this.revenue = castToCoding(value); // Coding
        else if (name.equals("category"))
          this.category = castToCoding(value); // Coding
        else if (name.equals("service"))
          this.service = castToCoding(value); // Coding
        else if (name.equals("modifier"))
          this.getModifier().add(castToCoding(value));
        else if (name.equals("programCode"))
          this.getProgramCode().add(castToCoding(value));
        else if (name.equals("serviced[x]"))
          this.serviced = castToType(value); // Type
        else if (name.equals("location[x]"))
          this.location = castToType(value); // Type
        else if (name.equals("quantity"))
          this.quantity = castToSimpleQuantity(value); // SimpleQuantity
        else if (name.equals("unitPrice"))
          this.unitPrice = castToMoney(value); // Money
        else if (name.equals("factor"))
          this.factor = castToDecimal(value); // DecimalType
        else if (name.equals("points"))
          this.points = castToDecimal(value); // DecimalType
        else if (name.equals("net"))
          this.net = castToMoney(value); // Money
        else if (name.equals("udi"))
          this.getUdi().add(castToReference(value));
        else if (name.equals("bodySite"))
          this.bodySite = castToCoding(value); // Coding
        else if (name.equals("subSite"))
          this.getSubSite().add(castToCoding(value));
        else if (name.equals("detail"))
          this.getDetail().add((DetailComponent) value);
        else if (name.equals("prosthesis"))
          this.prosthesis = (ProsthesisComponent) value; // ProsthesisComponent
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969: throw new FHIRException("Cannot make property sequence as it is not a complex type"); // PositiveIntType
        case -7323378:  return addCareTeam(); // CareTeamComponent
        case -1659207418: throw new FHIRException("Cannot make property diagnosisLinkId as it is not a complex type"); // PositiveIntType
        case 1099842588:  return getRevenue(); // Coding
        case 50511102:  return getCategory(); // Coding
        case 1984153269:  return getService(); // Coding
        case -615513385:  return addModifier(); // Coding
        case 1010065041:  return addProgramCode(); // Coding
        case -1927922223:  return getServiced(); // Type
        case 552316075:  return getLocation(); // Type
        case -1285004149:  return getQuantity(); // SimpleQuantity
        case -486196699:  return getUnitPrice(); // Money
        case -1282148017: throw new FHIRException("Cannot make property factor as it is not a complex type"); // DecimalType
        case -982754077: throw new FHIRException("Cannot make property points as it is not a complex type"); // DecimalType
        case 108957:  return getNet(); // Money
        case 115642:  return addUdi(); // Reference
        case 1702620169:  return getBodySite(); // Coding
        case -1868566105:  return addSubSite(); // Coding
        case -1335224239:  return addDetail(); // DetailComponent
        case -2138744398:  return getProsthesis(); // ProsthesisComponent
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        }
        else if (name.equals("careTeam")) {
          return addCareTeam();
        }
        else if (name.equals("diagnosisLinkId")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.diagnosisLinkId");
        }
        else if (name.equals("revenue")) {
          this.revenue = new Coding();
          return this.revenue;
        }
        else if (name.equals("category")) {
          this.category = new Coding();
          return this.category;
        }
        else if (name.equals("service")) {
          this.service = new Coding();
          return this.service;
        }
        else if (name.equals("modifier")) {
          return addModifier();
        }
        else if (name.equals("programCode")) {
          return addProgramCode();
        }
        else if (name.equals("servicedDate")) {
          this.serviced = new DateType();
          return this.serviced;
        }
        else if (name.equals("servicedPeriod")) {
          this.serviced = new Period();
          return this.serviced;
        }
        else if (name.equals("locationCoding")) {
          this.location = new Coding();
          return this.location;
        }
        else if (name.equals("locationAddress")) {
          this.location = new Address();
          return this.location;
        }
        else if (name.equals("locationReference")) {
          this.location = new Reference();
          return this.location;
        }
        else if (name.equals("quantity")) {
          this.quantity = new SimpleQuantity();
          return this.quantity;
        }
        else if (name.equals("unitPrice")) {
          this.unitPrice = new Money();
          return this.unitPrice;
        }
        else if (name.equals("factor")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.factor");
        }
        else if (name.equals("points")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.points");
        }
        else if (name.equals("net")) {
          this.net = new Money();
          return this.net;
        }
        else if (name.equals("udi")) {
          return addUdi();
        }
        else if (name.equals("bodySite")) {
          this.bodySite = new Coding();
          return this.bodySite;
        }
        else if (name.equals("subSite")) {
          return addSubSite();
        }
        else if (name.equals("detail")) {
          return addDetail();
        }
        else if (name.equals("prosthesis")) {
          this.prosthesis = new ProsthesisComponent();
          return this.prosthesis;
        }
        else
          return super.addChild(name);
      }

      public ItemComponent copy() {
        ItemComponent dst = new ItemComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        if (careTeam != null) {
          dst.careTeam = new ArrayList<CareTeamComponent>();
          for (CareTeamComponent i : careTeam)
            dst.careTeam.add(i.copy());
        };
        if (diagnosisLinkId != null) {
          dst.diagnosisLinkId = new ArrayList<PositiveIntType>();
          for (PositiveIntType i : diagnosisLinkId)
            dst.diagnosisLinkId.add(i.copy());
        };
        dst.revenue = revenue == null ? null : revenue.copy();
        dst.category = category == null ? null : category.copy();
        dst.service = service == null ? null : service.copy();
        if (modifier != null) {
          dst.modifier = new ArrayList<Coding>();
          for (Coding i : modifier)
            dst.modifier.add(i.copy());
        };
        if (programCode != null) {
          dst.programCode = new ArrayList<Coding>();
          for (Coding i : programCode)
            dst.programCode.add(i.copy());
        };
        dst.serviced = serviced == null ? null : serviced.copy();
        dst.location = location == null ? null : location.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.unitPrice = unitPrice == null ? null : unitPrice.copy();
        dst.factor = factor == null ? null : factor.copy();
        dst.points = points == null ? null : points.copy();
        dst.net = net == null ? null : net.copy();
        if (udi != null) {
          dst.udi = new ArrayList<Reference>();
          for (Reference i : udi)
            dst.udi.add(i.copy());
        };
        dst.bodySite = bodySite == null ? null : bodySite.copy();
        if (subSite != null) {
          dst.subSite = new ArrayList<Coding>();
          for (Coding i : subSite)
            dst.subSite.add(i.copy());
        };
        if (detail != null) {
          dst.detail = new ArrayList<DetailComponent>();
          for (DetailComponent i : detail)
            dst.detail.add(i.copy());
        };
        dst.prosthesis = prosthesis == null ? null : prosthesis.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ItemComponent))
          return false;
        ItemComponent o = (ItemComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(careTeam, o.careTeam, true) && compareDeep(diagnosisLinkId, o.diagnosisLinkId, true)
           && compareDeep(revenue, o.revenue, true) && compareDeep(category, o.category, true) && compareDeep(service, o.service, true)
           && compareDeep(modifier, o.modifier, true) && compareDeep(programCode, o.programCode, true) && compareDeep(serviced, o.serviced, true)
           && compareDeep(location, o.location, true) && compareDeep(quantity, o.quantity, true) && compareDeep(unitPrice, o.unitPrice, true)
           && compareDeep(factor, o.factor, true) && compareDeep(points, o.points, true) && compareDeep(net, o.net, true)
           && compareDeep(udi, o.udi, true) && compareDeep(bodySite, o.bodySite, true) && compareDeep(subSite, o.subSite, true)
           && compareDeep(detail, o.detail, true) && compareDeep(prosthesis, o.prosthesis, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ItemComponent))
          return false;
        ItemComponent o = (ItemComponent) other;
        return compareValues(sequence, o.sequence, true) && compareValues(diagnosisLinkId, o.diagnosisLinkId, true)
           && compareValues(factor, o.factor, true) && compareValues(points, o.points, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(sequence, careTeam, diagnosisLinkId
          , revenue, category, service, modifier, programCode, serviced, location, quantity
          , unitPrice, factor, points, net, udi, bodySite, subSite, detail, prosthesis
          );
      }

  public String fhirType() {
    return "Claim.item";

  }

  }

    @Block()
    public static class CareTeamComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Member of the team who provided the overall service.
         */
        @Child(name = "provider", type = {Practitioner.class, Organization.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Provider individual or organization", formalDefinition="Member of the team who provided the overall service." )
        protected Reference provider;

        /**
         * The actual object that is the target of the reference (Member of the team who provided the overall service.)
         */
        protected Resource providerTarget;

        /**
         * The party who is billing and responsible for the claimed good or service rendered to the patient.
         */
        @Child(name = "responsible", type = {BooleanType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Billing provider", formalDefinition="The party who is billing and responsible for the claimed good or service rendered to the patient." )
        protected BooleanType responsible;

        /**
         * The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.
         */
        @Child(name = "role", type = {Coding.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Role on the team", formalDefinition="The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-careteamrole")
        protected Coding role;

        /**
         * The qualification which is applicable for this service.
         */
        @Child(name = "qualification", type = {Coding.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type, classification or Specialization", formalDefinition="The qualification which is applicable for this service." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/provider-qualification")
        protected Coding qualification;

        private static final long serialVersionUID = 2022321671L;

    /**
     * Constructor
     */
      public CareTeamComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CareTeamComponent(Reference provider) {
        super();
        this.provider = provider;
      }

        /**
         * @return {@link #provider} (Member of the team who provided the overall service.)
         */
        public Reference getProvider() { 
          if (this.provider == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CareTeamComponent.provider");
            else if (Configuration.doAutoCreate())
              this.provider = new Reference(); // cc
          return this.provider;
        }

        public boolean hasProvider() { 
          return this.provider != null && !this.provider.isEmpty();
        }

        /**
         * @param value {@link #provider} (Member of the team who provided the overall service.)
         */
        public CareTeamComponent setProvider(Reference value) { 
          this.provider = value;
          return this;
        }

        /**
         * @return {@link #provider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Member of the team who provided the overall service.)
         */
        public Resource getProviderTarget() { 
          return this.providerTarget;
        }

        /**
         * @param value {@link #provider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Member of the team who provided the overall service.)
         */
        public CareTeamComponent setProviderTarget(Resource value) { 
          this.providerTarget = value;
          return this;
        }

        /**
         * @return {@link #responsible} (The party who is billing and responsible for the claimed good or service rendered to the patient.). This is the underlying object with id, value and extensions. The accessor "getResponsible" gives direct access to the value
         */
        public BooleanType getResponsibleElement() { 
          if (this.responsible == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CareTeamComponent.responsible");
            else if (Configuration.doAutoCreate())
              this.responsible = new BooleanType(); // bb
          return this.responsible;
        }

        public boolean hasResponsibleElement() { 
          return this.responsible != null && !this.responsible.isEmpty();
        }

        public boolean hasResponsible() { 
          return this.responsible != null && !this.responsible.isEmpty();
        }

        /**
         * @param value {@link #responsible} (The party who is billing and responsible for the claimed good or service rendered to the patient.). This is the underlying object with id, value and extensions. The accessor "getResponsible" gives direct access to the value
         */
        public CareTeamComponent setResponsibleElement(BooleanType value) { 
          this.responsible = value;
          return this;
        }

        /**
         * @return The party who is billing and responsible for the claimed good or service rendered to the patient.
         */
        public boolean getResponsible() { 
          return this.responsible == null || this.responsible.isEmpty() ? false : this.responsible.getValue();
        }

        /**
         * @param value The party who is billing and responsible for the claimed good or service rendered to the patient.
         */
        public CareTeamComponent setResponsible(boolean value) { 
            if (this.responsible == null)
              this.responsible = new BooleanType();
            this.responsible.setValue(value);
          return this;
        }

        /**
         * @return {@link #role} (The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.)
         */
        public Coding getRole() { 
          if (this.role == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CareTeamComponent.role");
            else if (Configuration.doAutoCreate())
              this.role = new Coding(); // cc
          return this.role;
        }

        public boolean hasRole() { 
          return this.role != null && !this.role.isEmpty();
        }

        /**
         * @param value {@link #role} (The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.)
         */
        public CareTeamComponent setRole(Coding value) { 
          this.role = value;
          return this;
        }

        /**
         * @return {@link #qualification} (The qualification which is applicable for this service.)
         */
        public Coding getQualification() { 
          if (this.qualification == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CareTeamComponent.qualification");
            else if (Configuration.doAutoCreate())
              this.qualification = new Coding(); // cc
          return this.qualification;
        }

        public boolean hasQualification() { 
          return this.qualification != null && !this.qualification.isEmpty();
        }

        /**
         * @param value {@link #qualification} (The qualification which is applicable for this service.)
         */
        public CareTeamComponent setQualification(Coding value) { 
          this.qualification = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("provider", "Reference(Practitioner|Organization)", "Member of the team who provided the overall service.", 0, java.lang.Integer.MAX_VALUE, provider));
          childrenList.add(new Property("responsible", "boolean", "The party who is billing and responsible for the claimed good or service rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, responsible));
          childrenList.add(new Property("role", "Coding", "The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.", 0, java.lang.Integer.MAX_VALUE, role));
          childrenList.add(new Property("qualification", "Coding", "The qualification which is applicable for this service.", 0, java.lang.Integer.MAX_VALUE, qualification));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -987494927: /*provider*/ return this.provider == null ? new Base[0] : new Base[] {this.provider}; // Reference
        case 1847674614: /*responsible*/ return this.responsible == null ? new Base[0] : new Base[] {this.responsible}; // BooleanType
        case 3506294: /*role*/ return this.role == null ? new Base[0] : new Base[] {this.role}; // Coding
        case -631333393: /*qualification*/ return this.qualification == null ? new Base[0] : new Base[] {this.qualification}; // Coding
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -987494927: // provider
          this.provider = castToReference(value); // Reference
          break;
        case 1847674614: // responsible
          this.responsible = castToBoolean(value); // BooleanType
          break;
        case 3506294: // role
          this.role = castToCoding(value); // Coding
          break;
        case -631333393: // qualification
          this.qualification = castToCoding(value); // Coding
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("provider"))
          this.provider = castToReference(value); // Reference
        else if (name.equals("responsible"))
          this.responsible = castToBoolean(value); // BooleanType
        else if (name.equals("role"))
          this.role = castToCoding(value); // Coding
        else if (name.equals("qualification"))
          this.qualification = castToCoding(value); // Coding
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -987494927:  return getProvider(); // Reference
        case 1847674614: throw new FHIRException("Cannot make property responsible as it is not a complex type"); // BooleanType
        case 3506294:  return getRole(); // Coding
        case -631333393:  return getQualification(); // Coding
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("provider")) {
          this.provider = new Reference();
          return this.provider;
        }
        else if (name.equals("responsible")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.responsible");
        }
        else if (name.equals("role")) {
          this.role = new Coding();
          return this.role;
        }
        else if (name.equals("qualification")) {
          this.qualification = new Coding();
          return this.qualification;
        }
        else
          return super.addChild(name);
      }

      public CareTeamComponent copy() {
        CareTeamComponent dst = new CareTeamComponent();
        copyValues(dst);
        dst.provider = provider == null ? null : provider.copy();
        dst.responsible = responsible == null ? null : responsible.copy();
        dst.role = role == null ? null : role.copy();
        dst.qualification = qualification == null ? null : qualification.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof CareTeamComponent))
          return false;
        CareTeamComponent o = (CareTeamComponent) other;
        return compareDeep(provider, o.provider, true) && compareDeep(responsible, o.responsible, true)
           && compareDeep(role, o.role, true) && compareDeep(qualification, o.qualification, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof CareTeamComponent))
          return false;
        CareTeamComponent o = (CareTeamComponent) other;
        return compareValues(responsible, o.responsible, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(provider, responsible, role
          , qualification);
      }

  public String fhirType() {
    return "Claim.item.careTeam";

  }

  }

    @Block()
    public static class DetailComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A service line number.
         */
        @Child(name = "sequence", type = {PositiveIntType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Service instance", formalDefinition="A service line number." )
        protected PositiveIntType sequence;

        /**
         * The type of reveneu or cost center providing the product and/or service.
         */
        @Child(name = "revenue", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Revenue or cost center code", formalDefinition="The type of reveneu or cost center providing the product and/or service." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-revenue-center")
        protected Coding revenue;

        /**
         * Health Care Service Type Codes  to identify the classification of service or benefits.
         */
        @Child(name = "category", type = {Coding.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of service or product", formalDefinition="Health Care Service Type Codes  to identify the classification of service or benefits." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-subcategory")
        protected Coding category;

        /**
         * If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
         */
        @Child(name = "service", type = {Coding.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Billing Code", formalDefinition="If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/service-uscls")
        protected Coding service;

        /**
         * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
         */
        @Child(name = "modifier", type = {Coding.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Service/Product billing modifiers", formalDefinition="Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-modifiers")
        protected List<Coding> modifier;

        /**
         * For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.
         */
        @Child(name = "programCode", type = {Coding.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Program specific reason for item inclusion", formalDefinition="For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-program-code")
        protected List<Coding> programCode;

        /**
         * The number of repetitions of a service or product.
         */
        @Child(name = "quantity", type = {SimpleQuantity.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Count of Products or Services", formalDefinition="The number of repetitions of a service or product." )
        protected SimpleQuantity quantity;

        /**
         * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
         */
        @Child(name = "unitPrice", type = {Money.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fee, charge or cost per point", formalDefinition="If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group." )
        protected Money unitPrice;

        /**
         * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        @Child(name = "factor", type = {DecimalType.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Price scaling factor", formalDefinition="A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount." )
        protected DecimalType factor;

        /**
         * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        @Child(name = "points", type = {DecimalType.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Difficulty scaling factor", formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point." )
        protected DecimalType points;

        /**
         * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
         */
        @Child(name = "net", type = {Money.class}, order=11, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Total additional item cost", formalDefinition="The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied." )
        protected Money net;

        /**
         * List of Unique Device Identifiers associated with this line item.
         */
        @Child(name = "udi", type = {Device.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Unique Device Identifier", formalDefinition="List of Unique Device Identifiers associated with this line item." )
        protected List<Reference> udi;
        /**
         * The actual objects that are the target of the reference (List of Unique Device Identifiers associated with this line item.)
         */
        protected List<Device> udiTarget;


        /**
         * Third tier of goods and services.
         */
        @Child(name = "subDetail", type = {}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Additional items", formalDefinition="Third tier of goods and services." )
        protected List<SubDetailComponent> subDetail;

        private static final long serialVersionUID = -753919335L;

    /**
     * Constructor
     */
      public DetailComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DetailComponent(PositiveIntType sequence) {
        super();
        this.sequence = sequence;
      }

        /**
         * @return {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public PositiveIntType getSequenceElement() { 
          if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.sequence");
            else if (Configuration.doAutoCreate())
              this.sequence = new PositiveIntType(); // bb
          return this.sequence;
        }

        public boolean hasSequenceElement() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasSequence() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        /**
         * @param value {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public DetailComponent setSequenceElement(PositiveIntType value) { 
          this.sequence = value;
          return this;
        }

        /**
         * @return A service line number.
         */
        public int getSequence() { 
          return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
        }

        /**
         * @param value A service line number.
         */
        public DetailComponent setSequence(int value) { 
            if (this.sequence == null)
              this.sequence = new PositiveIntType();
            this.sequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #revenue} (The type of reveneu or cost center providing the product and/or service.)
         */
        public Coding getRevenue() { 
          if (this.revenue == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.revenue");
            else if (Configuration.doAutoCreate())
              this.revenue = new Coding(); // cc
          return this.revenue;
        }

        public boolean hasRevenue() { 
          return this.revenue != null && !this.revenue.isEmpty();
        }

        /**
         * @param value {@link #revenue} (The type of reveneu or cost center providing the product and/or service.)
         */
        public DetailComponent setRevenue(Coding value) { 
          this.revenue = value;
          return this;
        }

        /**
         * @return {@link #category} (Health Care Service Type Codes  to identify the classification of service or benefits.)
         */
        public Coding getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new Coding(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (Health Care Service Type Codes  to identify the classification of service or benefits.)
         */
        public DetailComponent setCategory(Coding value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #service} (If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.)
         */
        public Coding getService() { 
          if (this.service == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.service");
            else if (Configuration.doAutoCreate())
              this.service = new Coding(); // cc
          return this.service;
        }

        public boolean hasService() { 
          return this.service != null && !this.service.isEmpty();
        }

        /**
         * @param value {@link #service} (If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.)
         */
        public DetailComponent setService(Coding value) { 
          this.service = value;
          return this;
        }

        /**
         * @return {@link #modifier} (Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.)
         */
        public List<Coding> getModifier() { 
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          return this.modifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailComponent setModifier(List<Coding> theModifier) { 
          this.modifier = theModifier;
          return this;
        }

        public boolean hasModifier() { 
          if (this.modifier == null)
            return false;
          for (Coding item : this.modifier)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addModifier() { //3
          Coding t = new Coding();
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          this.modifier.add(t);
          return t;
        }

        public DetailComponent addModifier(Coding t) { //3
          if (t == null)
            return this;
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          this.modifier.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #modifier}, creating it if it does not already exist
         */
        public Coding getModifierFirstRep() { 
          if (getModifier().isEmpty()) {
            addModifier();
          }
          return getModifier().get(0);
        }

        /**
         * @return {@link #programCode} (For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.)
         */
        public List<Coding> getProgramCode() { 
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          return this.programCode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailComponent setProgramCode(List<Coding> theProgramCode) { 
          this.programCode = theProgramCode;
          return this;
        }

        public boolean hasProgramCode() { 
          if (this.programCode == null)
            return false;
          for (Coding item : this.programCode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addProgramCode() { //3
          Coding t = new Coding();
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          this.programCode.add(t);
          return t;
        }

        public DetailComponent addProgramCode(Coding t) { //3
          if (t == null)
            return this;
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          this.programCode.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #programCode}, creating it if it does not already exist
         */
        public Coding getProgramCodeFirstRep() { 
          if (getProgramCode().isEmpty()) {
            addProgramCode();
          }
          return getProgramCode().get(0);
        }

        /**
         * @return {@link #quantity} (The number of repetitions of a service or product.)
         */
        public SimpleQuantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new SimpleQuantity(); // cc
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (The number of repetitions of a service or product.)
         */
        public DetailComponent setQuantity(SimpleQuantity value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #unitPrice} (If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.)
         */
        public Money getUnitPrice() { 
          if (this.unitPrice == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.unitPrice");
            else if (Configuration.doAutoCreate())
              this.unitPrice = new Money(); // cc
          return this.unitPrice;
        }

        public boolean hasUnitPrice() { 
          return this.unitPrice != null && !this.unitPrice.isEmpty();
        }

        /**
         * @param value {@link #unitPrice} (If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.)
         */
        public DetailComponent setUnitPrice(Money value) { 
          this.unitPrice = value;
          return this;
        }

        /**
         * @return {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
         */
        public DecimalType getFactorElement() { 
          if (this.factor == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.factor");
            else if (Configuration.doAutoCreate())
              this.factor = new DecimalType(); // bb
          return this.factor;
        }

        public boolean hasFactorElement() { 
          return this.factor != null && !this.factor.isEmpty();
        }

        public boolean hasFactor() { 
          return this.factor != null && !this.factor.isEmpty();
        }

        /**
         * @param value {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
         */
        public DetailComponent setFactorElement(DecimalType value) { 
          this.factor = value;
          return this;
        }

        /**
         * @return A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public BigDecimal getFactor() { 
          return this.factor == null ? null : this.factor.getValue();
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public DetailComponent setFactor(BigDecimal value) { 
          if (value == null)
            this.factor = null;
          else {
            if (this.factor == null)
              this.factor = new DecimalType();
            this.factor.setValue(value);
          }
          return this;
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public DetailComponent setFactor(long value) { 
              this.factor = new DecimalType();
            this.factor.setValue(value);
          return this;
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public DetailComponent setFactor(double value) { 
              this.factor = new DecimalType();
            this.factor.setValue(value);
          return this;
        }

        /**
         * @return {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
         */
        public DecimalType getPointsElement() { 
          if (this.points == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.points");
            else if (Configuration.doAutoCreate())
              this.points = new DecimalType(); // bb
          return this.points;
        }

        public boolean hasPointsElement() { 
          return this.points != null && !this.points.isEmpty();
        }

        public boolean hasPoints() { 
          return this.points != null && !this.points.isEmpty();
        }

        /**
         * @param value {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
         */
        public DetailComponent setPointsElement(DecimalType value) { 
          this.points = value;
          return this;
        }

        /**
         * @return An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public BigDecimal getPoints() { 
          return this.points == null ? null : this.points.getValue();
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public DetailComponent setPoints(BigDecimal value) { 
          if (value == null)
            this.points = null;
          else {
            if (this.points == null)
              this.points = new DecimalType();
            this.points.setValue(value);
          }
          return this;
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public DetailComponent setPoints(long value) { 
              this.points = new DecimalType();
            this.points.setValue(value);
          return this;
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public DetailComponent setPoints(double value) { 
              this.points = new DecimalType();
            this.points.setValue(value);
          return this;
        }

        /**
         * @return {@link #net} (The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
         */
        public Money getNet() { 
          if (this.net == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailComponent.net");
            else if (Configuration.doAutoCreate())
              this.net = new Money(); // cc
          return this.net;
        }

        public boolean hasNet() { 
          return this.net != null && !this.net.isEmpty();
        }

        /**
         * @param value {@link #net} (The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
         */
        public DetailComponent setNet(Money value) { 
          this.net = value;
          return this;
        }

        /**
         * @return {@link #udi} (List of Unique Device Identifiers associated with this line item.)
         */
        public List<Reference> getUdi() { 
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          return this.udi;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailComponent setUdi(List<Reference> theUdi) { 
          this.udi = theUdi;
          return this;
        }

        public boolean hasUdi() { 
          if (this.udi == null)
            return false;
          for (Reference item : this.udi)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addUdi() { //3
          Reference t = new Reference();
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          this.udi.add(t);
          return t;
        }

        public DetailComponent addUdi(Reference t) { //3
          if (t == null)
            return this;
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          this.udi.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #udi}, creating it if it does not already exist
         */
        public Reference getUdiFirstRep() { 
          if (getUdi().isEmpty()) {
            addUdi();
          }
          return getUdi().get(0);
        }

        /**
         * @deprecated Use Reference#setResource(IBaseResource) instead
         */
        @Deprecated
        public List<Device> getUdiTarget() { 
          if (this.udiTarget == null)
            this.udiTarget = new ArrayList<Device>();
          return this.udiTarget;
        }

        /**
         * @deprecated Use Reference#setResource(IBaseResource) instead
         */
        @Deprecated
        public Device addUdiTarget() { 
          Device r = new Device();
          if (this.udiTarget == null)
            this.udiTarget = new ArrayList<Device>();
          this.udiTarget.add(r);
          return r;
        }

        /**
         * @return {@link #subDetail} (Third tier of goods and services.)
         */
        public List<SubDetailComponent> getSubDetail() { 
          if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
          return this.subDetail;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailComponent setSubDetail(List<SubDetailComponent> theSubDetail) { 
          this.subDetail = theSubDetail;
          return this;
        }

        public boolean hasSubDetail() { 
          if (this.subDetail == null)
            return false;
          for (SubDetailComponent item : this.subDetail)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public SubDetailComponent addSubDetail() { //3
          SubDetailComponent t = new SubDetailComponent();
          if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
          this.subDetail.add(t);
          return t;
        }

        public DetailComponent addSubDetail(SubDetailComponent t) { //3
          if (t == null)
            return this;
          if (this.subDetail == null)
            this.subDetail = new ArrayList<SubDetailComponent>();
          this.subDetail.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #subDetail}, creating it if it does not already exist
         */
        public SubDetailComponent getSubDetailFirstRep() { 
          if (getSubDetail().isEmpty()) {
            addSubDetail();
          }
          return getSubDetail().get(0);
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("sequence", "positiveInt", "A service line number.", 0, java.lang.Integer.MAX_VALUE, sequence));
          childrenList.add(new Property("revenue", "Coding", "The type of reveneu or cost center providing the product and/or service.", 0, java.lang.Integer.MAX_VALUE, revenue));
          childrenList.add(new Property("category", "Coding", "Health Care Service Type Codes  to identify the classification of service or benefits.", 0, java.lang.Integer.MAX_VALUE, category));
          childrenList.add(new Property("service", "Coding", "If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.", 0, java.lang.Integer.MAX_VALUE, service));
          childrenList.add(new Property("modifier", "Coding", "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.", 0, java.lang.Integer.MAX_VALUE, modifier));
          childrenList.add(new Property("programCode", "Coding", "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.", 0, java.lang.Integer.MAX_VALUE, programCode));
          childrenList.add(new Property("quantity", "SimpleQuantity", "The number of repetitions of a service or product.", 0, java.lang.Integer.MAX_VALUE, quantity));
          childrenList.add(new Property("unitPrice", "Money", "If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.", 0, java.lang.Integer.MAX_VALUE, unitPrice));
          childrenList.add(new Property("factor", "decimal", "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.", 0, java.lang.Integer.MAX_VALUE, factor));
          childrenList.add(new Property("points", "decimal", "An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.", 0, java.lang.Integer.MAX_VALUE, points));
          childrenList.add(new Property("net", "Money", "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.", 0, java.lang.Integer.MAX_VALUE, net));
          childrenList.add(new Property("udi", "Reference(Device)", "List of Unique Device Identifiers associated with this line item.", 0, java.lang.Integer.MAX_VALUE, udi));
          childrenList.add(new Property("subDetail", "", "Third tier of goods and services.", 0, java.lang.Integer.MAX_VALUE, subDetail));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return this.sequence == null ? new Base[0] : new Base[] {this.sequence}; // PositiveIntType
        case 1099842588: /*revenue*/ return this.revenue == null ? new Base[0] : new Base[] {this.revenue}; // Coding
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // Coding
        case 1984153269: /*service*/ return this.service == null ? new Base[0] : new Base[] {this.service}; // Coding
        case -615513385: /*modifier*/ return this.modifier == null ? new Base[0] : this.modifier.toArray(new Base[this.modifier.size()]); // Coding
        case 1010065041: /*programCode*/ return this.programCode == null ? new Base[0] : this.programCode.toArray(new Base[this.programCode.size()]); // Coding
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // SimpleQuantity
        case -486196699: /*unitPrice*/ return this.unitPrice == null ? new Base[0] : new Base[] {this.unitPrice}; // Money
        case -1282148017: /*factor*/ return this.factor == null ? new Base[0] : new Base[] {this.factor}; // DecimalType
        case -982754077: /*points*/ return this.points == null ? new Base[0] : new Base[] {this.points}; // DecimalType
        case 108957: /*net*/ return this.net == null ? new Base[0] : new Base[] {this.net}; // Money
        case 115642: /*udi*/ return this.udi == null ? new Base[0] : this.udi.toArray(new Base[this.udi.size()]); // Reference
        case -828829007: /*subDetail*/ return this.subDetail == null ? new Base[0] : this.subDetail.toArray(new Base[this.subDetail.size()]); // SubDetailComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1349547969: // sequence
          this.sequence = castToPositiveInt(value); // PositiveIntType
          break;
        case 1099842588: // revenue
          this.revenue = castToCoding(value); // Coding
          break;
        case 50511102: // category
          this.category = castToCoding(value); // Coding
          break;
        case 1984153269: // service
          this.service = castToCoding(value); // Coding
          break;
        case -615513385: // modifier
          this.getModifier().add(castToCoding(value)); // Coding
          break;
        case 1010065041: // programCode
          this.getProgramCode().add(castToCoding(value)); // Coding
          break;
        case -1285004149: // quantity
          this.quantity = castToSimpleQuantity(value); // SimpleQuantity
          break;
        case -486196699: // unitPrice
          this.unitPrice = castToMoney(value); // Money
          break;
        case -1282148017: // factor
          this.factor = castToDecimal(value); // DecimalType
          break;
        case -982754077: // points
          this.points = castToDecimal(value); // DecimalType
          break;
        case 108957: // net
          this.net = castToMoney(value); // Money
          break;
        case 115642: // udi
          this.getUdi().add(castToReference(value)); // Reference
          break;
        case -828829007: // subDetail
          this.getSubDetail().add((SubDetailComponent) value); // SubDetailComponent
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
          this.sequence = castToPositiveInt(value); // PositiveIntType
        else if (name.equals("revenue"))
          this.revenue = castToCoding(value); // Coding
        else if (name.equals("category"))
          this.category = castToCoding(value); // Coding
        else if (name.equals("service"))
          this.service = castToCoding(value); // Coding
        else if (name.equals("modifier"))
          this.getModifier().add(castToCoding(value));
        else if (name.equals("programCode"))
          this.getProgramCode().add(castToCoding(value));
        else if (name.equals("quantity"))
          this.quantity = castToSimpleQuantity(value); // SimpleQuantity
        else if (name.equals("unitPrice"))
          this.unitPrice = castToMoney(value); // Money
        else if (name.equals("factor"))
          this.factor = castToDecimal(value); // DecimalType
        else if (name.equals("points"))
          this.points = castToDecimal(value); // DecimalType
        else if (name.equals("net"))
          this.net = castToMoney(value); // Money
        else if (name.equals("udi"))
          this.getUdi().add(castToReference(value));
        else if (name.equals("subDetail"))
          this.getSubDetail().add((SubDetailComponent) value);
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969: throw new FHIRException("Cannot make property sequence as it is not a complex type"); // PositiveIntType
        case 1099842588:  return getRevenue(); // Coding
        case 50511102:  return getCategory(); // Coding
        case 1984153269:  return getService(); // Coding
        case -615513385:  return addModifier(); // Coding
        case 1010065041:  return addProgramCode(); // Coding
        case -1285004149:  return getQuantity(); // SimpleQuantity
        case -486196699:  return getUnitPrice(); // Money
        case -1282148017: throw new FHIRException("Cannot make property factor as it is not a complex type"); // DecimalType
        case -982754077: throw new FHIRException("Cannot make property points as it is not a complex type"); // DecimalType
        case 108957:  return getNet(); // Money
        case 115642:  return addUdi(); // Reference
        case -828829007:  return addSubDetail(); // SubDetailComponent
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        }
        else if (name.equals("revenue")) {
          this.revenue = new Coding();
          return this.revenue;
        }
        else if (name.equals("category")) {
          this.category = new Coding();
          return this.category;
        }
        else if (name.equals("service")) {
          this.service = new Coding();
          return this.service;
        }
        else if (name.equals("modifier")) {
          return addModifier();
        }
        else if (name.equals("programCode")) {
          return addProgramCode();
        }
        else if (name.equals("quantity")) {
          this.quantity = new SimpleQuantity();
          return this.quantity;
        }
        else if (name.equals("unitPrice")) {
          this.unitPrice = new Money();
          return this.unitPrice;
        }
        else if (name.equals("factor")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.factor");
        }
        else if (name.equals("points")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.points");
        }
        else if (name.equals("net")) {
          this.net = new Money();
          return this.net;
        }
        else if (name.equals("udi")) {
          return addUdi();
        }
        else if (name.equals("subDetail")) {
          return addSubDetail();
        }
        else
          return super.addChild(name);
      }

      public DetailComponent copy() {
        DetailComponent dst = new DetailComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.revenue = revenue == null ? null : revenue.copy();
        dst.category = category == null ? null : category.copy();
        dst.service = service == null ? null : service.copy();
        if (modifier != null) {
          dst.modifier = new ArrayList<Coding>();
          for (Coding i : modifier)
            dst.modifier.add(i.copy());
        };
        if (programCode != null) {
          dst.programCode = new ArrayList<Coding>();
          for (Coding i : programCode)
            dst.programCode.add(i.copy());
        };
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.unitPrice = unitPrice == null ? null : unitPrice.copy();
        dst.factor = factor == null ? null : factor.copy();
        dst.points = points == null ? null : points.copy();
        dst.net = net == null ? null : net.copy();
        if (udi != null) {
          dst.udi = new ArrayList<Reference>();
          for (Reference i : udi)
            dst.udi.add(i.copy());
        };
        if (subDetail != null) {
          dst.subDetail = new ArrayList<SubDetailComponent>();
          for (SubDetailComponent i : subDetail)
            dst.subDetail.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof DetailComponent))
          return false;
        DetailComponent o = (DetailComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(revenue, o.revenue, true) && compareDeep(category, o.category, true)
           && compareDeep(service, o.service, true) && compareDeep(modifier, o.modifier, true) && compareDeep(programCode, o.programCode, true)
           && compareDeep(quantity, o.quantity, true) && compareDeep(unitPrice, o.unitPrice, true) && compareDeep(factor, o.factor, true)
           && compareDeep(points, o.points, true) && compareDeep(net, o.net, true) && compareDeep(udi, o.udi, true)
           && compareDeep(subDetail, o.subDetail, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof DetailComponent))
          return false;
        DetailComponent o = (DetailComponent) other;
        return compareValues(sequence, o.sequence, true) && compareValues(factor, o.factor, true) && compareValues(points, o.points, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(sequence, revenue, category
          , service, modifier, programCode, quantity, unitPrice, factor, points, net, udi
          , subDetail);
      }

  public String fhirType() {
    return "Claim.item.detail";

  }

  }

    @Block()
    public static class SubDetailComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A service line number.
         */
        @Child(name = "sequence", type = {PositiveIntType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Service instance", formalDefinition="A service line number." )
        protected PositiveIntType sequence;

        /**
         * The type of reveneu or cost center providing the product and/or service.
         */
        @Child(name = "revenue", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Revenue or cost center code", formalDefinition="The type of reveneu or cost center providing the product and/or service." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-revenue-center")
        protected Coding revenue;

        /**
         * Health Care Service Type Codes  to identify the classification of service or benefits.
         */
        @Child(name = "category", type = {Coding.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of service or product", formalDefinition="Health Care Service Type Codes  to identify the classification of service or benefits." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/benefit-subcategory")
        protected Coding category;

        /**
         * A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI).
         */
        @Child(name = "service", type = {Coding.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Billing Code", formalDefinition="A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/service-uscls")
        protected Coding service;

        /**
         * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
         */
        @Child(name = "modifier", type = {Coding.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Service/Product billing modifiers", formalDefinition="Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-modifiers")
        protected List<Coding> modifier;

        /**
         * For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.
         */
        @Child(name = "programCode", type = {Coding.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Program specific reason for item inclusion", formalDefinition="For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-program-code")
        protected List<Coding> programCode;

        /**
         * The number of repetitions of a service or product.
         */
        @Child(name = "quantity", type = {SimpleQuantity.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Count of Products or Services", formalDefinition="The number of repetitions of a service or product." )
        protected SimpleQuantity quantity;

        /**
         * The fee for an addittional service or product or charge.
         */
        @Child(name = "unitPrice", type = {Money.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fee, charge or cost per point", formalDefinition="The fee for an addittional service or product or charge." )
        protected Money unitPrice;

        /**
         * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        @Child(name = "factor", type = {DecimalType.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Price scaling factor", formalDefinition="A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount." )
        protected DecimalType factor;

        /**
         * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        @Child(name = "points", type = {DecimalType.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Difficulty scaling factor", formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point." )
        protected DecimalType points;

        /**
         * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
         */
        @Child(name = "net", type = {Money.class}, order=11, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Net additional item cost", formalDefinition="The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied." )
        protected Money net;

        /**
         * List of Unique Device Identifiers associated with this line item.
         */
        @Child(name = "udi", type = {Device.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Unique Device Identifier", formalDefinition="List of Unique Device Identifiers associated with this line item." )
        protected List<Reference> udi;
        /**
         * The actual objects that are the target of the reference (List of Unique Device Identifiers associated with this line item.)
         */
        protected List<Device> udiTarget;


        private static final long serialVersionUID = 1424899208L;

    /**
     * Constructor
     */
      public SubDetailComponent() {
        super();
      }

    /**
     * Constructor
     */
      public SubDetailComponent(PositiveIntType sequence) {
        super();
        this.sequence = sequence;
      }

        /**
         * @return {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public PositiveIntType getSequenceElement() { 
          if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.sequence");
            else if (Configuration.doAutoCreate())
              this.sequence = new PositiveIntType(); // bb
          return this.sequence;
        }

        public boolean hasSequenceElement() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasSequence() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        /**
         * @param value {@link #sequence} (A service line number.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public SubDetailComponent setSequenceElement(PositiveIntType value) { 
          this.sequence = value;
          return this;
        }

        /**
         * @return A service line number.
         */
        public int getSequence() { 
          return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
        }

        /**
         * @param value A service line number.
         */
        public SubDetailComponent setSequence(int value) { 
            if (this.sequence == null)
              this.sequence = new PositiveIntType();
            this.sequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #revenue} (The type of reveneu or cost center providing the product and/or service.)
         */
        public Coding getRevenue() { 
          if (this.revenue == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.revenue");
            else if (Configuration.doAutoCreate())
              this.revenue = new Coding(); // cc
          return this.revenue;
        }

        public boolean hasRevenue() { 
          return this.revenue != null && !this.revenue.isEmpty();
        }

        /**
         * @param value {@link #revenue} (The type of reveneu or cost center providing the product and/or service.)
         */
        public SubDetailComponent setRevenue(Coding value) { 
          this.revenue = value;
          return this;
        }

        /**
         * @return {@link #category} (Health Care Service Type Codes  to identify the classification of service or benefits.)
         */
        public Coding getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new Coding(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (Health Care Service Type Codes  to identify the classification of service or benefits.)
         */
        public SubDetailComponent setCategory(Coding value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #service} (A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI).)
         */
        public Coding getService() { 
          if (this.service == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.service");
            else if (Configuration.doAutoCreate())
              this.service = new Coding(); // cc
          return this.service;
        }

        public boolean hasService() { 
          return this.service != null && !this.service.isEmpty();
        }

        /**
         * @param value {@link #service} (A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI).)
         */
        public SubDetailComponent setService(Coding value) { 
          this.service = value;
          return this;
        }

        /**
         * @return {@link #modifier} (Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.)
         */
        public List<Coding> getModifier() { 
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          return this.modifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SubDetailComponent setModifier(List<Coding> theModifier) { 
          this.modifier = theModifier;
          return this;
        }

        public boolean hasModifier() { 
          if (this.modifier == null)
            return false;
          for (Coding item : this.modifier)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addModifier() { //3
          Coding t = new Coding();
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          this.modifier.add(t);
          return t;
        }

        public SubDetailComponent addModifier(Coding t) { //3
          if (t == null)
            return this;
          if (this.modifier == null)
            this.modifier = new ArrayList<Coding>();
          this.modifier.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #modifier}, creating it if it does not already exist
         */
        public Coding getModifierFirstRep() { 
          if (getModifier().isEmpty()) {
            addModifier();
          }
          return getModifier().get(0);
        }

        /**
         * @return {@link #programCode} (For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.)
         */
        public List<Coding> getProgramCode() { 
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          return this.programCode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SubDetailComponent setProgramCode(List<Coding> theProgramCode) { 
          this.programCode = theProgramCode;
          return this;
        }

        public boolean hasProgramCode() { 
          if (this.programCode == null)
            return false;
          for (Coding item : this.programCode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Coding addProgramCode() { //3
          Coding t = new Coding();
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          this.programCode.add(t);
          return t;
        }

        public SubDetailComponent addProgramCode(Coding t) { //3
          if (t == null)
            return this;
          if (this.programCode == null)
            this.programCode = new ArrayList<Coding>();
          this.programCode.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #programCode}, creating it if it does not already exist
         */
        public Coding getProgramCodeFirstRep() { 
          if (getProgramCode().isEmpty()) {
            addProgramCode();
          }
          return getProgramCode().get(0);
        }

        /**
         * @return {@link #quantity} (The number of repetitions of a service or product.)
         */
        public SimpleQuantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new SimpleQuantity(); // cc
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (The number of repetitions of a service or product.)
         */
        public SubDetailComponent setQuantity(SimpleQuantity value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #unitPrice} (The fee for an addittional service or product or charge.)
         */
        public Money getUnitPrice() { 
          if (this.unitPrice == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.unitPrice");
            else if (Configuration.doAutoCreate())
              this.unitPrice = new Money(); // cc
          return this.unitPrice;
        }

        public boolean hasUnitPrice() { 
          return this.unitPrice != null && !this.unitPrice.isEmpty();
        }

        /**
         * @param value {@link #unitPrice} (The fee for an addittional service or product or charge.)
         */
        public SubDetailComponent setUnitPrice(Money value) { 
          this.unitPrice = value;
          return this;
        }

        /**
         * @return {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
         */
        public DecimalType getFactorElement() { 
          if (this.factor == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.factor");
            else if (Configuration.doAutoCreate())
              this.factor = new DecimalType(); // bb
          return this.factor;
        }

        public boolean hasFactorElement() { 
          return this.factor != null && !this.factor.isEmpty();
        }

        public boolean hasFactor() { 
          return this.factor != null && !this.factor.isEmpty();
        }

        /**
         * @param value {@link #factor} (A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.). This is the underlying object with id, value and extensions. The accessor "getFactor" gives direct access to the value
         */
        public SubDetailComponent setFactorElement(DecimalType value) { 
          this.factor = value;
          return this;
        }

        /**
         * @return A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public BigDecimal getFactor() { 
          return this.factor == null ? null : this.factor.getValue();
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public SubDetailComponent setFactor(BigDecimal value) { 
          if (value == null)
            this.factor = null;
          else {
            if (this.factor == null)
              this.factor = new DecimalType();
            this.factor.setValue(value);
          }
          return this;
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public SubDetailComponent setFactor(long value) { 
              this.factor = new DecimalType();
            this.factor.setValue(value);
          return this;
        }

        /**
         * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
         */
        public SubDetailComponent setFactor(double value) { 
              this.factor = new DecimalType();
            this.factor.setValue(value);
          return this;
        }

        /**
         * @return {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
         */
        public DecimalType getPointsElement() { 
          if (this.points == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.points");
            else if (Configuration.doAutoCreate())
              this.points = new DecimalType(); // bb
          return this.points;
        }

        public boolean hasPointsElement() { 
          return this.points != null && !this.points.isEmpty();
        }

        public boolean hasPoints() { 
          return this.points != null && !this.points.isEmpty();
        }

        /**
         * @param value {@link #points} (An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.). This is the underlying object with id, value and extensions. The accessor "getPoints" gives direct access to the value
         */
        public SubDetailComponent setPointsElement(DecimalType value) { 
          this.points = value;
          return this;
        }

        /**
         * @return An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public BigDecimal getPoints() { 
          return this.points == null ? null : this.points.getValue();
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public SubDetailComponent setPoints(BigDecimal value) { 
          if (value == null)
            this.points = null;
          else {
            if (this.points == null)
              this.points = new DecimalType();
            this.points.setValue(value);
          }
          return this;
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public SubDetailComponent setPoints(long value) { 
              this.points = new DecimalType();
            this.points.setValue(value);
          return this;
        }

        /**
         * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
         */
        public SubDetailComponent setPoints(double value) { 
              this.points = new DecimalType();
            this.points.setValue(value);
          return this;
        }

        /**
         * @return {@link #net} (The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
         */
        public Money getNet() { 
          if (this.net == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SubDetailComponent.net");
            else if (Configuration.doAutoCreate())
              this.net = new Money(); // cc
          return this.net;
        }

        public boolean hasNet() { 
          return this.net != null && !this.net.isEmpty();
        }

        /**
         * @param value {@link #net} (The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.)
         */
        public SubDetailComponent setNet(Money value) { 
          this.net = value;
          return this;
        }

        /**
         * @return {@link #udi} (List of Unique Device Identifiers associated with this line item.)
         */
        public List<Reference> getUdi() { 
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          return this.udi;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SubDetailComponent setUdi(List<Reference> theUdi) { 
          this.udi = theUdi;
          return this;
        }

        public boolean hasUdi() { 
          if (this.udi == null)
            return false;
          for (Reference item : this.udi)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addUdi() { //3
          Reference t = new Reference();
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          this.udi.add(t);
          return t;
        }

        public SubDetailComponent addUdi(Reference t) { //3
          if (t == null)
            return this;
          if (this.udi == null)
            this.udi = new ArrayList<Reference>();
          this.udi.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #udi}, creating it if it does not already exist
         */
        public Reference getUdiFirstRep() { 
          if (getUdi().isEmpty()) {
            addUdi();
          }
          return getUdi().get(0);
        }

        /**
         * @deprecated Use Reference#setResource(IBaseResource) instead
         */
        @Deprecated
        public List<Device> getUdiTarget() { 
          if (this.udiTarget == null)
            this.udiTarget = new ArrayList<Device>();
          return this.udiTarget;
        }

        /**
         * @deprecated Use Reference#setResource(IBaseResource) instead
         */
        @Deprecated
        public Device addUdiTarget() { 
          Device r = new Device();
          if (this.udiTarget == null)
            this.udiTarget = new ArrayList<Device>();
          this.udiTarget.add(r);
          return r;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("sequence", "positiveInt", "A service line number.", 0, java.lang.Integer.MAX_VALUE, sequence));
          childrenList.add(new Property("revenue", "Coding", "The type of reveneu or cost center providing the product and/or service.", 0, java.lang.Integer.MAX_VALUE, revenue));
          childrenList.add(new Property("category", "Coding", "Health Care Service Type Codes  to identify the classification of service or benefits.", 0, java.lang.Integer.MAX_VALUE, category));
          childrenList.add(new Property("service", "Coding", "A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI).", 0, java.lang.Integer.MAX_VALUE, service));
          childrenList.add(new Property("modifier", "Coding", "Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.", 0, java.lang.Integer.MAX_VALUE, modifier));
          childrenList.add(new Property("programCode", "Coding", "For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.", 0, java.lang.Integer.MAX_VALUE, programCode));
          childrenList.add(new Property("quantity", "SimpleQuantity", "The number of repetitions of a service or product.", 0, java.lang.Integer.MAX_VALUE, quantity));
          childrenList.add(new Property("unitPrice", "Money", "The fee for an addittional service or product or charge.", 0, java.lang.Integer.MAX_VALUE, unitPrice));
          childrenList.add(new Property("factor", "decimal", "A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.", 0, java.lang.Integer.MAX_VALUE, factor));
          childrenList.add(new Property("points", "decimal", "An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.", 0, java.lang.Integer.MAX_VALUE, points));
          childrenList.add(new Property("net", "Money", "The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.", 0, java.lang.Integer.MAX_VALUE, net));
          childrenList.add(new Property("udi", "Reference(Device)", "List of Unique Device Identifiers associated with this line item.", 0, java.lang.Integer.MAX_VALUE, udi));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return this.sequence == null ? new Base[0] : new Base[] {this.sequence}; // PositiveIntType
        case 1099842588: /*revenue*/ return this.revenue == null ? new Base[0] : new Base[] {this.revenue}; // Coding
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // Coding
        case 1984153269: /*service*/ return this.service == null ? new Base[0] : new Base[] {this.service}; // Coding
        case -615513385: /*modifier*/ return this.modifier == null ? new Base[0] : this.modifier.toArray(new Base[this.modifier.size()]); // Coding
        case 1010065041: /*programCode*/ return this.programCode == null ? new Base[0] : this.programCode.toArray(new Base[this.programCode.size()]); // Coding
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // SimpleQuantity
        case -486196699: /*unitPrice*/ return this.unitPrice == null ? new Base[0] : new Base[] {this.unitPrice}; // Money
        case -1282148017: /*factor*/ return this.factor == null ? new Base[0] : new Base[] {this.factor}; // DecimalType
        case -982754077: /*points*/ return this.points == null ? new Base[0] : new Base[] {this.points}; // DecimalType
        case 108957: /*net*/ return this.net == null ? new Base[0] : new Base[] {this.net}; // Money
        case 115642: /*udi*/ return this.udi == null ? new Base[0] : this.udi.toArray(new Base[this.udi.size()]); // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1349547969: // sequence
          this.sequence = castToPositiveInt(value); // PositiveIntType
          break;
        case 1099842588: // revenue
          this.revenue = castToCoding(value); // Coding
          break;
        case 50511102: // category
          this.category = castToCoding(value); // Coding
          break;
        case 1984153269: // service
          this.service = castToCoding(value); // Coding
          break;
        case -615513385: // modifier
          this.getModifier().add(castToCoding(value)); // Coding
          break;
        case 1010065041: // programCode
          this.getProgramCode().add(castToCoding(value)); // Coding
          break;
        case -1285004149: // quantity
          this.quantity = castToSimpleQuantity(value); // SimpleQuantity
          break;
        case -486196699: // unitPrice
          this.unitPrice = castToMoney(value); // Money
          break;
        case -1282148017: // factor
          this.factor = castToDecimal(value); // DecimalType
          break;
        case -982754077: // points
          this.points = castToDecimal(value); // DecimalType
          break;
        case 108957: // net
          this.net = castToMoney(value); // Money
          break;
        case 115642: // udi
          this.getUdi().add(castToReference(value)); // Reference
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence"))
          this.sequence = castToPositiveInt(value); // PositiveIntType
        else if (name.equals("revenue"))
          this.revenue = castToCoding(value); // Coding
        else if (name.equals("category"))
          this.category = castToCoding(value); // Coding
        else if (name.equals("service"))
          this.service = castToCoding(value); // Coding
        else if (name.equals("modifier"))
          this.getModifier().add(castToCoding(value));
        else if (name.equals("programCode"))
          this.getProgramCode().add(castToCoding(value));
        else if (name.equals("quantity"))
          this.quantity = castToSimpleQuantity(value); // SimpleQuantity
        else if (name.equals("unitPrice"))
          this.unitPrice = castToMoney(value); // Money
        else if (name.equals("factor"))
          this.factor = castToDecimal(value); // DecimalType
        else if (name.equals("points"))
          this.points = castToDecimal(value); // DecimalType
        else if (name.equals("net"))
          this.net = castToMoney(value); // Money
        else if (name.equals("udi"))
          this.getUdi().add(castToReference(value));
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969: throw new FHIRException("Cannot make property sequence as it is not a complex type"); // PositiveIntType
        case 1099842588:  return getRevenue(); // Coding
        case 50511102:  return getCategory(); // Coding
        case 1984153269:  return getService(); // Coding
        case -615513385:  return addModifier(); // Coding
        case 1010065041:  return addProgramCode(); // Coding
        case -1285004149:  return getQuantity(); // SimpleQuantity
        case -486196699:  return getUnitPrice(); // Money
        case -1282148017: throw new FHIRException("Cannot make property factor as it is not a complex type"); // DecimalType
        case -982754077: throw new FHIRException("Cannot make property points as it is not a complex type"); // DecimalType
        case 108957:  return getNet(); // Money
        case 115642:  return addUdi(); // Reference
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.sequence");
        }
        else if (name.equals("revenue")) {
          this.revenue = new Coding();
          return this.revenue;
        }
        else if (name.equals("category")) {
          this.category = new Coding();
          return this.category;
        }
        else if (name.equals("service")) {
          this.service = new Coding();
          return this.service;
        }
        else if (name.equals("modifier")) {
          return addModifier();
        }
        else if (name.equals("programCode")) {
          return addProgramCode();
        }
        else if (name.equals("quantity")) {
          this.quantity = new SimpleQuantity();
          return this.quantity;
        }
        else if (name.equals("unitPrice")) {
          this.unitPrice = new Money();
          return this.unitPrice;
        }
        else if (name.equals("factor")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.factor");
        }
        else if (name.equals("points")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.points");
        }
        else if (name.equals("net")) {
          this.net = new Money();
          return this.net;
        }
        else if (name.equals("udi")) {
          return addUdi();
        }
        else
          return super.addChild(name);
      }

      public SubDetailComponent copy() {
        SubDetailComponent dst = new SubDetailComponent();
        copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.revenue = revenue == null ? null : revenue.copy();
        dst.category = category == null ? null : category.copy();
        dst.service = service == null ? null : service.copy();
        if (modifier != null) {
          dst.modifier = new ArrayList<Coding>();
          for (Coding i : modifier)
            dst.modifier.add(i.copy());
        };
        if (programCode != null) {
          dst.programCode = new ArrayList<Coding>();
          for (Coding i : programCode)
            dst.programCode.add(i.copy());
        };
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.unitPrice = unitPrice == null ? null : unitPrice.copy();
        dst.factor = factor == null ? null : factor.copy();
        dst.points = points == null ? null : points.copy();
        dst.net = net == null ? null : net.copy();
        if (udi != null) {
          dst.udi = new ArrayList<Reference>();
          for (Reference i : udi)
            dst.udi.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof SubDetailComponent))
          return false;
        SubDetailComponent o = (SubDetailComponent) other;
        return compareDeep(sequence, o.sequence, true) && compareDeep(revenue, o.revenue, true) && compareDeep(category, o.category, true)
           && compareDeep(service, o.service, true) && compareDeep(modifier, o.modifier, true) && compareDeep(programCode, o.programCode, true)
           && compareDeep(quantity, o.quantity, true) && compareDeep(unitPrice, o.unitPrice, true) && compareDeep(factor, o.factor, true)
           && compareDeep(points, o.points, true) && compareDeep(net, o.net, true) && compareDeep(udi, o.udi, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof SubDetailComponent))
          return false;
        SubDetailComponent o = (SubDetailComponent) other;
        return compareValues(sequence, o.sequence, true) && compareValues(factor, o.factor, true) && compareValues(points, o.points, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(sequence, revenue, category
          , service, modifier, programCode, quantity, unitPrice, factor, points, net, udi
          );
      }

  public String fhirType() {
    return "Claim.item.detail.subDetail";

  }

  }

    @Block()
    public static class ProsthesisComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Indicates whether this is the initial placement of a fixed prosthesis.
         */
        @Child(name = "initial", type = {BooleanType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Is this the initial service", formalDefinition="Indicates whether this is the initial placement of a fixed prosthesis." )
        protected BooleanType initial;

        /**
         * Date of the initial placement.
         */
        @Child(name = "priorDate", type = {DateType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Initial service Date", formalDefinition="Date of the initial placement." )
        protected DateType priorDate;

        /**
         * Material of the prior denture or bridge prosthesis. (Oral).
         */
        @Child(name = "priorMaterial", type = {Coding.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Prosthetic Material", formalDefinition="Material of the prior denture or bridge prosthesis. (Oral)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/oral-prosthodontic-material")
        protected Coding priorMaterial;

        private static final long serialVersionUID = 1739349641L;

    /**
     * Constructor
     */
      public ProsthesisComponent() {
        super();
      }

        /**
         * @return {@link #initial} (Indicates whether this is the initial placement of a fixed prosthesis.). This is the underlying object with id, value and extensions. The accessor "getInitial" gives direct access to the value
         */
        public BooleanType getInitialElement() { 
          if (this.initial == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ProsthesisComponent.initial");
            else if (Configuration.doAutoCreate())
              this.initial = new BooleanType(); // bb
          return this.initial;
        }

        public boolean hasInitialElement() { 
          return this.initial != null && !this.initial.isEmpty();
        }

        public boolean hasInitial() { 
          return this.initial != null && !this.initial.isEmpty();
        }

        /**
         * @param value {@link #initial} (Indicates whether this is the initial placement of a fixed prosthesis.). This is the underlying object with id, value and extensions. The accessor "getInitial" gives direct access to the value
         */
        public ProsthesisComponent setInitialElement(BooleanType value) { 
          this.initial = value;
          return this;
        }

        /**
         * @return Indicates whether this is the initial placement of a fixed prosthesis.
         */
        public boolean getInitial() { 
          return this.initial == null || this.initial.isEmpty() ? false : this.initial.getValue();
        }

        /**
         * @param value Indicates whether this is the initial placement of a fixed prosthesis.
         */
        public ProsthesisComponent setInitial(boolean value) { 
            if (this.initial == null)
              this.initial = new BooleanType();
            this.initial.setValue(value);
          return this;
        }

        /**
         * @return {@link #priorDate} (Date of the initial placement.). This is the underlying object with id, value and extensions. The accessor "getPriorDate" gives direct access to the value
         */
        public DateType getPriorDateElement() { 
          if (this.priorDate == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ProsthesisComponent.priorDate");
            else if (Configuration.doAutoCreate())
              this.priorDate = new DateType(); // bb
          return this.priorDate;
        }

        public boolean hasPriorDateElement() { 
          return this.priorDate != null && !this.priorDate.isEmpty();
        }

        public boolean hasPriorDate() { 
          return this.priorDate != null && !this.priorDate.isEmpty();
        }

        /**
         * @param value {@link #priorDate} (Date of the initial placement.). This is the underlying object with id, value and extensions. The accessor "getPriorDate" gives direct access to the value
         */
        public ProsthesisComponent setPriorDateElement(DateType value) { 
          this.priorDate = value;
          return this;
        }

        /**
         * @return Date of the initial placement.
         */
        public Date getPriorDate() { 
          return this.priorDate == null ? null : this.priorDate.getValue();
        }

        /**
         * @param value Date of the initial placement.
         */
        public ProsthesisComponent setPriorDate(Date value) { 
          if (value == null)
            this.priorDate = null;
          else {
            if (this.priorDate == null)
              this.priorDate = new DateType();
            this.priorDate.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #priorMaterial} (Material of the prior denture or bridge prosthesis. (Oral).)
         */
        public Coding getPriorMaterial() { 
          if (this.priorMaterial == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ProsthesisComponent.priorMaterial");
            else if (Configuration.doAutoCreate())
              this.priorMaterial = new Coding(); // cc
          return this.priorMaterial;
        }

        public boolean hasPriorMaterial() { 
          return this.priorMaterial != null && !this.priorMaterial.isEmpty();
        }

        /**
         * @param value {@link #priorMaterial} (Material of the prior denture or bridge prosthesis. (Oral).)
         */
        public ProsthesisComponent setPriorMaterial(Coding value) { 
          this.priorMaterial = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("initial", "boolean", "Indicates whether this is the initial placement of a fixed prosthesis.", 0, java.lang.Integer.MAX_VALUE, initial));
          childrenList.add(new Property("priorDate", "date", "Date of the initial placement.", 0, java.lang.Integer.MAX_VALUE, priorDate));
          childrenList.add(new Property("priorMaterial", "Coding", "Material of the prior denture or bridge prosthesis. (Oral).", 0, java.lang.Integer.MAX_VALUE, priorMaterial));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1948342084: /*initial*/ return this.initial == null ? new Base[0] : new Base[] {this.initial}; // BooleanType
        case -1770675816: /*priorDate*/ return this.priorDate == null ? new Base[0] : new Base[] {this.priorDate}; // DateType
        case -532999663: /*priorMaterial*/ return this.priorMaterial == null ? new Base[0] : new Base[] {this.priorMaterial}; // Coding
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1948342084: // initial
          this.initial = castToBoolean(value); // BooleanType
          break;
        case -1770675816: // priorDate
          this.priorDate = castToDate(value); // DateType
          break;
        case -532999663: // priorMaterial
          this.priorMaterial = castToCoding(value); // Coding
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("initial"))
          this.initial = castToBoolean(value); // BooleanType
        else if (name.equals("priorDate"))
          this.priorDate = castToDate(value); // DateType
        else if (name.equals("priorMaterial"))
          this.priorMaterial = castToCoding(value); // Coding
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1948342084: throw new FHIRException("Cannot make property initial as it is not a complex type"); // BooleanType
        case -1770675816: throw new FHIRException("Cannot make property priorDate as it is not a complex type"); // DateType
        case -532999663:  return getPriorMaterial(); // Coding
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("initial")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.initial");
        }
        else if (name.equals("priorDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.priorDate");
        }
        else if (name.equals("priorMaterial")) {
          this.priorMaterial = new Coding();
          return this.priorMaterial;
        }
        else
          return super.addChild(name);
      }

      public ProsthesisComponent copy() {
        ProsthesisComponent dst = new ProsthesisComponent();
        copyValues(dst);
        dst.initial = initial == null ? null : initial.copy();
        dst.priorDate = priorDate == null ? null : priorDate.copy();
        dst.priorMaterial = priorMaterial == null ? null : priorMaterial.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof ProsthesisComponent))
          return false;
        ProsthesisComponent o = (ProsthesisComponent) other;
        return compareDeep(initial, o.initial, true) && compareDeep(priorDate, o.priorDate, true) && compareDeep(priorMaterial, o.priorMaterial, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof ProsthesisComponent))
          return false;
        ProsthesisComponent o = (ProsthesisComponent) other;
        return compareValues(initial, o.initial, true) && compareValues(priorDate, o.priorDate, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(initial, priorDate, priorMaterial
          );
      }

  public String fhirType() {
    return "Claim.item.prosthesis";

  }

  }

    @Block()
    public static class MissingTeethComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The code identifying which tooth is missing.
         */
        @Child(name = "tooth", type = {Coding.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Tooth Code", formalDefinition="The code identifying which tooth is missing." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/teeth")
        protected Coding tooth;

        /**
         * Missing reason may be: E-extraction, O-other.
         */
        @Child(name = "reason", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Indicates whether it was extracted or other reason", formalDefinition="Missing reason may be: E-extraction, O-other." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/missing-tooth-reason")
        protected Coding reason;

        /**
         * The date of the extraction either known from records or patient reported estimate.
         */
        @Child(name = "extractionDate", type = {DateType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Date tooth was extracted if known", formalDefinition="The date of the extraction either known from records or patient reported estimate." )
        protected DateType extractionDate;

        private static final long serialVersionUID = 352913313L;

    /**
     * Constructor
     */
      public MissingTeethComponent() {
        super();
      }

    /**
     * Constructor
     */
      public MissingTeethComponent(Coding tooth) {
        super();
        this.tooth = tooth;
      }

        /**
         * @return {@link #tooth} (The code identifying which tooth is missing.)
         */
        public Coding getTooth() { 
          if (this.tooth == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MissingTeethComponent.tooth");
            else if (Configuration.doAutoCreate())
              this.tooth = new Coding(); // cc
          return this.tooth;
        }

        public boolean hasTooth() { 
          return this.tooth != null && !this.tooth.isEmpty();
        }

        /**
         * @param value {@link #tooth} (The code identifying which tooth is missing.)
         */
        public MissingTeethComponent setTooth(Coding value) { 
          this.tooth = value;
          return this;
        }

        /**
         * @return {@link #reason} (Missing reason may be: E-extraction, O-other.)
         */
        public Coding getReason() { 
          if (this.reason == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MissingTeethComponent.reason");
            else if (Configuration.doAutoCreate())
              this.reason = new Coding(); // cc
          return this.reason;
        }

        public boolean hasReason() { 
          return this.reason != null && !this.reason.isEmpty();
        }

        /**
         * @param value {@link #reason} (Missing reason may be: E-extraction, O-other.)
         */
        public MissingTeethComponent setReason(Coding value) { 
          this.reason = value;
          return this;
        }

        /**
         * @return {@link #extractionDate} (The date of the extraction either known from records or patient reported estimate.). This is the underlying object with id, value and extensions. The accessor "getExtractionDate" gives direct access to the value
         */
        public DateType getExtractionDateElement() { 
          if (this.extractionDate == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MissingTeethComponent.extractionDate");
            else if (Configuration.doAutoCreate())
              this.extractionDate = new DateType(); // bb
          return this.extractionDate;
        }

        public boolean hasExtractionDateElement() { 
          return this.extractionDate != null && !this.extractionDate.isEmpty();
        }

        public boolean hasExtractionDate() { 
          return this.extractionDate != null && !this.extractionDate.isEmpty();
        }

        /**
         * @param value {@link #extractionDate} (The date of the extraction either known from records or patient reported estimate.). This is the underlying object with id, value and extensions. The accessor "getExtractionDate" gives direct access to the value
         */
        public MissingTeethComponent setExtractionDateElement(DateType value) { 
          this.extractionDate = value;
          return this;
        }

        /**
         * @return The date of the extraction either known from records or patient reported estimate.
         */
        public Date getExtractionDate() { 
          return this.extractionDate == null ? null : this.extractionDate.getValue();
        }

        /**
         * @param value The date of the extraction either known from records or patient reported estimate.
         */
        public MissingTeethComponent setExtractionDate(Date value) { 
          if (value == null)
            this.extractionDate = null;
          else {
            if (this.extractionDate == null)
              this.extractionDate = new DateType();
            this.extractionDate.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("tooth", "Coding", "The code identifying which tooth is missing.", 0, java.lang.Integer.MAX_VALUE, tooth));
          childrenList.add(new Property("reason", "Coding", "Missing reason may be: E-extraction, O-other.", 0, java.lang.Integer.MAX_VALUE, reason));
          childrenList.add(new Property("extractionDate", "date", "The date of the extraction either known from records or patient reported estimate.", 0, java.lang.Integer.MAX_VALUE, extractionDate));
        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 110545608: /*tooth*/ return this.tooth == null ? new Base[0] : new Base[] {this.tooth}; // Coding
        case -934964668: /*reason*/ return this.reason == null ? new Base[0] : new Base[] {this.reason}; // Coding
        case 580646965: /*extractionDate*/ return this.extractionDate == null ? new Base[0] : new Base[] {this.extractionDate}; // DateType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 110545608: // tooth
          this.tooth = castToCoding(value); // Coding
          break;
        case -934964668: // reason
          this.reason = castToCoding(value); // Coding
          break;
        case 580646965: // extractionDate
          this.extractionDate = castToDate(value); // DateType
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("tooth"))
          this.tooth = castToCoding(value); // Coding
        else if (name.equals("reason"))
          this.reason = castToCoding(value); // Coding
        else if (name.equals("extractionDate"))
          this.extractionDate = castToDate(value); // DateType
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 110545608:  return getTooth(); // Coding
        case -934964668:  return getReason(); // Coding
        case 580646965: throw new FHIRException("Cannot make property extractionDate as it is not a complex type"); // DateType
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("tooth")) {
          this.tooth = new Coding();
          return this.tooth;
        }
        else if (name.equals("reason")) {
          this.reason = new Coding();
          return this.reason;
        }
        else if (name.equals("extractionDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.extractionDate");
        }
        else
          return super.addChild(name);
      }

      public MissingTeethComponent copy() {
        MissingTeethComponent dst = new MissingTeethComponent();
        copyValues(dst);
        dst.tooth = tooth == null ? null : tooth.copy();
        dst.reason = reason == null ? null : reason.copy();
        dst.extractionDate = extractionDate == null ? null : extractionDate.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof MissingTeethComponent))
          return false;
        MissingTeethComponent o = (MissingTeethComponent) other;
        return compareDeep(tooth, o.tooth, true) && compareDeep(reason, o.reason, true) && compareDeep(extractionDate, o.extractionDate, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof MissingTeethComponent))
          return false;
        MissingTeethComponent o = (MissingTeethComponent) other;
        return compareValues(extractionDate, o.extractionDate, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(tooth, reason, extractionDate
          );
      }

  public String fhirType() {
    return "Claim.missingTeeth";

  }

  }

    /**
     * The business identifier for the instance: claim number, pre-determination or pre-authorization number.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Claim number", formalDefinition="The business identifier for the instance: claim number, pre-determination or pre-authorization number." )
    protected List<Identifier> identifier;

    /**
     * The status of the resource instance.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="active | cancelled | draft | entered-in-error", formalDefinition="The status of the resource instance." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-status")
    protected Enumeration<ClaimStatus> status;

    /**
     * The category of claim, eg, oral, pharmacy, vision, insitutional, professional.
     */
    @Child(name = "type", type = {Coding.class}, order=2, min=1, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Type or discipline", formalDefinition="The category of claim, eg, oral, pharmacy, vision, insitutional, professional." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-type")
    protected Coding type;

    /**
     * A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType.
     */
    @Child(name = "subType", type = {Coding.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Finer grained claim type information", formalDefinition="A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-subtype")
    protected List<Coding> subType;

    /**
     * The version of the specification on which this instance relies.
     */
    @Child(name = "ruleset", type = {Coding.class}, order=4, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Current specification followed", formalDefinition="The version of the specification on which this instance relies." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ruleset")
    protected Coding ruleset;

    /**
     * The version of the specification from which the original instance was created.
     */
    @Child(name = "originalRuleset", type = {Coding.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Original specification followed", formalDefinition="The version of the specification from which the original instance was created." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ruleset")
    protected Coding originalRuleset;

    /**
     * The date when the enclosed suite of services were performed or completed.
     */
    @Child(name = "created", type = {DateTimeType.class}, order=6, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Creation date", formalDefinition="The date when the enclosed suite of services were performed or completed." )
    protected DateTimeType created;

    /**
     * The billable period for which charges are being submitted.
     */
    @Child(name = "billablePeriod", type = {Period.class}, order=7, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Period for charge submission", formalDefinition="The billable period for which charges are being submitted." )
    protected Period billablePeriod;

    /**
     * The Insurer who is target  of the request.
     */
    @Child(name = "insurer", type = {Organization.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Target", formalDefinition="The Insurer who is target  of the request." )
    protected Reference insurer;

    /**
     * The actual object that is the target of the reference (The Insurer who is target  of the request.)
     */
    protected Organization insurerTarget;

    /**
     * The provider which is responsible for the bill, claim pre-determination, pre-authorization.
     */
    @Child(name = "provider", type = {Practitioner.class}, order=9, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Responsible provider", formalDefinition="The provider which is responsible for the bill, claim pre-determination, pre-authorization." )
    protected Reference provider;

    /**
     * The actual object that is the target of the reference (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    protected Practitioner providerTarget;

    /**
     * The organization which is responsible for the bill, claim pre-determination, pre-authorization.
     */
    @Child(name = "organization", type = {Organization.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Responsible organization", formalDefinition="The organization which is responsible for the bill, claim pre-determination, pre-authorization." )
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    protected Organization organizationTarget;

    /**
     * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     */
    @Child(name = "use", type = {CodeType.class}, order=11, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="complete | proposed | exploratory | other", formalDefinition="Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination)." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-use")
    protected Enumeration<Use> use;

    /**
     * Immediate (STAT), best effort (NORMAL), deferred (DEFER).
     */
    @Child(name = "priority", type = {Coding.class}, order=12, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Desired processing priority", formalDefinition="Immediate (STAT), best effort (NORMAL), deferred (DEFER)." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/process-priority")
    protected Coding priority;

    /**
     * In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
     */
    @Child(name = "fundsReserve", type = {Coding.class}, order=13, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Funds requested to be reserved", formalDefinition="In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/fundsreserve")
    protected Coding fundsReserve;

    /**
     * Person who created the invoice/claim/pre-determination or pre-authorization.
     */
    @Child(name = "enterer", type = {Practitioner.class}, order=14, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Author", formalDefinition="Person who created the invoice/claim/pre-determination or pre-authorization." )
    protected Reference enterer;

    /**
     * The actual object that is the target of the reference (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    protected Practitioner entererTarget;

    /**
     * Facility where the services were provided.
     */
    @Child(name = "facility", type = {Location.class}, order=15, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Servicing Facility", formalDefinition="Facility where the services were provided." )
    protected Reference facility;

    /**
     * The actual object that is the target of the reference (Facility where the services were provided.)
     */
    protected Location facilityTarget;

    /**
     * Other claims which are related to this claim such as prior claim versions or for related services.
     */
    @Child(name = "related", type = {}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Related Claims which may be revelant to processing this claimn", formalDefinition="Other claims which are related to this claim such as prior claim versions or for related services." )
    protected List<RelatedClaimComponent> related;

    /**
     * Prescription to support the dispensing of Pharmacy or Vision products.
     */
    @Child(name = "prescription", type = {MedicationOrder.class, VisionPrescription.class}, order=17, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Prescription", formalDefinition="Prescription to support the dispensing of Pharmacy or Vision products." )
    protected Reference prescription;

    /**
     * The actual object that is the target of the reference (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    protected Resource prescriptionTarget;

    /**
     * Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.
     */
    @Child(name = "originalPrescription", type = {MedicationOrder.class}, order=18, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Original Prescription", formalDefinition="Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products." )
    protected Reference originalPrescription;

    /**
     * The actual object that is the target of the reference (Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.)
     */
    protected MedicationOrder originalPrescriptionTarget;

    /**
     * The party to be reimbursed for the services.
     */
    @Child(name = "payee", type = {}, order=19, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Party to be paid any benefits payable", formalDefinition="The party to be reimbursed for the services." )
    protected PayeeComponent payee;

    /**
     * The referral resource which lists the date, practitioner, reason and other supporting information.
     */
    @Child(name = "referral", type = {ReferralRequest.class}, order=20, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Treatment Referral", formalDefinition="The referral resource which lists the date, practitioner, reason and other supporting information." )
    protected Reference referral;

    /**
     * The actual object that is the target of the reference (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    protected ReferralRequest referralTarget;

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
     */
    @Child(name = "information", type = {}, order=21, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="(todo", formalDefinition="Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required." )
    protected List<SpecialConditionComponent> information;

    /**
     * Ordered list of patient diagnosis for which care is sought.
     */
    @Child(name = "diagnosis", type = {}, order=22, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Diagnosis", formalDefinition="Ordered list of patient diagnosis for which care is sought." )
    protected List<DiagnosisComponent> diagnosis;

    /**
     * Ordered list of patient procedures performed to support the adjudication.
     */
    @Child(name = "procedure", type = {}, order=23, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Procedures performed", formalDefinition="Ordered list of patient procedures performed to support the adjudication." )
    protected List<ProcedureComponent> procedure;

    /**
     * Patient Resource.
     */
    @Child(name = "patient", type = {Patient.class}, order=24, min=1, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The subject of the Products and Services", formalDefinition="Patient Resource." )
    protected Reference patient;

    /**
     * The actual object that is the target of the reference (Patient Resource.)
     */
    protected Patient patientTarget;

    /**
     * Financial instrument by which payment information for health care.
     */
    @Child(name = "coverage", type = {}, order=25, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Insurance or medical plan", formalDefinition="Financial instrument by which payment information for health care." )
    protected List<CoverageComponent> coverage;

    /**
     * An accident which resulted in the need for healthcare services.
     */
    @Child(name = "accident", type = {}, order=26, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="(todo", formalDefinition="An accident which resulted in the need for healthcare services." )
    protected AccidentComponent accident;

    /**
     * The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
     */
    @Child(name = "employmentImpacted", type = {Period.class}, order=27, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Period unable to work", formalDefinition="The start and optional end dates of when the patient was precluded from working due to the treatable condition(s)." )
    protected Period employmentImpacted;

    /**
     * The start and optional end dates of when the patient was confined to a treatment center.
     */
    @Child(name = "hospitalization", type = {Period.class}, order=28, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Period in hospital", formalDefinition="The start and optional end dates of when the patient was confined to a treatment center." )
    protected Period hospitalization;

    /**
     * First tier of goods and services.
     */
    @Child(name = "item", type = {}, order=29, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Goods and Services", formalDefinition="First tier of goods and services." )
    protected List<ItemComponent> item;

    /**
     * The total value of the claim.
     */
    @Child(name = "total", type = {Money.class}, order=30, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Total claim cost", formalDefinition="The total value of the claim." )
    protected Money total;

    /**
     * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
     */
    @Child(name = "missingTeeth", type = {}, order=31, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Only if type = oral", formalDefinition="A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons." )
    protected List<MissingTeethComponent> missingTeeth;

    private static final long serialVersionUID = -2139298390L;

  /**
   * Constructor
   */
    public Claim() {
      super();
    }

  /**
   * Constructor
   */
    public Claim(Enumeration<ClaimStatus> status, Coding type, Reference patient) {
      super();
      this.status = status;
      this.type = type;
      this.patient = patient;
    }

    /**
     * @return {@link #identifier} (The business identifier for the instance: claim number, pre-determination or pre-authorization number.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public Claim addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ClaimStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<ClaimStatus>(new ClaimStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Claim setStatusElement(Enumeration<ClaimStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the resource instance.
     */
    public ClaimStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the resource instance.
     */
    public Claim setStatus(ClaimStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<ClaimStatus>(new ClaimStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #type} (The category of claim, eg, oral, pharmacy, vision, insitutional, professional.)
     */
    public Coding getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.type");
        else if (Configuration.doAutoCreate())
          this.type = new Coding(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The category of claim, eg, oral, pharmacy, vision, insitutional, professional.)
     */
    public Claim setType(Coding value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #subType} (A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType.)
     */
    public List<Coding> getSubType() { 
      if (this.subType == null)
        this.subType = new ArrayList<Coding>();
      return this.subType;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setSubType(List<Coding> theSubType) { 
      this.subType = theSubType;
      return this;
    }

    public boolean hasSubType() { 
      if (this.subType == null)
        return false;
      for (Coding item : this.subType)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Coding addSubType() { //3
      Coding t = new Coding();
      if (this.subType == null)
        this.subType = new ArrayList<Coding>();
      this.subType.add(t);
      return t;
    }

    public Claim addSubType(Coding t) { //3
      if (t == null)
        return this;
      if (this.subType == null)
        this.subType = new ArrayList<Coding>();
      this.subType.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #subType}, creating it if it does not already exist
     */
    public Coding getSubTypeFirstRep() { 
      if (getSubType().isEmpty()) {
        addSubType();
      }
      return getSubType().get(0);
    }

    /**
     * @return {@link #ruleset} (The version of the specification on which this instance relies.)
     */
    public Coding getRuleset() { 
      if (this.ruleset == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.ruleset");
        else if (Configuration.doAutoCreate())
          this.ruleset = new Coding(); // cc
      return this.ruleset;
    }

    public boolean hasRuleset() { 
      return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the specification on which this instance relies.)
     */
    public Claim setRuleset(Coding value) { 
      this.ruleset = value;
      return this;
    }

    /**
     * @return {@link #originalRuleset} (The version of the specification from which the original instance was created.)
     */
    public Coding getOriginalRuleset() { 
      if (this.originalRuleset == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.originalRuleset");
        else if (Configuration.doAutoCreate())
          this.originalRuleset = new Coding(); // cc
      return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() { 
      return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The version of the specification from which the original instance was created.)
     */
    public Claim setOriginalRuleset(Coding value) { 
      this.originalRuleset = value;
      return this;
    }

    /**
     * @return {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() { 
      if (this.created == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.created");
        else if (Configuration.doAutoCreate())
          this.created = new DateTimeType(); // bb
      return this.created;
    }

    public boolean hasCreatedElement() { 
      return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() { 
      return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public Claim setCreatedElement(DateTimeType value) { 
      this.created = value;
      return this;
    }

    /**
     * @return The date when the enclosed suite of services were performed or completed.
     */
    public Date getCreated() { 
      return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when the enclosed suite of services were performed or completed.
     */
    public Claim setCreated(Date value) { 
      if (value == null)
        this.created = null;
      else {
        if (this.created == null)
          this.created = new DateTimeType();
        this.created.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #billablePeriod} (The billable period for which charges are being submitted.)
     */
    public Period getBillablePeriod() { 
      if (this.billablePeriod == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.billablePeriod");
        else if (Configuration.doAutoCreate())
          this.billablePeriod = new Period(); // cc
      return this.billablePeriod;
    }

    public boolean hasBillablePeriod() { 
      return this.billablePeriod != null && !this.billablePeriod.isEmpty();
    }

    /**
     * @param value {@link #billablePeriod} (The billable period for which charges are being submitted.)
     */
    public Claim setBillablePeriod(Period value) { 
      this.billablePeriod = value;
      return this;
    }

    /**
     * @return {@link #insurer} (The Insurer who is target  of the request.)
     */
    public Reference getInsurer() { 
      if (this.insurer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.insurer");
        else if (Configuration.doAutoCreate())
          this.insurer = new Reference(); // cc
      return this.insurer;
    }

    public boolean hasInsurer() { 
      return this.insurer != null && !this.insurer.isEmpty();
    }

    /**
     * @param value {@link #insurer} (The Insurer who is target  of the request.)
     */
    public Claim setInsurer(Reference value) { 
      this.insurer = value;
      return this;
    }

    /**
     * @return {@link #insurer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Insurer who is target  of the request.)
     */
    public Organization getInsurerTarget() { 
      if (this.insurerTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.insurer");
        else if (Configuration.doAutoCreate())
          this.insurerTarget = new Organization(); // aa
      return this.insurerTarget;
    }

    /**
     * @param value {@link #insurer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Insurer who is target  of the request.)
     */
    public Claim setInsurerTarget(Organization value) { 
      this.insurerTarget = value;
      return this;
    }

    /**
     * @return {@link #provider} (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Reference getProvider() { 
      if (this.provider == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.provider");
        else if (Configuration.doAutoCreate())
          this.provider = new Reference(); // cc
      return this.provider;
    }

    public boolean hasProvider() { 
      return this.provider != null && !this.provider.isEmpty();
    }

    /**
     * @param value {@link #provider} (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setProvider(Reference value) { 
      this.provider = value;
      return this;
    }

    /**
     * @return {@link #provider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Practitioner getProviderTarget() { 
      if (this.providerTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.provider");
        else if (Configuration.doAutoCreate())
          this.providerTarget = new Practitioner(); // aa
      return this.providerTarget;
    }

    /**
     * @param value {@link #provider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The provider which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setProviderTarget(Practitioner value) { 
      this.providerTarget = value;
      return this;
    }

    /**
     * @return {@link #organization} (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Reference getOrganization() { 
      if (this.organization == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.organization");
        else if (Configuration.doAutoCreate())
          this.organization = new Reference(); // cc
      return this.organization;
    }

    public boolean hasOrganization() { 
      return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setOrganization(Reference value) { 
      this.organization = value;
      return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Organization getOrganizationTarget() { 
      if (this.organizationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.organization");
        else if (Configuration.doAutoCreate())
          this.organizationTarget = new Organization(); // aa
      return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the bill, claim pre-determination, pre-authorization.)
     */
    public Claim setOrganizationTarget(Organization value) { 
      this.organizationTarget = value;
      return this;
    }

    /**
     * @return {@link #use} (Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<Use> getUseElement() { 
      if (this.use == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.use");
        else if (Configuration.doAutoCreate())
          this.use = new Enumeration<Use>(new UseEnumFactory()); // bb
      return this.use;
    }

    public boolean hasUseElement() { 
      return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() { 
      return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Claim setUseElement(Enumeration<Use> value) { 
      this.use = value;
      return this;
    }

    /**
     * @return Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     */
    public Use getUse() { 
      return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     */
    public Claim setUse(Use value) { 
      if (value == null)
        this.use = null;
      else {
        if (this.use == null)
          this.use = new Enumeration<Use>(new UseEnumFactory());
        this.use.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #priority} (Immediate (STAT), best effort (NORMAL), deferred (DEFER).)
     */
    public Coding getPriority() { 
      if (this.priority == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.priority");
        else if (Configuration.doAutoCreate())
          this.priority = new Coding(); // cc
      return this.priority;
    }

    public boolean hasPriority() { 
      return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (Immediate (STAT), best effort (NORMAL), deferred (DEFER).)
     */
    public Claim setPriority(Coding value) { 
      this.priority = value;
      return this;
    }

    /**
     * @return {@link #fundsReserve} (In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.)
     */
    public Coding getFundsReserve() { 
      if (this.fundsReserve == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.fundsReserve");
        else if (Configuration.doAutoCreate())
          this.fundsReserve = new Coding(); // cc
      return this.fundsReserve;
    }

    public boolean hasFundsReserve() { 
      return this.fundsReserve != null && !this.fundsReserve.isEmpty();
    }

    /**
     * @param value {@link #fundsReserve} (In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.)
     */
    public Claim setFundsReserve(Coding value) { 
      this.fundsReserve = value;
      return this;
    }

    /**
     * @return {@link #enterer} (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Reference getEnterer() { 
      if (this.enterer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.enterer");
        else if (Configuration.doAutoCreate())
          this.enterer = new Reference(); // cc
      return this.enterer;
    }

    public boolean hasEnterer() { 
      return this.enterer != null && !this.enterer.isEmpty();
    }

    /**
     * @param value {@link #enterer} (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Claim setEnterer(Reference value) { 
      this.enterer = value;
      return this;
    }

    /**
     * @return {@link #enterer} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Practitioner getEntererTarget() { 
      if (this.entererTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.enterer");
        else if (Configuration.doAutoCreate())
          this.entererTarget = new Practitioner(); // aa
      return this.entererTarget;
    }

    /**
     * @param value {@link #enterer} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Person who created the invoice/claim/pre-determination or pre-authorization.)
     */
    public Claim setEntererTarget(Practitioner value) { 
      this.entererTarget = value;
      return this;
    }

    /**
     * @return {@link #facility} (Facility where the services were provided.)
     */
    public Reference getFacility() { 
      if (this.facility == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.facility");
        else if (Configuration.doAutoCreate())
          this.facility = new Reference(); // cc
      return this.facility;
    }

    public boolean hasFacility() { 
      return this.facility != null && !this.facility.isEmpty();
    }

    /**
     * @param value {@link #facility} (Facility where the services were provided.)
     */
    public Claim setFacility(Reference value) { 
      this.facility = value;
      return this;
    }

    /**
     * @return {@link #facility} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Facility where the services were provided.)
     */
    public Location getFacilityTarget() { 
      if (this.facilityTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.facility");
        else if (Configuration.doAutoCreate())
          this.facilityTarget = new Location(); // aa
      return this.facilityTarget;
    }

    /**
     * @param value {@link #facility} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Facility where the services were provided.)
     */
    public Claim setFacilityTarget(Location value) { 
      this.facilityTarget = value;
      return this;
    }

    /**
     * @return {@link #related} (Other claims which are related to this claim such as prior claim versions or for related services.)
     */
    public List<RelatedClaimComponent> getRelated() { 
      if (this.related == null)
        this.related = new ArrayList<RelatedClaimComponent>();
      return this.related;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setRelated(List<RelatedClaimComponent> theRelated) { 
      this.related = theRelated;
      return this;
    }

    public boolean hasRelated() { 
      if (this.related == null)
        return false;
      for (RelatedClaimComponent item : this.related)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public RelatedClaimComponent addRelated() { //3
      RelatedClaimComponent t = new RelatedClaimComponent();
      if (this.related == null)
        this.related = new ArrayList<RelatedClaimComponent>();
      this.related.add(t);
      return t;
    }

    public Claim addRelated(RelatedClaimComponent t) { //3
      if (t == null)
        return this;
      if (this.related == null)
        this.related = new ArrayList<RelatedClaimComponent>();
      this.related.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #related}, creating it if it does not already exist
     */
    public RelatedClaimComponent getRelatedFirstRep() { 
      if (getRelated().isEmpty()) {
        addRelated();
      }
      return getRelated().get(0);
    }

    /**
     * @return {@link #prescription} (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Reference getPrescription() { 
      if (this.prescription == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.prescription");
        else if (Configuration.doAutoCreate())
          this.prescription = new Reference(); // cc
      return this.prescription;
    }

    public boolean hasPrescription() { 
      return this.prescription != null && !this.prescription.isEmpty();
    }

    /**
     * @param value {@link #prescription} (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Claim setPrescription(Reference value) { 
      this.prescription = value;
      return this;
    }

    /**
     * @return {@link #prescription} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Resource getPrescriptionTarget() { 
      return this.prescriptionTarget;
    }

    /**
     * @param value {@link #prescription} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Prescription to support the dispensing of Pharmacy or Vision products.)
     */
    public Claim setPrescriptionTarget(Resource value) { 
      this.prescriptionTarget = value;
      return this;
    }

    /**
     * @return {@link #originalPrescription} (Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public Reference getOriginalPrescription() { 
      if (this.originalPrescription == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.originalPrescription");
        else if (Configuration.doAutoCreate())
          this.originalPrescription = new Reference(); // cc
      return this.originalPrescription;
    }

    public boolean hasOriginalPrescription() { 
      return this.originalPrescription != null && !this.originalPrescription.isEmpty();
    }

    /**
     * @param value {@link #originalPrescription} (Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public Claim setOriginalPrescription(Reference value) { 
      this.originalPrescription = value;
      return this;
    }

    /**
     * @return {@link #originalPrescription} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public MedicationOrder getOriginalPrescriptionTarget() { 
      if (this.originalPrescriptionTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.originalPrescription");
        else if (Configuration.doAutoCreate())
          this.originalPrescriptionTarget = new MedicationOrder(); // aa
      return this.originalPrescriptionTarget;
    }

    /**
     * @param value {@link #originalPrescription} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.)
     */
    public Claim setOriginalPrescriptionTarget(MedicationOrder value) { 
      this.originalPrescriptionTarget = value;
      return this;
    }

    /**
     * @return {@link #payee} (The party to be reimbursed for the services.)
     */
    public PayeeComponent getPayee() { 
      if (this.payee == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.payee");
        else if (Configuration.doAutoCreate())
          this.payee = new PayeeComponent(); // cc
      return this.payee;
    }

    public boolean hasPayee() { 
      return this.payee != null && !this.payee.isEmpty();
    }

    /**
     * @param value {@link #payee} (The party to be reimbursed for the services.)
     */
    public Claim setPayee(PayeeComponent value) { 
      this.payee = value;
      return this;
    }

    /**
     * @return {@link #referral} (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public Reference getReferral() { 
      if (this.referral == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.referral");
        else if (Configuration.doAutoCreate())
          this.referral = new Reference(); // cc
      return this.referral;
    }

    public boolean hasReferral() { 
      return this.referral != null && !this.referral.isEmpty();
    }

    /**
     * @param value {@link #referral} (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public Claim setReferral(Reference value) { 
      this.referral = value;
      return this;
    }

    /**
     * @return {@link #referral} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public ReferralRequest getReferralTarget() { 
      if (this.referralTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.referral");
        else if (Configuration.doAutoCreate())
          this.referralTarget = new ReferralRequest(); // aa
      return this.referralTarget;
    }

    /**
     * @param value {@link #referral} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The referral resource which lists the date, practitioner, reason and other supporting information.)
     */
    public Claim setReferralTarget(ReferralRequest value) { 
      this.referralTarget = value;
      return this;
    }

    /**
     * @return {@link #information} (Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.)
     */
    public List<SpecialConditionComponent> getInformation() { 
      if (this.information == null)
        this.information = new ArrayList<SpecialConditionComponent>();
      return this.information;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setInformation(List<SpecialConditionComponent> theInformation) { 
      this.information = theInformation;
      return this;
    }

    public boolean hasInformation() { 
      if (this.information == null)
        return false;
      for (SpecialConditionComponent item : this.information)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public SpecialConditionComponent addInformation() { //3
      SpecialConditionComponent t = new SpecialConditionComponent();
      if (this.information == null)
        this.information = new ArrayList<SpecialConditionComponent>();
      this.information.add(t);
      return t;
    }

    public Claim addInformation(SpecialConditionComponent t) { //3
      if (t == null)
        return this;
      if (this.information == null)
        this.information = new ArrayList<SpecialConditionComponent>();
      this.information.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #information}, creating it if it does not already exist
     */
    public SpecialConditionComponent getInformationFirstRep() { 
      if (getInformation().isEmpty()) {
        addInformation();
      }
      return getInformation().get(0);
    }

    /**
     * @return {@link #diagnosis} (Ordered list of patient diagnosis for which care is sought.)
     */
    public List<DiagnosisComponent> getDiagnosis() { 
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<DiagnosisComponent>();
      return this.diagnosis;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setDiagnosis(List<DiagnosisComponent> theDiagnosis) { 
      this.diagnosis = theDiagnosis;
      return this;
    }

    public boolean hasDiagnosis() { 
      if (this.diagnosis == null)
        return false;
      for (DiagnosisComponent item : this.diagnosis)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DiagnosisComponent addDiagnosis() { //3
      DiagnosisComponent t = new DiagnosisComponent();
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<DiagnosisComponent>();
      this.diagnosis.add(t);
      return t;
    }

    public Claim addDiagnosis(DiagnosisComponent t) { //3
      if (t == null)
        return this;
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<DiagnosisComponent>();
      this.diagnosis.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #diagnosis}, creating it if it does not already exist
     */
    public DiagnosisComponent getDiagnosisFirstRep() { 
      if (getDiagnosis().isEmpty()) {
        addDiagnosis();
      }
      return getDiagnosis().get(0);
    }

    /**
     * @return {@link #procedure} (Ordered list of patient procedures performed to support the adjudication.)
     */
    public List<ProcedureComponent> getProcedure() { 
      if (this.procedure == null)
        this.procedure = new ArrayList<ProcedureComponent>();
      return this.procedure;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setProcedure(List<ProcedureComponent> theProcedure) { 
      this.procedure = theProcedure;
      return this;
    }

    public boolean hasProcedure() { 
      if (this.procedure == null)
        return false;
      for (ProcedureComponent item : this.procedure)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ProcedureComponent addProcedure() { //3
      ProcedureComponent t = new ProcedureComponent();
      if (this.procedure == null)
        this.procedure = new ArrayList<ProcedureComponent>();
      this.procedure.add(t);
      return t;
    }

    public Claim addProcedure(ProcedureComponent t) { //3
      if (t == null)
        return this;
      if (this.procedure == null)
        this.procedure = new ArrayList<ProcedureComponent>();
      this.procedure.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #procedure}, creating it if it does not already exist
     */
    public ProcedureComponent getProcedureFirstRep() { 
      if (getProcedure().isEmpty()) {
        addProcedure();
      }
      return getProcedure().get(0);
    }

    /**
     * @return {@link #patient} (Patient Resource.)
     */
    public Reference getPatient() { 
      if (this.patient == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.patient");
        else if (Configuration.doAutoCreate())
          this.patient = new Reference(); // cc
      return this.patient;
    }

    public boolean hasPatient() { 
      return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (Patient Resource.)
     */
    public Claim setPatient(Reference value) { 
      this.patient = value;
      return this;
    }

    /**
     * @return {@link #patient} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Patient Resource.)
     */
    public Patient getPatientTarget() { 
      if (this.patientTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.patient");
        else if (Configuration.doAutoCreate())
          this.patientTarget = new Patient(); // aa
      return this.patientTarget;
    }

    /**
     * @param value {@link #patient} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Patient Resource.)
     */
    public Claim setPatientTarget(Patient value) { 
      this.patientTarget = value;
      return this;
    }

    /**
     * @return {@link #coverage} (Financial instrument by which payment information for health care.)
     */
    public List<CoverageComponent> getCoverage() { 
      if (this.coverage == null)
        this.coverage = new ArrayList<CoverageComponent>();
      return this.coverage;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setCoverage(List<CoverageComponent> theCoverage) { 
      this.coverage = theCoverage;
      return this;
    }

    public boolean hasCoverage() { 
      if (this.coverage == null)
        return false;
      for (CoverageComponent item : this.coverage)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CoverageComponent addCoverage() { //3
      CoverageComponent t = new CoverageComponent();
      if (this.coverage == null)
        this.coverage = new ArrayList<CoverageComponent>();
      this.coverage.add(t);
      return t;
    }

    public Claim addCoverage(CoverageComponent t) { //3
      if (t == null)
        return this;
      if (this.coverage == null)
        this.coverage = new ArrayList<CoverageComponent>();
      this.coverage.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #coverage}, creating it if it does not already exist
     */
    public CoverageComponent getCoverageFirstRep() { 
      if (getCoverage().isEmpty()) {
        addCoverage();
      }
      return getCoverage().get(0);
    }

    /**
     * @return {@link #accident} (An accident which resulted in the need for healthcare services.)
     */
    public AccidentComponent getAccident() { 
      if (this.accident == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.accident");
        else if (Configuration.doAutoCreate())
          this.accident = new AccidentComponent(); // cc
      return this.accident;
    }

    public boolean hasAccident() { 
      return this.accident != null && !this.accident.isEmpty();
    }

    /**
     * @param value {@link #accident} (An accident which resulted in the need for healthcare services.)
     */
    public Claim setAccident(AccidentComponent value) { 
      this.accident = value;
      return this;
    }

    /**
     * @return {@link #employmentImpacted} (The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).)
     */
    public Period getEmploymentImpacted() { 
      if (this.employmentImpacted == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.employmentImpacted");
        else if (Configuration.doAutoCreate())
          this.employmentImpacted = new Period(); // cc
      return this.employmentImpacted;
    }

    public boolean hasEmploymentImpacted() { 
      return this.employmentImpacted != null && !this.employmentImpacted.isEmpty();
    }

    /**
     * @param value {@link #employmentImpacted} (The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).)
     */
    public Claim setEmploymentImpacted(Period value) { 
      this.employmentImpacted = value;
      return this;
    }

    /**
     * @return {@link #hospitalization} (The start and optional end dates of when the patient was confined to a treatment center.)
     */
    public Period getHospitalization() { 
      if (this.hospitalization == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.hospitalization");
        else if (Configuration.doAutoCreate())
          this.hospitalization = new Period(); // cc
      return this.hospitalization;
    }

    public boolean hasHospitalization() { 
      return this.hospitalization != null && !this.hospitalization.isEmpty();
    }

    /**
     * @param value {@link #hospitalization} (The start and optional end dates of when the patient was confined to a treatment center.)
     */
    public Claim setHospitalization(Period value) { 
      this.hospitalization = value;
      return this;
    }

    /**
     * @return {@link #item} (First tier of goods and services.)
     */
    public List<ItemComponent> getItem() { 
      if (this.item == null)
        this.item = new ArrayList<ItemComponent>();
      return this.item;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setItem(List<ItemComponent> theItem) { 
      this.item = theItem;
      return this;
    }

    public boolean hasItem() { 
      if (this.item == null)
        return false;
      for (ItemComponent item : this.item)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ItemComponent addItem() { //3
      ItemComponent t = new ItemComponent();
      if (this.item == null)
        this.item = new ArrayList<ItemComponent>();
      this.item.add(t);
      return t;
    }

    public Claim addItem(ItemComponent t) { //3
      if (t == null)
        return this;
      if (this.item == null)
        this.item = new ArrayList<ItemComponent>();
      this.item.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #item}, creating it if it does not already exist
     */
    public ItemComponent getItemFirstRep() { 
      if (getItem().isEmpty()) {
        addItem();
      }
      return getItem().get(0);
    }

    /**
     * @return {@link #total} (The total value of the claim.)
     */
    public Money getTotal() { 
      if (this.total == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Claim.total");
        else if (Configuration.doAutoCreate())
          this.total = new Money(); // cc
      return this.total;
    }

    public boolean hasTotal() { 
      return this.total != null && !this.total.isEmpty();
    }

    /**
     * @param value {@link #total} (The total value of the claim.)
     */
    public Claim setTotal(Money value) { 
      this.total = value;
      return this;
    }

    /**
     * @return {@link #missingTeeth} (A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.)
     */
    public List<MissingTeethComponent> getMissingTeeth() { 
      if (this.missingTeeth == null)
        this.missingTeeth = new ArrayList<MissingTeethComponent>();
      return this.missingTeeth;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Claim setMissingTeeth(List<MissingTeethComponent> theMissingTeeth) { 
      this.missingTeeth = theMissingTeeth;
      return this;
    }

    public boolean hasMissingTeeth() { 
      if (this.missingTeeth == null)
        return false;
      for (MissingTeethComponent item : this.missingTeeth)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public MissingTeethComponent addMissingTeeth() { //3
      MissingTeethComponent t = new MissingTeethComponent();
      if (this.missingTeeth == null)
        this.missingTeeth = new ArrayList<MissingTeethComponent>();
      this.missingTeeth.add(t);
      return t;
    }

    public Claim addMissingTeeth(MissingTeethComponent t) { //3
      if (t == null)
        return this;
      if (this.missingTeeth == null)
        this.missingTeeth = new ArrayList<MissingTeethComponent>();
      this.missingTeeth.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #missingTeeth}, creating it if it does not already exist
     */
    public MissingTeethComponent getMissingTeethFirstRep() { 
      if (getMissingTeeth().isEmpty()) {
        addMissingTeeth();
      }
      return getMissingTeeth().get(0);
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "The business identifier for the instance: claim number, pre-determination or pre-authorization number.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("status", "code", "The status of the resource instance.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("type", "Coding", "The category of claim, eg, oral, pharmacy, vision, insitutional, professional.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("subType", "Coding", "A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType.", 0, java.lang.Integer.MAX_VALUE, subType));
        childrenList.add(new Property("ruleset", "Coding", "The version of the specification on which this instance relies.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The version of the specification from which the original instance was created.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("created", "dateTime", "The date when the enclosed suite of services were performed or completed.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("billablePeriod", "Period", "The billable period for which charges are being submitted.", 0, java.lang.Integer.MAX_VALUE, billablePeriod));
        childrenList.add(new Property("insurer", "Reference(Organization)", "The Insurer who is target  of the request.", 0, java.lang.Integer.MAX_VALUE, insurer));
        childrenList.add(new Property("provider", "Reference(Practitioner)", "The provider which is responsible for the bill, claim pre-determination, pre-authorization.", 0, java.lang.Integer.MAX_VALUE, provider));
        childrenList.add(new Property("organization", "Reference(Organization)", "The organization which is responsible for the bill, claim pre-determination, pre-authorization.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("use", "code", "Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).", 0, java.lang.Integer.MAX_VALUE, use));
        childrenList.add(new Property("priority", "Coding", "Immediate (STAT), best effort (NORMAL), deferred (DEFER).", 0, java.lang.Integer.MAX_VALUE, priority));
        childrenList.add(new Property("fundsReserve", "Coding", "In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.", 0, java.lang.Integer.MAX_VALUE, fundsReserve));
        childrenList.add(new Property("enterer", "Reference(Practitioner)", "Person who created the invoice/claim/pre-determination or pre-authorization.", 0, java.lang.Integer.MAX_VALUE, enterer));
        childrenList.add(new Property("facility", "Reference(Location)", "Facility where the services were provided.", 0, java.lang.Integer.MAX_VALUE, facility));
        childrenList.add(new Property("related", "", "Other claims which are related to this claim such as prior claim versions or for related services.", 0, java.lang.Integer.MAX_VALUE, related));
        childrenList.add(new Property("prescription", "Reference(MedicationOrder|VisionPrescription)", "Prescription to support the dispensing of Pharmacy or Vision products.", 0, java.lang.Integer.MAX_VALUE, prescription));
        childrenList.add(new Property("originalPrescription", "Reference(MedicationOrder)", "Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.", 0, java.lang.Integer.MAX_VALUE, originalPrescription));
        childrenList.add(new Property("payee", "", "The party to be reimbursed for the services.", 0, java.lang.Integer.MAX_VALUE, payee));
        childrenList.add(new Property("referral", "Reference(ReferralRequest)", "The referral resource which lists the date, practitioner, reason and other supporting information.", 0, java.lang.Integer.MAX_VALUE, referral));
        childrenList.add(new Property("information", "", "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.", 0, java.lang.Integer.MAX_VALUE, information));
        childrenList.add(new Property("diagnosis", "", "Ordered list of patient diagnosis for which care is sought.", 0, java.lang.Integer.MAX_VALUE, diagnosis));
        childrenList.add(new Property("procedure", "", "Ordered list of patient procedures performed to support the adjudication.", 0, java.lang.Integer.MAX_VALUE, procedure));
        childrenList.add(new Property("patient", "Reference(Patient)", "Patient Resource.", 0, java.lang.Integer.MAX_VALUE, patient));
        childrenList.add(new Property("coverage", "", "Financial instrument by which payment information for health care.", 0, java.lang.Integer.MAX_VALUE, coverage));
        childrenList.add(new Property("accident", "", "An accident which resulted in the need for healthcare services.", 0, java.lang.Integer.MAX_VALUE, accident));
        childrenList.add(new Property("employmentImpacted", "Period", "The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).", 0, java.lang.Integer.MAX_VALUE, employmentImpacted));
        childrenList.add(new Property("hospitalization", "Period", "The start and optional end dates of when the patient was confined to a treatment center.", 0, java.lang.Integer.MAX_VALUE, hospitalization));
        childrenList.add(new Property("item", "", "First tier of goods and services.", 0, java.lang.Integer.MAX_VALUE, item));
        childrenList.add(new Property("total", "Money", "The total value of the claim.", 0, java.lang.Integer.MAX_VALUE, total));
        childrenList.add(new Property("missingTeeth", "", "A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.", 0, java.lang.Integer.MAX_VALUE, missingTeeth));
      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<ClaimStatus>
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Coding
        case -1868521062: /*subType*/ return this.subType == null ? new Base[0] : this.subType.toArray(new Base[this.subType.size()]); // Coding
        case 1548678118: /*ruleset*/ return this.ruleset == null ? new Base[0] : new Base[] {this.ruleset}; // Coding
        case 1089373397: /*originalRuleset*/ return this.originalRuleset == null ? new Base[0] : new Base[] {this.originalRuleset}; // Coding
        case 1028554472: /*created*/ return this.created == null ? new Base[0] : new Base[] {this.created}; // DateTimeType
        case -332066046: /*billablePeriod*/ return this.billablePeriod == null ? new Base[0] : new Base[] {this.billablePeriod}; // Period
        case 1957615864: /*insurer*/ return this.insurer == null ? new Base[0] : new Base[] {this.insurer}; // Reference
        case -987494927: /*provider*/ return this.provider == null ? new Base[0] : new Base[] {this.provider}; // Reference
        case 1178922291: /*organization*/ return this.organization == null ? new Base[0] : new Base[] {this.organization}; // Reference
        case 116103: /*use*/ return this.use == null ? new Base[0] : new Base[] {this.use}; // Enumeration<Use>
        case -1165461084: /*priority*/ return this.priority == null ? new Base[0] : new Base[] {this.priority}; // Coding
        case 1314609806: /*fundsReserve*/ return this.fundsReserve == null ? new Base[0] : new Base[] {this.fundsReserve}; // Coding
        case -1591951995: /*enterer*/ return this.enterer == null ? new Base[0] : new Base[] {this.enterer}; // Reference
        case 501116579: /*facility*/ return this.facility == null ? new Base[0] : new Base[] {this.facility}; // Reference
        case 1090493483: /*related*/ return this.related == null ? new Base[0] : this.related.toArray(new Base[this.related.size()]); // RelatedClaimComponent
        case 460301338: /*prescription*/ return this.prescription == null ? new Base[0] : new Base[] {this.prescription}; // Reference
        case -1814015861: /*originalPrescription*/ return this.originalPrescription == null ? new Base[0] : new Base[] {this.originalPrescription}; // Reference
        case 106443592: /*payee*/ return this.payee == null ? new Base[0] : new Base[] {this.payee}; // PayeeComponent
        case -722568291: /*referral*/ return this.referral == null ? new Base[0] : new Base[] {this.referral}; // Reference
        case 1968600364: /*information*/ return this.information == null ? new Base[0] : this.information.toArray(new Base[this.information.size()]); // SpecialConditionComponent
        case 1196993265: /*diagnosis*/ return this.diagnosis == null ? new Base[0] : this.diagnosis.toArray(new Base[this.diagnosis.size()]); // DiagnosisComponent
        case -1095204141: /*procedure*/ return this.procedure == null ? new Base[0] : this.procedure.toArray(new Base[this.procedure.size()]); // ProcedureComponent
        case -791418107: /*patient*/ return this.patient == null ? new Base[0] : new Base[] {this.patient}; // Reference
        case -351767064: /*coverage*/ return this.coverage == null ? new Base[0] : this.coverage.toArray(new Base[this.coverage.size()]); // CoverageComponent
        case -2143202801: /*accident*/ return this.accident == null ? new Base[0] : new Base[] {this.accident}; // AccidentComponent
        case 1051487345: /*employmentImpacted*/ return this.employmentImpacted == null ? new Base[0] : new Base[] {this.employmentImpacted}; // Period
        case 1057894634: /*hospitalization*/ return this.hospitalization == null ? new Base[0] : new Base[] {this.hospitalization}; // Period
        case 3242771: /*item*/ return this.item == null ? new Base[0] : this.item.toArray(new Base[this.item.size()]); // ItemComponent
        case 110549828: /*total*/ return this.total == null ? new Base[0] : new Base[] {this.total}; // Money
        case -1157130302: /*missingTeeth*/ return this.missingTeeth == null ? new Base[0] : this.missingTeeth.toArray(new Base[this.missingTeeth.size()]); // MissingTeethComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          break;
        case -892481550: // status
          this.status = new ClaimStatusEnumFactory().fromType(value); // Enumeration<ClaimStatus>
          break;
        case 3575610: // type
          this.type = castToCoding(value); // Coding
          break;
        case -1868521062: // subType
          this.getSubType().add(castToCoding(value)); // Coding
          break;
        case 1548678118: // ruleset
          this.ruleset = castToCoding(value); // Coding
          break;
        case 1089373397: // originalRuleset
          this.originalRuleset = castToCoding(value); // Coding
          break;
        case 1028554472: // created
          this.created = castToDateTime(value); // DateTimeType
          break;
        case -332066046: // billablePeriod
          this.billablePeriod = castToPeriod(value); // Period
          break;
        case 1957615864: // insurer
          this.insurer = castToReference(value); // Reference
          break;
        case -987494927: // provider
          this.provider = castToReference(value); // Reference
          break;
        case 1178922291: // organization
          this.organization = castToReference(value); // Reference
          break;
        case 116103: // use
          this.use = new UseEnumFactory().fromType(value); // Enumeration<Use>
          break;
        case -1165461084: // priority
          this.priority = castToCoding(value); // Coding
          break;
        case 1314609806: // fundsReserve
          this.fundsReserve = castToCoding(value); // Coding
          break;
        case -1591951995: // enterer
          this.enterer = castToReference(value); // Reference
          break;
        case 501116579: // facility
          this.facility = castToReference(value); // Reference
          break;
        case 1090493483: // related
          this.getRelated().add((RelatedClaimComponent) value); // RelatedClaimComponent
          break;
        case 460301338: // prescription
          this.prescription = castToReference(value); // Reference
          break;
        case -1814015861: // originalPrescription
          this.originalPrescription = castToReference(value); // Reference
          break;
        case 106443592: // payee
          this.payee = (PayeeComponent) value; // PayeeComponent
          break;
        case -722568291: // referral
          this.referral = castToReference(value); // Reference
          break;
        case 1968600364: // information
          this.getInformation().add((SpecialConditionComponent) value); // SpecialConditionComponent
          break;
        case 1196993265: // diagnosis
          this.getDiagnosis().add((DiagnosisComponent) value); // DiagnosisComponent
          break;
        case -1095204141: // procedure
          this.getProcedure().add((ProcedureComponent) value); // ProcedureComponent
          break;
        case -791418107: // patient
          this.patient = castToReference(value); // Reference
          break;
        case -351767064: // coverage
          this.getCoverage().add((CoverageComponent) value); // CoverageComponent
          break;
        case -2143202801: // accident
          this.accident = (AccidentComponent) value; // AccidentComponent
          break;
        case 1051487345: // employmentImpacted
          this.employmentImpacted = castToPeriod(value); // Period
          break;
        case 1057894634: // hospitalization
          this.hospitalization = castToPeriod(value); // Period
          break;
        case 3242771: // item
          this.getItem().add((ItemComponent) value); // ItemComponent
          break;
        case 110549828: // total
          this.total = castToMoney(value); // Money
          break;
        case -1157130302: // missingTeeth
          this.getMissingTeeth().add((MissingTeethComponent) value); // MissingTeethComponent
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
          this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("status"))
          this.status = new ClaimStatusEnumFactory().fromType(value); // Enumeration<ClaimStatus>
        else if (name.equals("type"))
          this.type = castToCoding(value); // Coding
        else if (name.equals("subType"))
          this.getSubType().add(castToCoding(value));
        else if (name.equals("ruleset"))
          this.ruleset = castToCoding(value); // Coding
        else if (name.equals("originalRuleset"))
          this.originalRuleset = castToCoding(value); // Coding
        else if (name.equals("created"))
          this.created = castToDateTime(value); // DateTimeType
        else if (name.equals("billablePeriod"))
          this.billablePeriod = castToPeriod(value); // Period
        else if (name.equals("insurer"))
          this.insurer = castToReference(value); // Reference
        else if (name.equals("provider"))
          this.provider = castToReference(value); // Reference
        else if (name.equals("organization"))
          this.organization = castToReference(value); // Reference
        else if (name.equals("use"))
          this.use = new UseEnumFactory().fromType(value); // Enumeration<Use>
        else if (name.equals("priority"))
          this.priority = castToCoding(value); // Coding
        else if (name.equals("fundsReserve"))
          this.fundsReserve = castToCoding(value); // Coding
        else if (name.equals("enterer"))
          this.enterer = castToReference(value); // Reference
        else if (name.equals("facility"))
          this.facility = castToReference(value); // Reference
        else if (name.equals("related"))
          this.getRelated().add((RelatedClaimComponent) value);
        else if (name.equals("prescription"))
          this.prescription = castToReference(value); // Reference
        else if (name.equals("originalPrescription"))
          this.originalPrescription = castToReference(value); // Reference
        else if (name.equals("payee"))
          this.payee = (PayeeComponent) value; // PayeeComponent
        else if (name.equals("referral"))
          this.referral = castToReference(value); // Reference
        else if (name.equals("information"))
          this.getInformation().add((SpecialConditionComponent) value);
        else if (name.equals("diagnosis"))
          this.getDiagnosis().add((DiagnosisComponent) value);
        else if (name.equals("procedure"))
          this.getProcedure().add((ProcedureComponent) value);
        else if (name.equals("patient"))
          this.patient = castToReference(value); // Reference
        else if (name.equals("coverage"))
          this.getCoverage().add((CoverageComponent) value);
        else if (name.equals("accident"))
          this.accident = (AccidentComponent) value; // AccidentComponent
        else if (name.equals("employmentImpacted"))
          this.employmentImpacted = castToPeriod(value); // Period
        else if (name.equals("hospitalization"))
          this.hospitalization = castToPeriod(value); // Period
        else if (name.equals("item"))
          this.getItem().add((ItemComponent) value);
        else if (name.equals("total"))
          this.total = castToMoney(value); // Money
        else if (name.equals("missingTeeth"))
          this.getMissingTeeth().add((MissingTeethComponent) value);
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); // Identifier
        case -892481550: throw new FHIRException("Cannot make property status as it is not a complex type"); // Enumeration<ClaimStatus>
        case 3575610:  return getType(); // Coding
        case -1868521062:  return addSubType(); // Coding
        case 1548678118:  return getRuleset(); // Coding
        case 1089373397:  return getOriginalRuleset(); // Coding
        case 1028554472: throw new FHIRException("Cannot make property created as it is not a complex type"); // DateTimeType
        case -332066046:  return getBillablePeriod(); // Period
        case 1957615864:  return getInsurer(); // Reference
        case -987494927:  return getProvider(); // Reference
        case 1178922291:  return getOrganization(); // Reference
        case 116103: throw new FHIRException("Cannot make property use as it is not a complex type"); // Enumeration<Use>
        case -1165461084:  return getPriority(); // Coding
        case 1314609806:  return getFundsReserve(); // Coding
        case -1591951995:  return getEnterer(); // Reference
        case 501116579:  return getFacility(); // Reference
        case 1090493483:  return addRelated(); // RelatedClaimComponent
        case 460301338:  return getPrescription(); // Reference
        case -1814015861:  return getOriginalPrescription(); // Reference
        case 106443592:  return getPayee(); // PayeeComponent
        case -722568291:  return getReferral(); // Reference
        case 1968600364:  return addInformation(); // SpecialConditionComponent
        case 1196993265:  return addDiagnosis(); // DiagnosisComponent
        case -1095204141:  return addProcedure(); // ProcedureComponent
        case -791418107:  return getPatient(); // Reference
        case -351767064:  return addCoverage(); // CoverageComponent
        case -2143202801:  return getAccident(); // AccidentComponent
        case 1051487345:  return getEmploymentImpacted(); // Period
        case 1057894634:  return getHospitalization(); // Period
        case 3242771:  return addItem(); // ItemComponent
        case 110549828:  return getTotal(); // Money
        case -1157130302:  return addMissingTeeth(); // MissingTeethComponent
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.status");
        }
        else if (name.equals("type")) {
          this.type = new Coding();
          return this.type;
        }
        else if (name.equals("subType")) {
          return addSubType();
        }
        else if (name.equals("ruleset")) {
          this.ruleset = new Coding();
          return this.ruleset;
        }
        else if (name.equals("originalRuleset")) {
          this.originalRuleset = new Coding();
          return this.originalRuleset;
        }
        else if (name.equals("created")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.created");
        }
        else if (name.equals("billablePeriod")) {
          this.billablePeriod = new Period();
          return this.billablePeriod;
        }
        else if (name.equals("insurer")) {
          this.insurer = new Reference();
          return this.insurer;
        }
        else if (name.equals("provider")) {
          this.provider = new Reference();
          return this.provider;
        }
        else if (name.equals("organization")) {
          this.organization = new Reference();
          return this.organization;
        }
        else if (name.equals("use")) {
          throw new FHIRException("Cannot call addChild on a primitive type Claim.use");
        }
        else if (name.equals("priority")) {
          this.priority = new Coding();
          return this.priority;
        }
        else if (name.equals("fundsReserve")) {
          this.fundsReserve = new Coding();
          return this.fundsReserve;
        }
        else if (name.equals("enterer")) {
          this.enterer = new Reference();
          return this.enterer;
        }
        else if (name.equals("facility")) {
          this.facility = new Reference();
          return this.facility;
        }
        else if (name.equals("related")) {
          return addRelated();
        }
        else if (name.equals("prescription")) {
          this.prescription = new Reference();
          return this.prescription;
        }
        else if (name.equals("originalPrescription")) {
          this.originalPrescription = new Reference();
          return this.originalPrescription;
        }
        else if (name.equals("payee")) {
          this.payee = new PayeeComponent();
          return this.payee;
        }
        else if (name.equals("referral")) {
          this.referral = new Reference();
          return this.referral;
        }
        else if (name.equals("information")) {
          return addInformation();
        }
        else if (name.equals("diagnosis")) {
          return addDiagnosis();
        }
        else if (name.equals("procedure")) {
          return addProcedure();
        }
        else if (name.equals("patient")) {
          this.patient = new Reference();
          return this.patient;
        }
        else if (name.equals("coverage")) {
          return addCoverage();
        }
        else if (name.equals("accident")) {
          this.accident = new AccidentComponent();
          return this.accident;
        }
        else if (name.equals("employmentImpacted")) {
          this.employmentImpacted = new Period();
          return this.employmentImpacted;
        }
        else if (name.equals("hospitalization")) {
          this.hospitalization = new Period();
          return this.hospitalization;
        }
        else if (name.equals("item")) {
          return addItem();
        }
        else if (name.equals("total")) {
          this.total = new Money();
          return this.total;
        }
        else if (name.equals("missingTeeth")) {
          return addMissingTeeth();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Claim";

  }

      public Claim copy() {
        Claim dst = new Claim();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.type = type == null ? null : type.copy();
        if (subType != null) {
          dst.subType = new ArrayList<Coding>();
          for (Coding i : subType)
            dst.subType.add(i.copy());
        };
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.created = created == null ? null : created.copy();
        dst.billablePeriod = billablePeriod == null ? null : billablePeriod.copy();
        dst.insurer = insurer == null ? null : insurer.copy();
        dst.provider = provider == null ? null : provider.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.use = use == null ? null : use.copy();
        dst.priority = priority == null ? null : priority.copy();
        dst.fundsReserve = fundsReserve == null ? null : fundsReserve.copy();
        dst.enterer = enterer == null ? null : enterer.copy();
        dst.facility = facility == null ? null : facility.copy();
        if (related != null) {
          dst.related = new ArrayList<RelatedClaimComponent>();
          for (RelatedClaimComponent i : related)
            dst.related.add(i.copy());
        };
        dst.prescription = prescription == null ? null : prescription.copy();
        dst.originalPrescription = originalPrescription == null ? null : originalPrescription.copy();
        dst.payee = payee == null ? null : payee.copy();
        dst.referral = referral == null ? null : referral.copy();
        if (information != null) {
          dst.information = new ArrayList<SpecialConditionComponent>();
          for (SpecialConditionComponent i : information)
            dst.information.add(i.copy());
        };
        if (diagnosis != null) {
          dst.diagnosis = new ArrayList<DiagnosisComponent>();
          for (DiagnosisComponent i : diagnosis)
            dst.diagnosis.add(i.copy());
        };
        if (procedure != null) {
          dst.procedure = new ArrayList<ProcedureComponent>();
          for (ProcedureComponent i : procedure)
            dst.procedure.add(i.copy());
        };
        dst.patient = patient == null ? null : patient.copy();
        if (coverage != null) {
          dst.coverage = new ArrayList<CoverageComponent>();
          for (CoverageComponent i : coverage)
            dst.coverage.add(i.copy());
        };
        dst.accident = accident == null ? null : accident.copy();
        dst.employmentImpacted = employmentImpacted == null ? null : employmentImpacted.copy();
        dst.hospitalization = hospitalization == null ? null : hospitalization.copy();
        if (item != null) {
          dst.item = new ArrayList<ItemComponent>();
          for (ItemComponent i : item)
            dst.item.add(i.copy());
        };
        dst.total = total == null ? null : total.copy();
        if (missingTeeth != null) {
          dst.missingTeeth = new ArrayList<MissingTeethComponent>();
          for (MissingTeethComponent i : missingTeeth)
            dst.missingTeeth.add(i.copy());
        };
        return dst;
      }

      protected Claim typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof Claim))
          return false;
        Claim o = (Claim) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(type, o.type, true)
           && compareDeep(subType, o.subType, true) && compareDeep(ruleset, o.ruleset, true) && compareDeep(originalRuleset, o.originalRuleset, true)
           && compareDeep(created, o.created, true) && compareDeep(billablePeriod, o.billablePeriod, true)
           && compareDeep(insurer, o.insurer, true) && compareDeep(provider, o.provider, true) && compareDeep(organization, o.organization, true)
           && compareDeep(use, o.use, true) && compareDeep(priority, o.priority, true) && compareDeep(fundsReserve, o.fundsReserve, true)
           && compareDeep(enterer, o.enterer, true) && compareDeep(facility, o.facility, true) && compareDeep(related, o.related, true)
           && compareDeep(prescription, o.prescription, true) && compareDeep(originalPrescription, o.originalPrescription, true)
           && compareDeep(payee, o.payee, true) && compareDeep(referral, o.referral, true) && compareDeep(information, o.information, true)
           && compareDeep(diagnosis, o.diagnosis, true) && compareDeep(procedure, o.procedure, true) && compareDeep(patient, o.patient, true)
           && compareDeep(coverage, o.coverage, true) && compareDeep(accident, o.accident, true) && compareDeep(employmentImpacted, o.employmentImpacted, true)
           && compareDeep(hospitalization, o.hospitalization, true) && compareDeep(item, o.item, true) && compareDeep(total, o.total, true)
           && compareDeep(missingTeeth, o.missingTeeth, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof Claim))
          return false;
        Claim o = (Claim) other;
        return compareValues(status, o.status, true) && compareValues(created, o.created, true) && compareValues(use, o.use, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, type
          , subType, ruleset, originalRuleset, created, billablePeriod, insurer, provider
          , organization, use, priority, fundsReserve, enterer, facility, related, prescription
          , originalPrescription, payee, referral, information, diagnosis, procedure, patient
          , coverage, accident, employmentImpacted, hospitalization, item, total, missingTeeth
          );
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Claim;
   }

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The primary identifier of the financial resource</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Claim.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Claim.identifier", description="The primary identifier of the financial resource", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The primary identifier of the financial resource</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Claim.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>provider</b>
   * <p>
   * Description: <b>Provider responsible for the Claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.provider</b><br>
   * </p>
   */
  @SearchParamDefinition(name="provider", path="Claim.provider", description="Provider responsible for the Claim", type="reference", target={Practitioner.class } )
  public static final String SP_PROVIDER = "provider";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>provider</b>
   * <p>
   * Description: <b>Provider responsible for the Claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.provider</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PROVIDER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PROVIDER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Claim:provider</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PROVIDER = new ca.uhn.fhir.model.api.Include("Claim:provider").toLocked();

 /**
   * Search parameter: <b>use</b>
   * <p>
   * Description: <b>The kind of financial resource</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Claim.use</b><br>
   * </p>
   */
  @SearchParamDefinition(name="use", path="Claim.use", description="The kind of financial resource", type="token" )
  public static final String SP_USE = "use";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>use</b>
   * <p>
   * Description: <b>The kind of financial resource</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Claim.use</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam USE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_USE);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Patient receiving the services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="Claim.patient", description="Patient receiving the services", type="reference", target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Patient receiving the services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Claim:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("Claim:patient").toLocked();

 /**
   * Search parameter: <b>created</b>
   * <p>
   * Description: <b>The creation date for the Claim</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Claim.created</b><br>
   * </p>
   */
  @SearchParamDefinition(name="created", path="Claim.created", description="The creation date for the Claim", type="date" )
  public static final String SP_CREATED = "created";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>created</b>
   * <p>
   * Description: <b>The creation date for the Claim</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Claim.created</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam CREATED = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_CREATED);

 /**
   * Search parameter: <b>insurer</b>
   * <p>
   * Description: <b>The target payor/insurer for the Claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.insurer</b><br>
   * </p>
   */
  @SearchParamDefinition(name="insurer", path="Claim.insurer", description="The target payor/insurer for the Claim", type="reference", target={Organization.class } )
  public static final String SP_INSURER = "insurer";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>insurer</b>
   * <p>
   * Description: <b>The target payor/insurer for the Claim</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.insurer</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam INSURER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_INSURER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Claim:insurer</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_INSURER = new ca.uhn.fhir.model.api.Include("Claim:insurer").toLocked();

 /**
   * Search parameter: <b>organization</b>
   * <p>
   * Description: <b>The reference to the providing organization</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.organization</b><br>
   * </p>
   */
  @SearchParamDefinition(name="organization", path="Claim.organization", description="The reference to the providing organization", type="reference", target={Organization.class } )
  public static final String SP_ORGANIZATION = "organization";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>organization</b>
   * <p>
   * Description: <b>The reference to the providing organization</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.organization</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ORGANIZATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ORGANIZATION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Claim:organization</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ORGANIZATION = new ca.uhn.fhir.model.api.Include("Claim:organization").toLocked();

 /**
   * Search parameter: <b>priority</b>
   * <p>
   * Description: <b>Processing priority requested</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Claim.priority</b><br>
   * </p>
   */
  @SearchParamDefinition(name="priority", path="Claim.priority", description="Processing priority requested", type="token" )
  public static final String SP_PRIORITY = "priority";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>priority</b>
   * <p>
   * Description: <b>Processing priority requested</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Claim.priority</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PRIORITY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PRIORITY);

 /**
   * Search parameter: <b>facility</b>
   * <p>
   * Description: <b>Facility responsible for the goods and services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.facility</b><br>
   * </p>
   */
  @SearchParamDefinition(name="facility", path="Claim.facility", description="Facility responsible for the goods and services", type="reference", target={Location.class } )
  public static final String SP_FACILITY = "facility";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>facility</b>
   * <p>
   * Description: <b>Facility responsible for the goods and services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Claim.facility</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam FACILITY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_FACILITY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Claim:facility</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_FACILITY = new ca.uhn.fhir.model.api.Include("Claim:facility").toLocked();


}

