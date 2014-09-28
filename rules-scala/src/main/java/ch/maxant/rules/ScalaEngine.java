/*
 * Copyright (c) 2011 Ant Kutschera
 * 
 * This file is part of Ant Kutschera's blog.
 * 
 * This is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 * You should have received a copy of the Lesser GNU General Public License
 * along with this software.  If not, see <http://www.gnu.org/licenses/>.
 */
package ch.maxant.rules;

/**
 * This class supports Scala collections being used with the engine.
 * 
 * @see {@link Engine} for more details.  
 */
public class ScalaEngine extends Engine {

	/** @see #Engine(Collection, boolean).  Supports Scala collections. */
	public ScalaEngine(final scala.collection.Iterable<Rule> rules, boolean throwExceptionIfCompilationFails) throws DuplicateNameException, CompileException, ParseException {
	    super(scala.collection.JavaConversions.asJavaCollection(rules), throwExceptionIfCompilationFails);
	}

	/** @see #executeBestAction(Object, Collection), supports Scala collections. */
    public <Input, Output> Output executeBestAction(Input input, scala.collection.Iterable<AbstractAction<Input, Output>> actions) throws NoMatchingRuleFoundException, NoActionFoundException, DuplicateNameException {
        return executeBestAction(input, scala.collection.JavaConversions.asJavaCollection(actions));
    }
    
}

		