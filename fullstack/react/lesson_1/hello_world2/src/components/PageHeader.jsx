import React from 'react';

const PageHeader = () => {
    return ( 
        <div className="center my-2">
            <div className="col-12 col-md-8">
                <h1 className="col-12 text-center display-4">Headline</h1>
                <h2 className="fs-5">Sub Headline</h2>

                <select className="form-select" multiple aria-label="multiple select example">
                    <option selected>Open this select menu</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
        </div>
     );
}
 
export default PageHeader;