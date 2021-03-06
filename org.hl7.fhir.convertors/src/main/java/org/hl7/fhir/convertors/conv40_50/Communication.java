package org.hl7.fhir.convertors.conv40_50;

import org.hl7.fhir.exceptions.FHIRException;

import org.hl7.fhir.convertors.VersionConvertor_40_50;


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

// Generated on Sun, Feb 24, 2019 11:37+1100 for FHIR v4.0.0


public class Communication extends VersionConvertor_40_50 {

  public static org.hl7.fhir.r5.model.Communication convertCommunication(org.hl7.fhir.r4.model.Communication src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Communication tgt = new org.hl7.fhir.r5.model.Communication();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.r4.model.CanonicalType t : src.getInstantiatesCanonical())
      tgt.getInstantiatesCanonical().add(convertCanonical(t));
    for (org.hl7.fhir.r4.model.UriType t : src.getInstantiatesUri())
      tgt.getInstantiatesUri().add(convertUri(t));
    for (org.hl7.fhir.r4.model.Reference t : src.getBasedOn())
      tgt.addBasedOn(convertReference(t));
    for (org.hl7.fhir.r4.model.Reference t : src.getPartOf())
      tgt.addPartOf(convertReference(t));
    for (org.hl7.fhir.r4.model.Reference t : src.getInResponseTo())
      tgt.addInResponseTo(convertReference(t));
    if (src.hasStatus())
      tgt.setStatus(convertCommunicationStatus(src.getStatus()));
    if (src.hasStatusReason())
      tgt.setStatusReason(convertCodeableConcept(src.getStatusReason()));
    for (org.hl7.fhir.r4.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    if (src.hasPriority())
      tgt.setPriority(convertCommunicationPriority(src.getPriority()));
    for (org.hl7.fhir.r4.model.CodeableConcept t : src.getMedium())
      tgt.addMedium(convertCodeableConcept(t));
    if (src.hasSubject())
      tgt.setSubject(convertReference(src.getSubject()));
    if (src.hasTopic())
      tgt.setTopic(convertCodeableConcept(src.getTopic()));
    for (org.hl7.fhir.r4.model.Reference t : src.getAbout())
      tgt.addAbout(convertReference(t));
    if (src.hasEncounter())
      tgt.setEncounter(convertReference(src.getEncounter()));
    if (src.hasSent())
      tgt.setSentElement(convertDateTime(src.getSentElement()));
    if (src.hasReceived())
      tgt.setReceivedElement(convertDateTime(src.getReceivedElement()));
    for (org.hl7.fhir.r4.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    if (src.hasSender())
      tgt.setSender(convertReference(src.getSender()));
    for (org.hl7.fhir.r4.model.CodeableConcept t : src.getReasonCode())
      tgt.addReasonCode(convertCodeableConcept(t));
    for (org.hl7.fhir.r4.model.Reference t : src.getReasonReference())
      tgt.addReasonReference(convertReference(t));
    for (org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent t : src.getPayload())
      tgt.addPayload(convertCommunicationPayloadComponent(t));
    for (org.hl7.fhir.r4.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Communication convertCommunication(org.hl7.fhir.r5.model.Communication src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Communication tgt = new org.hl7.fhir.r4.model.Communication();
    copyDomainResource(src, tgt);
    for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(convertIdentifier(t));
    for (org.hl7.fhir.r5.model.CanonicalType t : src.getInstantiatesCanonical())
      tgt.getInstantiatesCanonical().add(convertCanonical(t));
    for (org.hl7.fhir.r5.model.UriType t : src.getInstantiatesUri())
      tgt.getInstantiatesUri().add(convertUri(t));
    for (org.hl7.fhir.r5.model.Reference t : src.getBasedOn())
      tgt.addBasedOn(convertReference(t));
    for (org.hl7.fhir.r5.model.Reference t : src.getPartOf())
      tgt.addPartOf(convertReference(t));
    for (org.hl7.fhir.r5.model.Reference t : src.getInResponseTo())
      tgt.addInResponseTo(convertReference(t));
    if (src.hasStatus())
      tgt.setStatus(convertCommunicationStatus(src.getStatus()));
    if (src.hasStatusReason())
      tgt.setStatusReason(convertCodeableConcept(src.getStatusReason()));
    for (org.hl7.fhir.r5.model.CodeableConcept t : src.getCategory())
      tgt.addCategory(convertCodeableConcept(t));
    if (src.hasPriority())
      tgt.setPriority(convertCommunicationPriority(src.getPriority()));
    for (org.hl7.fhir.r5.model.CodeableConcept t : src.getMedium())
      tgt.addMedium(convertCodeableConcept(t));
    if (src.hasSubject())
      tgt.setSubject(convertReference(src.getSubject()));
    if (src.hasTopic())
      tgt.setTopic(convertCodeableConcept(src.getTopic()));
    for (org.hl7.fhir.r5.model.Reference t : src.getAbout())
      tgt.addAbout(convertReference(t));
    if (src.hasEncounter())
      tgt.setEncounter(convertReference(src.getEncounter()));
    if (src.hasSent())
      tgt.setSentElement(convertDateTime(src.getSentElement()));
    if (src.hasReceived())
      tgt.setReceivedElement(convertDateTime(src.getReceivedElement()));
    for (org.hl7.fhir.r5.model.Reference t : src.getRecipient())
      tgt.addRecipient(convertReference(t));
    if (src.hasSender())
      tgt.setSender(convertReference(src.getSender()));
    for (org.hl7.fhir.r5.model.CodeableConcept t : src.getReasonCode())
      tgt.addReasonCode(convertCodeableConcept(t));
    for (org.hl7.fhir.r5.model.Reference t : src.getReasonReference())
      tgt.addReasonReference(convertReference(t));
    for (org.hl7.fhir.r5.model.Communication.CommunicationPayloadComponent t : src.getPayload())
      tgt.addPayload(convertCommunicationPayloadComponent(t));
    for (org.hl7.fhir.r5.model.Annotation t : src.getNote())
      tgt.addNote(convertAnnotation(t));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.Communication.CommunicationStatus convertCommunicationStatus(org.hl7.fhir.r4.model.Communication.CommunicationStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PREPARATION: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.PREPARATION;
    case INPROGRESS: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.INPROGRESS;
    case NOTDONE: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.NOTDONE;
    case ONHOLD: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.ONHOLD;
    case STOPPED: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.STOPPED;
    case COMPLETED: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.ENTEREDINERROR;
    case UNKNOWN: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.UNKNOWN;
    default: return org.hl7.fhir.r5.model.Communication.CommunicationStatus.NULL;
  }
}

  public static org.hl7.fhir.r4.model.Communication.CommunicationStatus convertCommunicationStatus(org.hl7.fhir.r5.model.Communication.CommunicationStatus src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case PREPARATION: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.PREPARATION;
    case INPROGRESS: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.INPROGRESS;
    case NOTDONE: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.NOTDONE;
    case ONHOLD: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.ONHOLD;
    case STOPPED: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.STOPPED;
    case COMPLETED: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.COMPLETED;
    case ENTEREDINERROR: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.ENTEREDINERROR;
    case UNKNOWN: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.UNKNOWN;
    default: return org.hl7.fhir.r4.model.Communication.CommunicationStatus.NULL;
  }
}

  public static org.hl7.fhir.r5.model.Communication.CommunicationPriority convertCommunicationPriority(org.hl7.fhir.r4.model.Communication.CommunicationPriority src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.r5.model.Communication.CommunicationPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.r5.model.Communication.CommunicationPriority.URGENT;
    case ASAP: return org.hl7.fhir.r5.model.Communication.CommunicationPriority.ASAP;
    case STAT: return org.hl7.fhir.r5.model.Communication.CommunicationPriority.STAT;
    default: return org.hl7.fhir.r5.model.Communication.CommunicationPriority.NULL;
  }
}

  public static org.hl7.fhir.r4.model.Communication.CommunicationPriority convertCommunicationPriority(org.hl7.fhir.r5.model.Communication.CommunicationPriority src) throws FHIRException {
    if (src == null)
      return null;
    switch (src) {
    case ROUTINE: return org.hl7.fhir.r4.model.Communication.CommunicationPriority.ROUTINE;
    case URGENT: return org.hl7.fhir.r4.model.Communication.CommunicationPriority.URGENT;
    case ASAP: return org.hl7.fhir.r4.model.Communication.CommunicationPriority.ASAP;
    case STAT: return org.hl7.fhir.r4.model.Communication.CommunicationPriority.STAT;
    default: return org.hl7.fhir.r4.model.Communication.CommunicationPriority.NULL;
  }
}

  public static org.hl7.fhir.r5.model.Communication.CommunicationPayloadComponent convertCommunicationPayloadComponent(org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Communication.CommunicationPayloadComponent tgt = new org.hl7.fhir.r5.model.Communication.CommunicationPayloadComponent();
    copyElement(src, tgt);
    if (src.hasContent())
      tgt.setContent(convertType(src.getContent()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent convertCommunicationPayloadComponent(org.hl7.fhir.r5.model.Communication.CommunicationPayloadComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent tgt = new org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent();
    copyElement(src, tgt);
    if (src.hasContent())
      tgt.setContent(convertType(src.getContent()));
    return tgt;
  }


}
