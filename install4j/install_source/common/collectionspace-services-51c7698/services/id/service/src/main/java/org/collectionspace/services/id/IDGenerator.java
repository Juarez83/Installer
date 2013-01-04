/**	
 * This document is a part of the source code and related artifacts
 * for CollectionSpace, an open source collections management system
 * for museums and related institutions:
 *
 * http://www.collectionspace.org
 * http://wiki.collectionspace.org
 *
 * Copyright © 2009 Regents of the University of California
 *
 * Licensed under the Educational Community License (ECL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the ECL 2.0 License at
 * https://source.collectionspace.org/collection-space/LICENSE.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.collectionspace.services.id;

/**
 * IDGenerator, interface for an IDGenerator, which returns identifiers (IDs).
 *
 * $LastChangedRevision$
 * $LastChangedDate$
 */
public interface IDGenerator {

    /**
     * Returns the current ID.
     *
     * @return  The current ID.
     */
	public String getCurrentID();

    /**
     * Returns a new ID.
     *
     * @return  A new ID.
     */
	public String newID();

    /**
     * Validates a supplied ID against the format of the IDs
     * generated by this ID generator.
     *
     * @param    id    An ID.
     *
     * @return   true if the supplied ID matches the format of the
     *           IDs generated by this ID generator;
     *           false if it does not match that format.
     */
    public boolean isValidID(String id);

    /**
     * Returns a regular expression that can be used to validate the IDs
     * generated by this ID generator. 
     *
     * @return  A regular expression that can be used to validate IDs.
     */
    public String getRegex();

}
