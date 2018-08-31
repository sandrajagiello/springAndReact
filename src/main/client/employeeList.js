import React from 'react';
import {Employee} from 'Employee'

export class EmployeeList extends React.Component{
    render() {
        var employees = this.props.employees.map(employee =>
            <Employee key={employee._links.self.href} employee={employee}/>
        );
        return (
            <table className="table table-striped table-bordered">
                <thead className="thead-dark">
                <tr>
                    <th>#</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Description</th>
                </tr>
                </thead>
                <tbody>
                {employees}
                </tbody>
            </table>
        )
    }
}