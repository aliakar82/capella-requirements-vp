/*******************************************************************************
 * Copyright (c) 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.vp.requirements.importer.transposer.bridge;

import org.eclipse.emf.diffmerge.bridge.api.IBridgeExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingBridge;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.operations.MappingBridgeOperation;
import org.eclipse.emf.diffmerge.impl.scopes.RootedModelScope;
import org.polarsys.capella.common.ef.ExecutionManager;
import org.polarsys.capella.common.ef.command.AbstractReadWriteCommand;
import org.polarsys.capella.common.helpers.TransactionHelper;

/**
 * @author Joao Barata
 */
public class ReqIfMappingBridgeOperation extends MappingBridgeOperation {

	public ReqIfMappingBridgeOperation(Object sourceDataSet,
			Object targetDataSet, IMappingBridge<?, ?> bridge,
			IBridgeExecution execution) {
		super(sourceDataSet, targetDataSet, bridge, execution);
	}

	@Override
	protected void handleBridge(final IMappingBridge<?, ?> bridge,
			final MappingExecution execution, final Object sourceDataSet,
			final Object targetDataSet) {
		ExecutionManager manager = TransactionHelper
				.getExecutionManager(((RootedModelScope) targetDataSet)
						.getContents());
		if (manager != null) {
			manager.execute(new AbstractReadWriteCommand() {
				@Override
				public void run() {

					ReqIfMappingBridgeOperation.super.handleBridge(bridge,
							execution, sourceDataSet, targetDataSet);
				}
			});
		}
	}
}