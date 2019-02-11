package org.hl7.fhir.r4.model.codesystems;

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

// Generated on Sat, Feb 9, 2019 15:11-0500 for FHIR v4.0.0


import org.hl7.fhir.exceptions.FHIRException;

public enum MedicationdispenseCategory {

        /**
         * Includes dispenses for medications to be administered or consumed in an inpatient or acute care setting.
         */
        INPATIENT, 
        /**
         * Includes dispenses for medications to be administered or consumed in an outpatient setting (for example, Emergency Department, Outpatient Clinic, Outpatient Surgery, Doctor's office).
         */
        OUTPATIENT, 
        /**
         * Includes dispenses for medications to be administered or consumed by the patient in their home (this would include long term care or nursing homes, hospices, etc.).
         */
        COMMUNITY, 
        /**
         * Includes dispenses for medications created when the patient is being released from a facility.
         */
        DISCHARGE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MedicationdispenseCategory fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("inpatient".equals(codeString))
          return INPATIENT;
        if ("outpatient".equals(codeString))
          return OUTPATIENT;
        if ("community".equals(codeString))
          return COMMUNITY;
        if ("discharge".equals(codeString))
          return DISCHARGE;
        throw new FHIRException("Unknown MedicationdispenseCategory code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case INPATIENT: return "inpatient";
            case OUTPATIENT: return "outpatient";
            case COMMUNITY: return "community";
            case DISCHARGE: return "discharge";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://terminology.hl7.org/fhir/CodeSystem/medicationdispense-category";
        }
        public String getDefinition() {
          switch (this) {
            case INPATIENT: return "Includes dispenses for medications to be administered or consumed in an inpatient or acute care setting.";
            case OUTPATIENT: return "Includes dispenses for medications to be administered or consumed in an outpatient setting (for example, Emergency Department, Outpatient Clinic, Outpatient Surgery, Doctor's office).";
            case COMMUNITY: return "Includes dispenses for medications to be administered or consumed by the patient in their home (this would include long term care or nursing homes, hospices, etc.).";
            case DISCHARGE: return "Includes dispenses for medications created when the patient is being released from a facility.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case INPATIENT: return "Inpatient";
            case OUTPATIENT: return "Outpatient";
            case COMMUNITY: return "Community";
            case DISCHARGE: return "Discharge";
            default: return "?";
          }
    }


}

